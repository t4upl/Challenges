package com.artifactId.challengerocket.dynatrace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Security {

  public static void main(String[] args) {
    solve();
  }


  public static String solve() {
    String LOG_FILE = "dynatrace.log";
    String data = "";

    String fileName = "C:\\Users\\Administrator\\Desktop\\dynatrace_example.log";

    Map<String, Integer> map = new HashMap<>();
    map.put("57.48.9.100", 0);
    map.put("2.21.107.254", 0);
    map.put("130.25.179.252", 0);

    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data2 = myReader.nextLine();
        System.out.println(data2);
        foo(data2, "57.48.9.100", map);
        foo(data2, "2.21.107.254", map);
        foo(data2, "130.25.179.252", map);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    System.out.println(map);

    String collect = map.entrySet().stream()
      .sorted(Comparator.comparing(x -> x.getValue(), Comparator.reverseOrder()))
      .map(x -> x.getKey() + "=" + x.getValue())
      .collect(Collectors.joining(", ", "{", "}"));

    return collect;
  }

  static void foo(String src, String term, Map<String, Integer> map) {
    if (src.contains(term)) {
      map.put(term, map.get(term) + 1);
    }
  }

}
