package com.artifactId.leetcode.medium.maximizehappinessofselectedchildren3075;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public long maximumHappinessSum(int[] happiness, int k) {
        Comparator<Integer> comparator = Comparator.comparingInt((Integer x) -> x).reversed();
        happiness = Arrays.stream(happiness).boxed().sorted(comparator).mapToInt(x -> x).toArray();
        long result = 0;
        for (int i = 0; i < k; i++) {
            happiness[i] = happiness[i] - i;
            happiness[i] = Math.max(happiness[i], 0);
            result += happiness[i];
        }
        return result;
    }
}
