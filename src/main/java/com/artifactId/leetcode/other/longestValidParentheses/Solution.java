package com.artifactId.leetcode.other.longestValidParentheses;

/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Valid Parentheses.
 * Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Longest Valid Parentheses.
 */
public class Solution implements SolutionInterface {

  int left = 0;
  int right = 0;
  int longest = 0;

  @Override
  public int longestValidParentheses(String s) {
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      getCurr(chars[i], true);
    }

    reset();
    for (int i = chars.length - 1; i > -1; i--) {
      getCurr(chars[i], false);
    }

      return longest;
    }

  private void getCurr(char aChar, boolean leftToRight) {
    if (aChar == '(') {
      left++;
    } else {
      right++;
    }

    if (left == right) {
      int curr = leftToRight ? right * 2 : left * 2;
      longest = Math.max(longest, curr);
    } else {

      if (leftToRight && right > left) {
        reset();
      }

      if (!leftToRight && right < left) {
        reset();
      }

    }
  }

  private void reset() {
    left = 0;
    right = 0;
  }
}