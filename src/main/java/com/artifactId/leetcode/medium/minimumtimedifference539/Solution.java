package com.artifactId.leetcode.medium.minimumtimedifference539;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> timePointsSorted = timePoints.stream().map(timePoint -> {
                    String[] split = timePoint.split(":");
                    return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
                })
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));

        timePointsSorted.add(timePointsSorted.get(0) + 24 * 60);

        return IntStream.range(0, timePointsSorted.size() - 1)
                .map(index -> timePointsSorted.get(index + 1) - timePointsSorted.get(index))
                .min().orElse(-1);
    }

}
