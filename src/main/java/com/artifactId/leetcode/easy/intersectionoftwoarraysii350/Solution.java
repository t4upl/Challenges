package com.artifactId.leetcode.easy.intersectionoftwoarraysii350;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> num1Freq = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Map<Integer, Long> num2Freq = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        return num1Freq.entrySet().stream().flatMap(entry -> {
            long min = Math.min(entry.getValue(), num2Freq.getOrDefault(entry.getKey(), 0L));
            return LongStream.range(0, min).mapToObj(x -> entry.getKey());
        }).mapToInt(x -> x).toArray();


    }


}
