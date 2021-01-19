package com.artifactId.leetcode.medium.maxnumberofksumpairs;

import java.util.Arrays;

/**
 * Runtime: 16 ms, faster than 98.44% of Java online submissions for Max Number of K-Sum Pairs.
 * Memory Usage: 48.4 MB, less than 88.85% of Java online submissions for Max Number of K-Sum Pairs.
 */
public class Solution {

  public int maxOperations(int[] nums, int k) {
    if (nums.length == 0) {
      return 0;
    }

    int start = 0;
    int end = nums.length - 1;
    int ans = 0;

    Arrays.sort(nums);
    while (start < end) {
      int diff = nums[start] + nums[end];
      if (diff == k) {
        start++;
        end--;
        ans++;
        continue;
      }

      if (diff < k) {
        start++;
        continue;
      }

      end--;
    }

    return ans;
  }

}
