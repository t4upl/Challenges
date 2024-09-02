package com.artifactId.leetcode.medium.findthestudentthatwillreplacethechalk1894;

import java.util.Arrays;

public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = Arrays.stream(chalk).mapToLong(x -> x).sum();
        sum = Math.min(sum, Integer.MAX_VALUE);
        k =  k % (int) sum;
        for (int i = 0; i < chalk.length; i++) {
            int afterUse = k - chalk[i];
            if (afterUse < 0) {
                return i;
            }
            k = afterUse;
        }

        return -1;
    }
}
