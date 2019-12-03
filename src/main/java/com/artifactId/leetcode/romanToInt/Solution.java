package com.artifactId.leetcode.romanToInt;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution implements SolutionInterface {

  @Override
  public int romanToInt(String s) {
    Map<Character, Integer> map = Stream.of(new Object[][] {
      { 'I', 1 },
      { 'V', 5 },
      { 'X', 10 },
      { 'L', 50 },
      { 'C', 100 },
      { 'D', 500 },
      { 'M', 1000 }
    }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

    char[] chars = s.toCharArray();
    int result = 0;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c == 'M') {
        result += map.get(c);
      } else {
        int current = map.get(c);
        if (i+1 < chars.length && map.get(chars[i+1]) > current) {
          result-=current;
        } else {
          result += current;
        }
      }
    }

    return result;
  }
}
