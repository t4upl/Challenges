package com.artifactId.mockit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Sweets {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSweets(List.of(1,2,3,4,5,1,2,3,1,1)).toArray()));
        System.out.println(Arrays.toString(getSweets(List.of(1,2,3,1,1,1,2,3,4,5)).toArray()));
        System.out.println(Arrays.toString(getSweets(List.of(1,1)).toArray()));
    }
    static List<Integer> getSweets(List<Integer> sweets) {
        int totalSize = sweets.size() / 2;
        Map<Integer, Long> sweetTypeToFrequency = sweets.stream().collect(Collectors.groupingBy(x -> x, counting()));
        List<Integer> result = sweetTypeToFrequency.keySet().stream()
                .limit(totalSize)
                .toList();

        result.forEach(sweetType -> sweetTypeToFrequency.put(sweetType, sweetTypeToFrequency.get(sweetType) - 1));
        for (Integer sweetType : sweetTypeToFrequency.keySet()) {
            while (result.size() < totalSize && sweetTypeToFrequency.get(sweetType) > 0) {
                result.add(sweetType);
                sweetTypeToFrequency.put(sweetType, sweetTypeToFrequency.get(sweetType) - 1);
            }
            if (result.size() == totalSize) {
                break;
            }
        }
        return result;
    }
}
