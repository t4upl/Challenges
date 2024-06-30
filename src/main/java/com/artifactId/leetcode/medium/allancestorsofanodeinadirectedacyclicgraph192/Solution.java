package com.artifactId.leetcode.medium.allancestorsofanodeinadirectedacyclicgraph192;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<Set<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> nodeIndexToChildren = new HashMap<>();

        Set<Integer> potentialRoots = IntStream.range(0, n).boxed().collect(Collectors.toSet());
        IntStream.range(0, n).forEach(index -> {
            result.add(new HashSet<>());
            nodeIndexToChildren.put(index, new ArrayList<>());
        });

        Arrays.stream(edges).forEach(edge ->
                {
                    nodeIndexToChildren.get(edge[0]).add(edge[1]);
                    potentialRoots.remove(edge[1]);
                }
        );

        Set<Integer> currentLayer = potentialRoots;
        Set<Integer> nextLayer = new HashSet<>();
        while (!currentLayer.isEmpty()) {
            currentLayer.forEach(currNode -> {
                System.out.println(currNode);
                        Set<Integer> ancestors = result.get(currNode);
                        List<Integer> ancestorsToBegivenToChild = Stream.concat(ancestors.stream(), Stream.of(currNode)).toList();
                        List<Integer> children = nodeIndexToChildren.get(currNode);
                        children.forEach(child -> result.get(child).addAll(ancestorsToBegivenToChild));
                        nextLayer.addAll(children);
                    }
            );
            currentLayer = new HashSet<>(nextLayer);
            nextLayer.clear();
        }
        return result.stream().map((Set<Integer> ancestor) -> ancestor.stream().sorted().toList()).toList();
    }

}
