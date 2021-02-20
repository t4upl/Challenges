package com.artifactId.leetcode.medium.arithmeticslices;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Arithmetic Slices.
 * Memory Usage: 36.6 MB, less than 91.05% of Java online submissions for Arithmetic Slices.
 */
public class Solution {

  public int numberOfArithmeticSlices(int[] A) {
    int ans  = 0;
    for (int i = 0; i < A.length;) {
      int sliceLength = getSliceLength(A, i);
      if (sliceLength == 0) {
        break;
      }

      ans += getNumberOfSlices(sliceLength);
      i += sliceLength - 1;
    }

    return ans;
  }

  private int getNumberOfSlices(int sliceLength) {
    double average = (double)(1 + (sliceLength - 2)) / 2;
    return (int) (average * (sliceLength - 2));
  }

  private int getSliceLength(int[] a, int i) {
    if (i == a.length - 1) {
      return 0;
    }

    int diff = a[i+1] - a[i];
    int length = 1;
    while (i+1 < a.length && a[i+1] - a[i] == diff) {
      length++;
      i++;
    }

    return length;
  }

}
