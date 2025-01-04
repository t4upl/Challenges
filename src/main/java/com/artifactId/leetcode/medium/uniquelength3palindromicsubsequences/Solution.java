package com.artifactId.leetcode.medium.uniquelength3palindromicsubsequences;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public int countPalindromicSubsequence(String s) {
        Map<Character, Integer> firstIndex = new HashMap<>();
        Map<Character, Integer> lastIndex = new HashMap<>();
        Map<Character, Set<Character>> palindromes = new HashMap<>();

        List<Integer> answer = new ArrayList<>(List.of(0));
        initFirstAndLastindex(s, firstIndex, lastIndex);

        IntStream.range(0, s.length()).forEach(index -> {
            char c = s.charAt(index);

            firstIndex.entrySet().stream()
                    .filter(entry -> {
                        char boudningCharacter = entry.getKey();
                        return firstIndex.get(boudningCharacter) < index && index < lastIndex.get(boudningCharacter);
                    })
                    .forEach(entry -> {
                        palindromes.putIfAbsent(entry.getKey(), new HashSet<>());
                        palindromes.get(entry.getKey()).add(c);
                    });


            lastIndex.values().stream()
                    .filter(value -> index == value)
                    .findFirst().ifPresent(key -> {
                        palindromes.putIfAbsent(c, new HashSet<>());
                        answer.set(0, answer.get(0) + palindromes.get(c).size());
                        firstIndex.remove(c);
                        lastIndex.remove(c);
                        palindromes.remove(c);
                    });
        });

        return answer.get(0);
    }

    private static void initFirstAndLastindex(String s, Map<Character, Integer> firstIndex, Map<Character, Integer> lastIndex) {
        IntStream.range(0, s.length())
                .forEach(index -> {
                    char c = s.charAt(index);
                    firstIndex.putIfAbsent(c, index);
                    lastIndex.put(c, index);
                });
    }

}
