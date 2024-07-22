package com.artifactId.leetcode.easy.sortthepeople2418;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        if (names.length < 2) {
            return names;
        }

        Comparator<Integer> comparing = Comparator.comparing(index -> heights[index]);
        return IntStream.range(0, heights.length).boxed()
                .sorted(comparing.reversed())
                .map(index -> names[index]).toArray(String[]::new);

    }

}
