package com.artifactId.leetcode.combinationsum3;

import java.util.LinkedList;
import java.util.List;

/**
 * Runtime: 1 ms, faster than 42.27% of Java online submissions for Combination Sum III.
 * Memory Usage: 37.9 MB, less than 30.48% of Java online submissions for Combination Sum III.
 */
public class Solution {

  private int requiredNumberOfElements;
  private List<List<Integer>> result = new LinkedList<>();
  private static final int max = 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1;


  public List<List<Integer>> combinationSum3(int k, int n) {
    if (n > max) {
      return new LinkedList<>();
    }

    this.requiredNumberOfElements = k;
    List<Integer> tempList = new LinkedList<>();
    combinationSum3(n, tempList);
    return result;
  }

  private void combinationSum3(int sumRemaining, List<Integer> tempList) {
    if (sumRemaining < 0) {
      return;
    }

    if (sumRemaining == 0 && tempList.size() == requiredNumberOfElements) {
      result.add(tempList);
      return;
    }

    for (int i = 1; i < 10; i++) {
      if (!tempList.isEmpty() && i <= tempList.get(tempList.size() - 1)) {
        continue;
      }

      List<Integer> newTempList = new LinkedList<>(tempList);
      newTempList.add(i);
      combinationSum3(sumRemaining - i, newTempList);
    }

  }

}
