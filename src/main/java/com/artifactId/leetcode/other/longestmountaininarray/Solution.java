package com.artifactId.leetcode.other.longestmountaininarray;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime: 3 ms, faster than 30.78% of Java online submissions for Longest Mountain in Array.
 * Memory Usage: 40.1 MB, less than 57.67% of Java online submissions for Longest Mountain in Array.
 */
public class Solution {

  public int longestMountain(int[] A) {
    if (A.length < 3) {
      return 0;
    }

    List<Integer> tops = new ArrayList<>();
    for (int i = 1; i < A.length - 1; i++) {
      if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
        tops.add(i);
      }
    }

    int result = 0;
    for (Integer top : tops) {
      result = Math.max(result, getMountainRange(top, A));
    }

    return result;

  }

  private int getMountainRange(Integer top, int[] A) {
    int leftIndex = getLeftIndex(top, A);
    int rightIndex = getRightIndex(top, A);
    return rightIndex - leftIndex + 1;
  }

  private int getRightIndex(Integer top, int[] A) {
    while (A[top] > A[ top + 1]) {
      top++;
      if (top + 1 == A.length) {
        return A.length - 1;
      }
    }
    return top;
  }

  private int getLeftIndex(Integer top, int[] A) {
    while (A[top] > A[ top - 1]) {
      top--;
      if (top - 1 < 0) {
        return 0;
      }
    }
    return top;
  }


}

