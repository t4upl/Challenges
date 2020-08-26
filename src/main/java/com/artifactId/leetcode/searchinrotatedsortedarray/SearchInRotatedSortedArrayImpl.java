package com.artifactId.leetcode.searchinrotatedsortedarray;

import static java.util.Arrays.binarySearch;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
 * Memory Usage: 39.8 MB, less than 15.73% of Java online submissions for Search in Rotated Sorted Array.
 */
public class SearchInRotatedSortedArrayImpl implements SearchInRotatedSortedArray {

  @Override
  public int search(int[] nums, int target) {
    int start = 0;
    int end  = nums.length - 1;
    return Math.max(search(nums, target, start, end), -1);
  }

  int search(int[] nums, int target, int start, int end) {
    if (nums.length==0) {
      return -1;
    }

    int mid = (start + end) /2;

    if (nums[start] <=  nums[mid] &&  nums[mid] <= nums[end] || start == end) {
      return binarySearch(nums, start, end + 1, target);
    }

    if (nums[start] <= nums[mid]) {
      return Math.max(binarySearch(nums, start, mid + 1, target), search(nums, target, mid + 1, end));
    }

    return Math.max(search(nums, target, start, mid), binarySearch(nums, mid + 1, end + 1, target));
  }

}
