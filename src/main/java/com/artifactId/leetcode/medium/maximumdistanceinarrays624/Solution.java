package com.artifactId.leetcode.medium.maximumdistanceinarrays624;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public int maxDistance(List<List<Integer>> arrays) {

        List<ValueWrapper> smallest = new LinkedList<>();
        List<ValueWrapper> biggest = new LinkedList<>();

        IntStream.range(0, arrays.size()).forEach(index -> {
            List<Integer> currList = arrays.get(index);
            smallest.add(new ValueWrapper(currList.get(0), index));
            biggest.add(new ValueWrapper(currList.get(currList.size() - 1), index));
        });

        List<ValueWrapper> smallestSorted = smallest.stream().sorted(Comparator.comparing(ValueWrapper::getValue)).toList();
        List<ValueWrapper> biggestSorted = biggest.stream().sorted(Comparator.comparing(ValueWrapper::getValue)).toList();

        ValueWrapper smallestValue = smallestSorted.get(0);
        ValueWrapper biggestValue = biggestSorted.get(biggestSorted.size() - 1);
        if (smallestValue.getListIndex() != biggestValue.getListIndex()) {
            return biggestValue.getValue() - smallestValue.getValue();
        }


        return Math.max(
                biggestValue.getValue() - getSafe(smallestSorted, biggestValue.getValue(), 1),
                getSafe(biggestSorted, biggestValue.getValue(),  biggestSorted.size() - 2) - smallestValue.getValue()
                );
    }

    private int getSafe(List<ValueWrapper> list, int defaultValue, int index) {
        return list.size() > index ? list.get(index).getValue() : defaultValue;
    }


    class ValueWrapper {
        int value, listIndex;

        public ValueWrapper(int value, int listIndex) {
            this.value = value;
            this.listIndex = listIndex;
        }

        public int getValue() {
            return value;
        }

        public int getListIndex() {
            return listIndex;
        }
    }

}
