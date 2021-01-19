package com.artifactId.leetcode.medium.longestplaindromicsubstring;

/**
 * Runtime: 13 ms, faster than 95.98% of Java online submissions for Longest Palindromic Substring.
 * Memory Usage: 39 MB, less than 83.17% of Java online submissions for Longest Palindromic Substring.
 */
public class Solution {

  private int max = 0;
  private int maxStartIndex = 0;

  public String longestPalindrome(String s) {
    if (s.length() < 2) {
      return s;
    }

    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      longest(i, i, chars);

      if (i != chars.length - 1) {
        longest(i, i + 1, chars);
      }
    }

    return s.substring(maxStartIndex, maxStartIndex + max);
  }

  private void longest(int start, int end, char[] chars) {
    if (chars[start] != chars[end]) {
      return;
    }

    checkMax(start, end);
    while (start - 1 > -1 && end + 1 < chars.length && chars[start] == chars[end]) {
      if (chars[start - 1] == chars[end + 1]) {
        checkMax(start - 1, end + 1);
        start--;
        end++;
      } else {
        break;
      }
    }
  }

  private void checkMax(int start, int end) {
    int palindromeLength = end - start + 1;
    if (max < palindromeLength) {
      max = palindromeLength;
      maxStartIndex = start;
    }
  }

}
