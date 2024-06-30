package com.artifactId.leetcode.medium.maximumtotalimportanceofroads_2285;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        Map<Integer, Integer> nodeNumberToNumberOfNeighbours = new HashMap<>();
        Arrays.stream(roads).forEach(x -> {
            add(nodeNumberToNumberOfNeighbours, x[0]);
            add(nodeNumberToNumberOfNeighbours, x[1]);
        });


        Comparator<Map.Entry<Integer, Integer>> comparator = Comparator.comparingInt(entry -> entry.getValue());

        LinkedList<Map.Entry<Integer, Integer>> nodesSortedByNeighbours = nodeNumberToNumberOfNeighbours.entrySet().stream()
                .sorted(comparator.reversed())
                .collect(Collectors.toCollection(LinkedList::new));
        long sum = 0;
        while (n > 0) {
            if (nodesSortedByNeighbours.isEmpty()) {
                break;
            }

            Map.Entry<Integer, Integer> pop = nodesSortedByNeighbours.pop();
//            System.out.println(pop.getKey() + " " + n);
            sum += (long) pop.getValue() * n;
            n--;
        }

        return sum;
    }

    private void add(Map<Integer, Integer> map, int nodeValue) {
        map.putIfAbsent(nodeValue, 0);
        map.put(nodeValue, map.get(nodeValue) +1);
    }


}
