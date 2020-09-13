package com.artifactId.leetcode.maximumproductsubarray;

/**
 * Runtime: 3 ms, faster than 24.91% of Java online submissions for Maximum Product Subarray.
 * Memory Usage: 40.9 MB, less than 5.11% of Java online submissions for Maximum Product Subarray.
 */
public class Solution {

  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max = 1;
    int min = 1;
    int resultMax = Integer.MIN_VALUE;

    for (int currentNumber : nums) {
      int newMax = getNewMax(currentNumber, max * currentNumber, min * currentNumber);
      min = getNewMin(currentNumber, max * currentNumber, min * currentNumber);
      resultMax = Math.max(resultMax, newMax);
      max = newMax;
    }

    return resultMax;
  }

  private int getNewMax(int currentNumber, int maxTimesCurrentNumber, int minTimesCurrentNumber) {
    return Math.max(currentNumber, Math.max(maxTimesCurrentNumber, minTimesCurrentNumber));
  }

  private int getNewMin(int currentNumber, int maxTimesCurrentNumber, int minTimesCurrentNumber) {
    return Math.min(currentNumber, Math.min(maxTimesCurrentNumber, minTimesCurrentNumber));
  }

}
