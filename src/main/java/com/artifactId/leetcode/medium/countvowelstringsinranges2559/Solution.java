package com.artifactId.leetcode.medium.countvowelstringsinranges2559;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(getOneIfSurrounedByVowel(words, 0));
        IntStream.range(1, words.length)
                .forEach(index -> prefixSum.add(prefixSum.get(prefixSum.size() - 1) + getOneIfSurrounedByVowel(words, index)));

        int[] array = Arrays.stream(queries)
                .map(query -> {
                    int start = query[0];
                    int end = query[1];
                    if (start == 0) {
                        return prefixSum.get(end);
                    }

                    return prefixSum.get(end) - prefixSum.get(start - 1);
                })
                .mapToInt(x -> x)
                .toArray();
        return array;
    }

    private int getOneIfSurrounedByVowel(String[] words, int i) {
        return startAndEndIsVowel(words[i]) ? 1 : 0;
    }

    private boolean startAndEndIsVowel(String word) {
        return VOWELS.contains(word.charAt(0)) && VOWELS.contains(word.charAt(word.length() -1));
    }
}
