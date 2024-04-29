package com.artifactId.leetcode.medium.minimumheighttrees310;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if (edges.length < 2) {
            return IntStream.range(0, edges.length + 1).boxed().toList();
        }

        Map<Integer, List<Integer>> fromTo = new HashMap<>();
        Arrays.stream(edges).forEach(edgeEntry -> {
            fromTo.putIfAbsent(edgeEntry[0], new ArrayList<>());
            fromTo.putIfAbsent(edgeEntry[1], new ArrayList<>());
            fromTo.get(edgeEntry[0]).add(edgeEntry[1]);
            fromTo.get(edgeEntry[1]).add(edgeEntry[0]);
        });

        List<Integer> leaves = fromTo.entrySet().stream()
                .filter(x -> x.getValue().size() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));

        while (fromTo.size() > 2) {
            System.out.println(Arrays.asList(leaves));
            List<Integer> newLeaves = leaves.stream()
                    .map(fromTo::get)
                    .flatMap(Collection::stream)
                    .distinct()
                    .collect(Collectors.toList());
            leaves.forEach(leaf -> fromTo.get(leaf).forEach(neighbourOfLeaf -> fromTo.get(neighbourOfLeaf).remove(leaf)));
            leaves.forEach(fromTo::remove);

            newLeaves.removeAll(leaves);
            newLeaves = newLeaves.stream()
                    .filter(x -> fromTo.get(x).size() < 2)
                    .toList();

            leaves = newLeaves;
        }

        return leaves;
    }

}
