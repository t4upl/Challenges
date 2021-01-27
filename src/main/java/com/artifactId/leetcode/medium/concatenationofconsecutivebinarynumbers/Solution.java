package com.artifactId.leetcode.medium.concatenationofconsecutivebinarynumbers;

/**
 * Runtime: 82 ms, faster than 87.82% of Java online submissions for Concatenation of Consecutive Binary Numbers.
 * Memory Usage: 35.5 MB, less than 96.32% of Java online submissions for Concatenation of Consecutive Binary Numbers.
 */
public class Solution {

  public int concatenatedBinary(int n) {
    int powerOfTwoCountCounter = 0;
    int binaryLength = 2;
    int countOfTwoCount = 2;
    long ans = 1;
    long rem = (long)Math.pow(10, 9) + 7;
    for (int i = 2; i < n + 1; i++) {
      ans  = ((ans << binaryLength) + i) % rem ;
      powerOfTwoCountCounter++;
      if (powerOfTwoCountCounter == countOfTwoCount) {
        powerOfTwoCountCounter = 0;
        countOfTwoCount = countOfTwoCount * 2;
        binaryLength++;
      }
    }

    return (int)ans;
  }

}
