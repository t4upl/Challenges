package com.artifactId.leetcode.repeatedSubstringPattern;

/**
 * Time Limit Exceeded
 */
public class Solution2 implements SolutionInterface {
  public boolean repeatedSubstringPattern(String s) {
    for (int i=0; i < s.length()/2 + 1; i++) {
      if (s.replace(s.substring(0, i),"").length() == 0) {
        return true;
      }
    }
    return false;
  }


}
