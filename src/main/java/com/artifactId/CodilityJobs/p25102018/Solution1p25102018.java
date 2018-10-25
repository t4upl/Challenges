package com.artifactId.CodilityJobs.p25102018;

public class Solution1p25102018 {

    public int solution(int[] A) {
        // write your code in Java SE 8

        boolean isNonnegative = false;
        int sum = 0;
        int maxSum = 0;

        for (int i: A) {

            if (isNonnegative) {
                if (i >= 0) {
                    sum += i;
                } else {
                    isNonnegative = false;
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }

            } else {
                if (i >= 0) {
                    sum = i;
                    isNonnegative = true;
                }
            }

        }

        if (sum > maxSum) {
            maxSum = sum;
        }

        return maxSum;
    }
}
