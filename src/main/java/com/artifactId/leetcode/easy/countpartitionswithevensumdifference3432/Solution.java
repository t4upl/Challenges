package com.artifactId.leetcode.easy.countpartitionswithevensumdifference3432;

import java.util.Arrays;

public class Solution {

    public int countPartitions(int[] nums) {
        long oddCount = Arrays.stream(nums)
                .filter(x -> x % 2 == 1)
                .count();

        return oddCount % 2 == 1 ? 0 : nums.length - 1;
    }

}
