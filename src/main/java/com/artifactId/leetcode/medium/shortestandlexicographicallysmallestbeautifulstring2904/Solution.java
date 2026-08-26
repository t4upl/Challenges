package com.artifactId.leetcode.medium.shortestandlexicographicallysmallestbeautifulstring2904;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> oneIndices = IntStream.range(0, s.length())
                .filter(index -> s.charAt(index) == '1')
                .boxed()
                .toList();

        List<String> smallestSizeStrings = new ArrayList<>();
        int smallestSize = Integer.MAX_VALUE;
        for (int i = 0; i < oneIndices.size() - k + 1; i++) {
            int start = oneIndices.get(i);
            int end = oneIndices.get(i + k - 1);
            int currentSize = end - start;
            if (currentSize < smallestSize) {
                smallestSize = currentSize;
                smallestSizeStrings.clear();
            }
            if (currentSize == smallestSize) {
                smallestSizeStrings.add(s.substring(start, end + 1));
            }
        }

        String result = smallestSizeStrings.stream().min(Comparator.naturalOrder())
                .orElse("");
        return result;
    }

}
