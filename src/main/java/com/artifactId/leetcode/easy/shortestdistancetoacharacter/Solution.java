package com.artifactId.leetcode.easy.shortestdistancetoacharacter;

/**
 * Runtime: 1 ms, faster than 96.80% of Java online submissions for Shortest Distance to texteditor Character.
 * Memory Usage: 39.2 MB, less than 52.48% of Java online submissions for Shortest Distance to texteditor Character.
 */
public class Solution {

  public int[] shortestToChar(String s, char c) {
    int[] ans = new int[s.length()];
    char[] chars = s.toCharArray();
    int prev =-1;
    for (int i = 0; i < chars.length; i++) {
      char aChar = chars[i];
      if (aChar == c) {
        prev = i;
        continue;
      }

      if (prev != -1) {
        ans[i] = i - prev;
      }
    }

    prev = -1;
    for (int i = 0; i < chars.length; i++) {
      int index = chars.length - i - 1;
      char aChar = chars[index];
      if (aChar == c) {
        prev = index ;
        continue;
      }

      int diff = prev - index;
      if (ans[index]  == 0 && prev != -1) {
        ans[index] = diff;
        continue;
      }

      if (prev != -1) {
        ans[index] = Math.min(ans[index], diff);
      }
    }


    return ans;
  }

}
