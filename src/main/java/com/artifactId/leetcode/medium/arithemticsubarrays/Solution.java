package com.artifactId.leetcode.medium.arithemticsubarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Runtime: 14 ms, faster than 93.43% of Java online submissions for Arithmetic Subarrays.
 * Memory Usage: 39.8 MB, less than 45.06% of Java online submissions for Arithmetic Subarrays.
 */
public class Solution {

  public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    List<Boolean> answer = new ArrayList<>(l.length);
    for (int i = 0; i < l.length; i++) {
      answer.add(isArithmetic(nums, l[i], r[i]));
    }

    return answer;
  }

  private Boolean isArithmetic(int[] nums, int l, int r) {
    int[] ints = Arrays.copyOfRange(nums, l, r + 1);
    if (ints.length < 3) {
      return true;
    }

    Arrays.sort(ints);
    int diff = ints[1] - ints[0];
    for (int i = 0; i < ints.length - 1; i++) {
      if (ints[i +1] - ints[i] != diff) {
        return false;
      }
    }

    return true;
  }


}
