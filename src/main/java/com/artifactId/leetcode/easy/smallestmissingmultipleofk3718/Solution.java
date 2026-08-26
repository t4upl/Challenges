package com.artifactId.leetcode.easy.smallestmissingmultipleofk3718;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int number = k;
        while (numsSet.contains(number)) {
            number += k;
        }
        return number;
    }
}
