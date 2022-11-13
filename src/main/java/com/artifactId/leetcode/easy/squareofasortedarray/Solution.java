package com.artifactId.leetcode.easy.squareofasortedarray;

/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of texteditor Sorted Array.
 * Memory Usage: 41.1 MB, less than 55.11% of Java online submissions for Squares of texteditor Sorted Array.
 */

public class Solution {

  public int[] sortedSquares(int[] nums) {
    if (nums.length == 0) {
      return nums;
    }

    int[] ans = new int[nums.length];
    int start = 0;
    int end = nums.length - 1;
    int k = ans.length - 1;
    while (start != end) {
      int startVal = Math.abs(nums[start]);
      int endVal = Math.abs(nums[end]);

      int val =  startVal;
      if (startVal > endVal) {
        start++;
      } else {
        val = endVal;
        end--;

      }

      ans[k--] = val * val;
    }

    ans[0] = nums[start] * nums[start];
    return ans;
  }

}
