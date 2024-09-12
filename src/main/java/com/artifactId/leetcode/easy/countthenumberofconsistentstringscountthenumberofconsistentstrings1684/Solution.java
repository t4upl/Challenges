package com.artifactId.leetcode.easy.countthenumberofconsistentstringscountthenumberofconsistentstrings1684;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Integer> allowedSet = allowed.chars().boxed().collect(Collectors.toSet());
        Long count = Arrays.stream(words)
                .filter(word -> !word.chars().anyMatch(aChar -> !allowedSet.contains(aChar))).count();
        return count.intValue();
    }

}
