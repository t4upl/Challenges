package com.artifactId.leetcode.easy.kthmissingpositivenumber;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Missing Positive Number.
 * Memory Usage: 38.5 MB, less than 72.95% of Java online submissions for Kth Missing Positive Number.
 */
public class Solution {

  public int findKthPositive(int[] arr, int k) {
    if (k < arr[0]) {
      return k;
    }

    k = k - (arr[0] - 1);
    for (int i = 0; i < arr.length - 1; i++) {
      int diff = arr[i+1] - arr[i] - 1;
      int newK = k - diff;
      if (newK > 0) {
        k = newK;
      } else {
        return arr[i] + k;
      }
    }
    
    return arr[arr.length - 1] + k;
  }

}
