package com.artifactId.challengerocket.y2022.pzu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class InsuranceServiceGrouping {

  Map<String, String[]> processFile(InputStream inputStream) {
    Predicate<String> filter = line -> (line.length() < 4 || !line.substring(0, 4).equals("SKIP")) && line.trim().length() > 0;

    Function<String, String[]> mapper = line -> Arrays.stream(line.split(";")).toArray(String[]::new);

    Collector<String[], ?, Map<String, String[]>> collector;

    collector = new MyCollector();

    StreamProcessor processor = new StreamProcessor.StreamProcessorBuilder()
      .filter(filter)
      .mapper(mapper)
      .collector(collector).build();

    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    return processFile(bufferedReader, processor);
  }

  private Function<String[], String[]> toArraySkipFirst() {
    return elem -> Arrays.stream(elem).skip(1).map(x -> x.trim().toLowerCase()).toArray(String[]::new);
  }

  Map<String, String[]> processFile(BufferedReader bufferedReader, StreamProcessor processor) {
    return bufferedReader.lines()
      .peek(System.out::println)
      .filter(processor.getFilter())
      .map(processor.getMapper())
      .peek(x -> System.out.println(Arrays.toString(x)))
      .collect(processor.getCollector());
  }

  class MyCollector implements Collector<String[], Map<String, String[]>, Map<String, String[]>> {


    @Override
    public Supplier<Map<String, String[]>> supplier() {
      return HashMap::new;
    }

    @Override
    public BiConsumer<Map<String, String[]>, String[]> accumulator() {
      return (map, arr) -> {
        String key = arr[0].trim().toLowerCase();
        map.putIfAbsent(key, new String[0]);
        String[] strings = Stream.concat(Arrays.stream(map.get(key)), Arrays.stream(arr).skip(1))
          .map(x -> x.trim().toLowerCase())
          .distinct()
          .toArray(String[]::new);
        map.put(key, strings);
      };
    }

    @Override
    public BinaryOperator<Map<String, String[]>> combiner() {
      return null;
    }

    @Override
    public Function<Map<String, String[]>, Map<String, String[]>> finisher() {
      return x-> x;
    }

    @Override
    public Set<Characteristics> characteristics() {
      return new HashSet<>();
    }
  }

}

class StreamProcessor {
  private final Predicate<String> filter;
  private final Function<String, String[]> mapper;
  private final Collector<String[], ?, Map<String, String[]>> collector;

  StreamProcessor() {
    this.filter = null;
    this.mapper = null;
    this.collector = null;
  }

  StreamProcessor(StreamProcessorBuilder builder) {
    this.filter = builder.filter;
    this.mapper = builder.mapper;
    this.collector = builder.collector;
  }

  public static class StreamProcessorBuilder {
    private Predicate<String> filter;
    private Function<String, String[]> mapper;
    private Collector<String[], ?, Map<String, String[]>> collector;

    StreamProcessorBuilder filter(Predicate<String> filter) {
      this.filter = filter;
      return this;
    }

    StreamProcessorBuilder mapper(Function<String, String[]> mapper) {
      this.mapper = mapper;
      return this;
    }

    StreamProcessorBuilder collector(Collector<String[], ?, Map<String, String[]>> collector) {
      this.collector = collector;
      return this;
    }

    StreamProcessor build() {
      return new StreamProcessor(this);
    }
  }

  Predicate<String> getFilter() {
    return filter;
  }

  Function<String, String[]> getMapper() {
    return mapper;
  }

  Collector<String[], ?, Map<String, String[]>> getCollector() {
    return collector;
  }

}