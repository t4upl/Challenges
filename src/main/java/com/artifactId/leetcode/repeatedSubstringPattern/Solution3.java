package com.artifactId.leetcode.repeatedSubstringPattern;

import java.util.regex.Pattern;

/**
 * Success
 * Details
 * Runtime: 41 ms, faster than 29.36% of Java online submissions for Repeated Substring Pattern.
 * Memory Usage: 38 MB, less than 100.00% of Java online submissions for Repeated Substring Pattern.
 */
public class Solution3 implements SolutionInterface {

  @Override
  public boolean repeatedSubstringPattern(String s) {
    String regex = "(\\S+)\\1+";
    return Pattern.matches(regex, s);
  }
}
