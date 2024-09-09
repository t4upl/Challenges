package com.artifactId.leetcode.medium.findmissingobservations2028;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int leftoverSum =  mean * (rolls.length + n) - Arrays.stream(rolls).sum();
        int smallerValue = leftoverSum / n;
        double smallerValueDouble = (double) leftoverSum / n;
        if (smallerValueDouble < 1 || smallerValueDouble > 6) {
            return new int[0];
        }

        int biggerValueCount = leftoverSum - smallerValue * n;
        int[] answer = new int[n];
        IntStream.range(0, biggerValueCount).forEach(index -> answer[index] = smallerValue  + 1);
        IntStream.range(biggerValueCount, n).forEach(index -> answer[index] = smallerValue);
        return answer;
    }

}
