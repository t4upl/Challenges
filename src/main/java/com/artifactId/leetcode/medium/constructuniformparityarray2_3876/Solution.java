package com.artifactId.leetcode.medium.constructuniformparityarray2_3876;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {

    public boolean uniformArray(int[] nums1) {
        Predicate<Integer> objectPredicate = x -> x % 2 == 0;
        Map<Boolean, List<Integer>> divideByIsEven = Arrays.stream(nums1).boxed().collect(Collectors.partitioningBy(objectPredicate));
        List<Integer> evenNums = divideByIsEven.get(true);
        List<Integer> oddNums = divideByIsEven.get(false);
        if (oddNums.isEmpty() || evenNums.isEmpty()) {
            return true;
        }
        LinkedList<Integer> evenNumsSorted = evenNums.stream()
                .sorted(Comparator.comparing(x -> x, Comparator.reverseOrder()))
                .collect(Collectors.toCollection(LinkedList::new));

        LinkedList<Integer> oddNumsSorted = oddNums.stream()
                .sorted(Comparator.comparing(x -> x, Comparator.reverseOrder()))
                .collect(Collectors.toCollection(LinkedList::new));

        while (!evenNumsSorted.isEmpty()) {
            Integer evenNumber = evenNumsSorted.poll();
            while (!oddNumsSorted.isEmpty()) {
                Integer oddNumber = oddNumsSorted.get(0);
                if (evenNumber - oddNumber >= 1) {
                    break;
                } else {
                    oddNumsSorted.removeFirst();
                }
                if (oddNumsSorted.isEmpty()) {
                    return false;
                }
            }

        }

        return true;
    }
}
