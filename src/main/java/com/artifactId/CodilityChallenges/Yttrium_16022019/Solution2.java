package com.artifactId.CodilityChallenges.Yttrium_16022019;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//No medal - fialing complexity for random string with a lot of different letters
// Probably an optimal solution requires different strategy for K << N
// so it's easier to hunt thoser letters that will be left rather than those that will be eliminated.
public class Solution2 {

    final Map<Character, Pair> map = new HashMap<>();
    int shortestYet;


    public int solution(String S, int K) {
        if (K == 0) {
            return S.length();
        }

        S.chars().mapToObj(c -> (char) c).forEach(x -> { if ( ! this.map.containsKey(x)) this.map.put(x, null);});

        if (map.entrySet().size() <= K) {
            if (map.entrySet().size() < K) {
                return -1;
            } else {
                return 0;
            }
        }

        map.entrySet()
           .stream()
            .forEach(x -> map.put(x.getKey(), new Pair(S.indexOf(x.getKey()), S.lastIndexOf(x.getKey()))));

        this.shortestYet = S.length() + 1;

        int lettersToBeRemoved = map.keySet().size() - K;
        if (lettersToBeRemoved == 0) {
            return 0;
        }

        generateAllCombinations(map.keySet(), new HashSet<>(), lettersToBeRemoved, map, S.length() + 1, 0);

        return this.shortestYet;
    }

    void generateAllCombinations(Set<Character> in, Set<Character> out, int endLength, Map<Character, Pair> map,
                                 int first, int last){

        if (out.size() == endLength) {
            int length = last - first + 1;
            if (this.shortestYet > length) {
                this.shortestYet = length;
            }

            return;
        }

        for (Character c : in) {
            Pair pair = map.get(c);

            int first_x = Math.min(pair.first, first);
            int last_x = Math.max(pair.last, last);

            int length = last_x - first_x + 1;
            if (length < this.shortestYet) {

                Set<Character> set = new HashSet<>(in);
                set.remove(c);

                Set<Character> set2 = new HashSet<>(out);
                set2.add(c);
                generateAllCombinations(set, set2, endLength, map, first_x, last_x);
            }
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

