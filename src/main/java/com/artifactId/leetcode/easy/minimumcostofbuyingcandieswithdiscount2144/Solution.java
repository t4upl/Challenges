package com.artifactId.leetcode.easy.minimumcostofbuyingcandieswithdiscount2144;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int minimumCost(int[] cost) {
        List<Integer> costDesc = Arrays.stream(cost)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();

        return IntStream.range(0, costDesc.size())
                .filter(index -> index % 3 != 2)
                .map(costDesc::get)
                .sum();
    }

}
