package com.artifactId.leetcode.medium.numberofwaystosplitarray2270;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int waysToSplitArray(int[] nums) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger sumOfAll = BigInteger.ZERO;
        for (int x : nums) {
            sumOfAll = sumOfAll.add(BigInteger.valueOf(x));
        }
        int answer = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            sum = sum.add(BigInteger.valueOf(nums[index]));
            if (sum.compareTo(sumOfAll.subtract(sum)) > -1) {
                answer++;
            }
        }

        return answer;
    }

}
