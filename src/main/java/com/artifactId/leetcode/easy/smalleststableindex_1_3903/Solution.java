package com.artifactId.leetcode.easy.smalleststableindex_1_3903;

import java.util.Arrays;

public class Solution {

    public int firstStableIndex(int[] nums, int k) {
        int[] mins = new int[nums.length];
        mins[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length -2; i > -1; i--) {
            mins[i] = Math.min(mins[i +1], nums[i]);
        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
            }
            else {
                max = Math.max(nums[i], max);
            }

            if (max - mins[i] <=k) {
                return i;
            }
        }

        return -1;
    }

}
