package com.artifactId.leetcode.repeatedSubstringPattern;

public class Solution {
  public boolean repeatedSubstringPattern(String s) {
    if (s.length() < 2) {
      return false;
    }

    int substringEndIndex = 1;
    String repeatedSubstring = s.substring(0, substringEndIndex);

    while (substringEndIndex < s.length()) {
      int subStringLength = substringEndIndex;
      int beginingOfOtherSubstring = substringEndIndex;
      int endOfOtherSubstring = beginingOfOtherSubstring + subStringLength;

      if (endOfOtherSubstring > s.length()) {
        return false;
      }

      String substring = s.substring(beginingOfOtherSubstring, endOfOtherSubstring);
      while (substring.equals(repeatedSubstring)) {
        beginingOfOtherSubstring += subStringLength;
        if (beginingOfOtherSubstring == s.length()) {
          return true;
        }

        if (beginingOfOtherSubstring + subStringLength > s.length()) {
          break;
        }

        substring = s.substring(beginingOfOtherSubstring, beginingOfOtherSubstring + subStringLength);
      }

      substringEndIndex = beginingOfOtherSubstring + 1;
      repeatedSubstring = s.substring(0, substringEndIndex );
    }

    return false;
  }

}
