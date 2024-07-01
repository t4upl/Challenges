package com.artifactId.leetcode.easy.threeconsecutiveodds1550;

import java.util.stream.IntStream;

public class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        return IntStream.range(0, arr.length - 2)

                .anyMatch(index ->
            arr[index] % 2 == 1 && arr[index + 1] % 2 == 1 && arr[index + 2] % 2 == 1
        );
    }

}
