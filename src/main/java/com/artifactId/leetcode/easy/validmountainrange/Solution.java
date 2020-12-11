package com.artifactId.leetcode.easy.validmountainrange;

/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
 * Memory Usage: 40.3 MB, less than 34.46% of Java online submissions for Valid Mountain Array.
 */
public class Solution {

  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3) {
      return false;
    }

    if (arr[1] <= arr[0]) {
      return false;
    }

    boolean rise =  true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i+1]) {
        return false;
      }

      if (rise) {
        if (arr[i + 1] < arr[i]) {
          rise = false;
        }
      } else {
        if (arr[i + 1] > arr[i]) {
          return false;
        }
      }
    }

    return !rise;
  }

}
