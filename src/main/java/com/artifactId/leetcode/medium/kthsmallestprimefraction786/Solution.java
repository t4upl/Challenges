package com.artifactId.leetcode.medium.kthsmallestprimefraction786;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Solution {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double[] doubleArr = Arrays.stream(arr).mapToDouble(x -> x).toArray();
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing((int[] x) -> ((float) doubleArr[x[0]]) / ((float) doubleArr[x[1]])));
        IntStream.range(0, doubleArr.length).forEach(x -> queue.add(new int[]{x, doubleArr.length - 1}));
        int i = 0;
        int[] result = new int[]{arr[0], arr[0]};
        while (i < k) {
            result = queue.poll();
            if (result[1] - 1 > -1) {
                queue.add(new int[]{result[0], result[1] - 1});
            }
            i++;
        }

        return new int[]{arr[result[0]], arr[result[1]]};
    }
}
