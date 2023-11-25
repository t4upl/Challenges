package com.artifactId.random.bny.sip2024;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Task6 {

    public static List<Integer> sort(List<Integer> items) {
        Map<Integer, Long> frequency = items.stream().collect(Collectors.groupingBy(Function.identity(), counting()));
        Comparator<Integer> objectComparator = Comparator.comparing((Integer key) -> frequency.get(key)).thenComparing(Comparator.comparing((Integer x) -> x));
        return items.stream().sorted(objectComparator).collect(Collectors.toList());
    }
}
