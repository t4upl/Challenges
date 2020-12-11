package com.artifactId.leetcode.medium.removeduplicatesfromsortedarraytwo;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array II.
 * Memory Usage: 39.4 MB, less than 18.63% of Java online submissions for Remove Duplicates from Sorted Array II.
 */
public class Solution {

  private int newArrIndex = 0;

  public int removeDuplicates(int[] nums) {
    if (nums.length < 3) {
      return nums.length;
    }

    int prvVal = nums[0];
    int numberOfOccurences = 1;
    for (int i = 1; i < nums.length; i++) {
      int val = nums[i];
      if (prvVal == val) {
        numberOfOccurences++;
      } else {
        reorderArr(nums, prvVal, numberOfOccurences);
        prvVal = val;
        numberOfOccurences = 1;
      }
    }

    reorderArr(nums, prvVal, numberOfOccurences);
    return newArrIndex;
  }

  private void reorderArr(int[] nums, int prvVal, int numberOfOccurences) {
    nums[newArrIndex++] = prvVal;
    if (numberOfOccurences > 1) {
      nums[newArrIndex++] = prvVal;
    }
  }

}
