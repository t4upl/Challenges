package com.artifactId.leetcode.medium.subsets78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return List.of(List.of());
        }

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> acc = new ArrayList<>();
        generateSubsets(nums, 0, acc, result);
        result.add(new LinkedList<>());
        return  result;
    }

    private void generateSubsets(int[] nums, int beginIndex, List<Integer> acc, List<List<Integer>> result) {
        for (int i = beginIndex; i < nums.length; i++) {
            acc.add(nums[i]);
            generateSubsets(nums, i+1, acc, result);
            result.add(new LinkedList<>(acc));
            acc.remove(acc.size() -1);
        }
    }

}
