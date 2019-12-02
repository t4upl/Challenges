package com.artifactId.leetcode.isLongPressedName;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Time Limit Exceeded
 */
public class Solution implements SolutionInterface {

  @Override
  public boolean isLongPressedName(String name, String typed) {

    char[] chars = name.toCharArray();
    String regex = IntStream.range(0, chars.length).mapToObj(i -> "(" + chars[i] + ")+").collect(
      Collectors.joining());
    return Pattern.matches(regex, typed);
  }

  public String foo(char c) {
    return "" + c;
  }
}

