package com.artifactId.leetcode.medium.smalleststringwithagivennumericvalue;

/**
 * Runtime: 29 ms, faster than 39.61% of Java online submissions for Smallest String With A Given Numeric Value.
 * Memory Usage: 39.1 MB, less than 59.80% of Java online submissions for Smallest String With A Given Numeric Value.
 */
public class Solution {

  public String getSmallestString(int n, int k) {
    StringBuilder stringBuilder = new StringBuilder();

    k -= n;
    int numberOfZs = k / 25;
    int firstLetter = k - numberOfZs * 25;
    for (int i = 0; i < n; i++) {
      char c = 'a';
      if (i == n - numberOfZs - 1) {
        c = (char) ((int) c + firstLetter);
      }

      if (i > n - numberOfZs - 1) {
        c = 'z';
      }

      stringBuilder.append(c);
    }

    return stringBuilder.toString();
  }

}
