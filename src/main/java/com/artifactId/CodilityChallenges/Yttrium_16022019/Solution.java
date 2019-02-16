package com.artifactId.CodilityChallenges.Yttrium_16022019;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    int shortestYet;

    public int solution(String S, int K) {
        System.out.println(S.length());


        if (K == 0) {
            return S.length();
        }

        Map<Character, Pair> map = new HashMap<>();

        S.chars().mapToObj(c -> (char) c).forEach(x -> { if (!map.containsKey(x)) map.put(x, null);});

        if (map.entrySet().size() < K) {
            return -1;
        }

        if (map.entrySet().size() == K) {
            return 0;
        }

        map.entrySet().stream()
                .forEach(x -> map.put(x.getKey(), new Pair(S.indexOf(x.getKey()), S.lastIndexOf(x.getKey()))));

        int lettersToBeRemoved = map.keySet().size() - K;

        if (lettersToBeRemoved == 0) {
            return 0;
        }

        this.shortestYet = S.length() + 1;
        generateAllCombinations(map.keySet(), new HashSet<>(), lettersToBeRemoved, map);

        return this.shortestYet;
    }

    int checkStringToBeRemovedLength(Set<Character> set, Map<Character, Pair> map){
        Set<Pair> collect = map.entrySet().stream()
                .filter(x -> set.contains(x.getKey())).map(x -> x.getValue()).collect(Collectors.toSet());

        Integer first = collect.stream().mapToInt(x -> x.first).min().orElseThrow(() -> new RuntimeException());
        Integer last = collect.stream().mapToInt(x -> x.last).max().orElseThrow(() -> new RuntimeException());
        return last - first + 1;
    }

    void generateAllCombinations(Set<Character> in, Set<Character> out, int endLength, Map<Character, Pair> map){

        if (out.size() == endLength) {
//            this.combinations.add(out);
            int i = checkStringToBeRemovedLength(out, map);
            if (this.shortestYet > i) {
                this.shortestYet = i;
            }

            return;
        }

        for (Character c : in) {
            Set<Character> set = new HashSet<>(in);
            set.remove(c);

            Set<Character> set2 = new HashSet<>(out);
            set2.add(c);
            generateAllCombinations(set, set2, endLength, map);
        }
    }


    public class Pair {
        int first;
        int last;

        public Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }
    }
}
