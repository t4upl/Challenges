package com.artifactId.leetcode.medium.reorderedpowerof2_869;

import java.util.*;

public class Solution {

    public boolean reorderedPowerOf2(int n) {
        int i = 1;
        Map.Entry<Integer, int[]> freqMap = getFreqMap(n);
        while (true) {
            Map.Entry<Integer, int[]> freqMap1 = getFreqMap(i);
            if (freqMap.getKey().equals(freqMap1.getKey()) && Arrays.compare(freqMap.getValue(), freqMap1.getValue()) ==0 ) {
                return true;
            }
            if (i > Integer.MAX_VALUE >> 1) {
                break;
            }
            i = i << 1;
        }
        return false;
    }

    private Map.Entry<Integer, int[]> getFreqMap(int n) {
        int[] result  = new int[10];
        int digitCount = 0;
        while (n > 0) {
            int digit = n % 10;
            result[digit] = result[digit] + 1;
            n = n / 10;
            digitCount++;
        }

        return new AbstractMap.SimpleEntry<>(digitCount, result);
    }
}
