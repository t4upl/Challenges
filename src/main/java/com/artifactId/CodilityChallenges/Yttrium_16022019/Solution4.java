package com.artifactId.CodilityChallenges.Yttrium_16022019;

import java.util.*;

public class Solution4 {

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

        int lettersToBeRemoved = map.keySet().size() - K;
        if (lettersToBeRemoved == 0) {
            return 0;
        }

        map.entrySet()
                .forEach(x -> map.put(x.getKey(), new Pair(S.indexOf(x.getKey()), S.lastIndexOf(x.getKey()))));

        this.shortestYet = S.length() + 1;

        char[] chars = mapCharSettoCharArray(map.keySet());
        printCombination(chars, map.entrySet().size(), lettersToBeRemoved);

        return shortestYet;
    }

    char[] mapCharSettoCharArray(Set<Character> set){
        char[] c = new char[set.size()];
        int i =0;
        for (char c1 : set) {
            c[i] = c1;
            i++;
        }
        return c;
    }

    private void countRemovedStringLength(char data[]){
        List<Pair> list = new ArrayList<>();
        for (char c : data) {
            list.add(map.get(c));
        }

        int minFirst = list.stream().mapToInt(Pair::getFirst).min().getAsInt();
        int maxFirst = list.stream().mapToInt(Pair::getLast).max().getAsInt();
        int length = maxFirst - minFirst + 1;
        this.shortestYet = Math.min(shortestYet, length);
    }

    void combinationUtil(char arr[], char data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            countRemovedStringLength(data);
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make texteditor combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            if (!(map.get(arr[i]).getDiff() > this.shortestYet - 1)) {
                data[index] = arr[i];
                combinationUtil(arr, data, i+1, end, index+1, r);
            }
        }
    }


    void printCombination(char[] arr, int n, int r)
    {
        // A temporary array to store all combination one by one
        char[] data= new char[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    class Pair {
        int first;
        int last;
        int diff;

        public Pair(int first, int last) {
            this.first = first;
            this.last = last;
            this.diff = last - first;
        }

        public int getFirst() {
            return first;
        }

        public int getLast() {
            return last;
        }

        public int getDiff() {
            return diff;
        }
    }
}
