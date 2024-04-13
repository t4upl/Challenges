package com.artifactId.leetcode.easy.binarysearchtree;

import java.util.Arrays;

public class Solution {

    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length -1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length -1;
        int foundValue = -1;

        while (foundValue == -1) {
            int midIndex  = (start + end) /2;
            if (nums[midIndex] == target) {
                foundValue = midIndex;
                break;
            }

            if (nums[midIndex] > target) {
                end = midIndex - 1;
            } else {
                start = midIndex + 1;
            }

            if (start == end) {
                if (nums[start] == target) {
                    foundValue = start;
                }
                break;
            }

        }
        return foundValue;
    }


}
