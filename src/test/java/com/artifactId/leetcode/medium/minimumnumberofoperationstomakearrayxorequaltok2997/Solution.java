package com.artifactId.leetcode.medium.minimumnumberofoperationstomakearrayxorequaltok2997;

import java.util.Arrays;

public class Solution {

    public int minOperations(int[] nums, int k) {
        int k1 = 0;
        for (int i : nums) {
            k1 = k1 ^ i;
        }

        int result = 0;
        while (k1 != 0 && k != 0) {
            int k1_bin = k1 & 1;
            int k_bin = k & 1;
            if (k1_bin != k_bin) {
                result++;
            }

            k1 = k1 >> 1;
            k = k >> 1;
        }

        k = Math.max(k1, k);
        while (k != 0) {
            k = k & (k - 1);
            result++;
        }


        return result;
    }

}
