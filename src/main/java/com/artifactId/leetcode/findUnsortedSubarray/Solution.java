package com.artifactId.leetcode.findUnsortedSubarray;

import java.util.Arrays;

/**
 * Runtime: 7 ms, faster than 55.34% of Java online submissions for Shortest Unsorted Continuous Subarray.
 * Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Shortest Unsorted Continuous Subarray.
 */
public class Solution implements SolutionInterface{

  @Override
  public int findUnsortedSubarray(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }


    int left = -1;
    int right = -2;

    int newLength = nums.length;
    int[] copiedArray = Arrays.copyOf(nums, newLength);
    Arrays.sort(copiedArray);

    for (int i=0; i< copiedArray.length; i++) {
      if (nums[i] != copiedArray[i]) {
        if (left == -1) {
          left = i;
        }
        right = i;
      }
    }

    return right - left + 1;
  }

}
