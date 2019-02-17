package com.artifactId.CodilityChallenges.Yttrium_16022019;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution3 {

    public int solution(String S, int K) {
        if (K == 0) {
            return S.length();
        }

        Map<Character, List<Character>> uniqueLetters = S.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c));

        //number of different characters in String
        int N = uniqueLetters.entrySet().size();

        int lettersToBeRemoved = N - K;

        if (lettersToBeRemoved == 0) {
            return 0;
        }

        if (N <= K) {
            if (N < K) {
                return -1;
            } else {
                return 0;
            }
        }

        int startingLength = getStartingLegth(uniqueLetters, K);
        for (int length = startingLength; length <= S.length(); length++) {
            Map<Character, Integer> lettersInUnremovedString = getLastNLetters(length, S);
            int numberOfLettersInUnremovedString = lettersInUnremovedString.entrySet().size();
            int solution = iterate(S, length, numberOfLettersInUnremovedString, K, lettersInUnremovedString);
            if (solution != -1) {
                return solution;
            }
        }



        return -1;
    }

    private int getStartingLegth(Map<Character, List<Character>> uniqueLetters, int K){
        return uniqueLetters.values().stream().mapToInt(List::size).sorted().limit(uniqueLetters.size() - K).sum();
    }

    private int iterate(String S, int length, int numberOfLettersInUnremovedString, int K,
                        Map<Character, Integer> lettersInUnremovedString) {


        for (int i = 0; i + length <= S.length(); i++) {
            int end = i + length;

            if (numberOfLettersInUnremovedString == K) {
                return length;
            }

            if (end < S.length()) {
                numberOfLettersInUnremovedString = add(S, lettersInUnremovedString, numberOfLettersInUnremovedString, i);
                numberOfLettersInUnremovedString = remove(S, lettersInUnremovedString, numberOfLettersInUnremovedString, end);
            }
        }

        return -1;
    }

    int add (String S, Map<Character, Integer> lettersInUnremovedString, int numberOfLettersInUnremovedString, int index){
        char charToBeAdded = S.charAt(index);
        if (!lettersInUnremovedString.containsKey(charToBeAdded)) {
            lettersInUnremovedString.put(charToBeAdded, 0);
        }

        Integer addPut = lettersInUnremovedString.get(charToBeAdded) + 1;
        lettersInUnremovedString.put(charToBeAdded, addPut);

        if(addPut == 1) {
            numberOfLettersInUnremovedString++;
        }

        return numberOfLettersInUnremovedString;
    }

    int remove(String S, Map<Character, Integer> lettersInUnremovedString, int numberOfLettersInUnremovedString, int index){
        char charToBeRemoved = S.charAt(index);
        Integer removePut = lettersInUnremovedString.get(charToBeRemoved) - 1;
        lettersInUnremovedString.put(charToBeRemoved, removePut);
        if (removePut == 0) {
            numberOfLettersInUnremovedString--;
        }
        return numberOfLettersInUnremovedString;
    }

    private Map<Character, Integer> getLastNLetters(int length, String s) {
        Map<Character, Integer> map = new HashMap<>();

        s.chars().skip(length).mapToObj(c -> (char) c).forEach(x -> {
            if (!map.containsKey(x)) {
                map.put(x, 0);
            }

            map.put(x, map.get(x) + 1);
        });

        return map;
    }
}
