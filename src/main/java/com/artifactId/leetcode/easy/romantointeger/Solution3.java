package com.artifactId.leetcode.easy.romantointeger;

public class Solution3 implements SolutionInterface {

  /**
   * Runtime: 3 ms, faster than 100.00% of Java online submissions for Roman to Integer.
   * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Roman to Integer.
   * 
   */

  @Override
  public int romanToInt(String s) {

    char[] chars = s.toCharArray();
    int result = 0;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c == 'M') {
        result += get(c);
      } else {
        int current = get(c);
        if (i+1 < chars.length && get(chars[i+1]) > current) {
          result-=current;
        } else {
          result += current;
        }
      }
    }

    return result;
  }

  private int get(char digit) {
    switch (digit) {
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default: return 0;
    }
  }

}
