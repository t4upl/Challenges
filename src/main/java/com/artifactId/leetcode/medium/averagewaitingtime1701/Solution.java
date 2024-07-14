package com.artifactId.leetcode.medium.averagewaitingtime1701;

public class Solution {

    public double averageWaitingTime(int[][] customers) {
        if (customers.length == 0) {
            return 0.0;
        }

        int time = customers[0][0];
        long waitingTimeSum = 0;
        for (int[] customer: customers) {
            time= Math.max(time, customer[0]) + customer[1];
            int cutomerWaitTime = time - customer[0];
            waitingTimeSum  += cutomerWaitTime;
        }

        return (double) waitingTimeSum / customers.length;
    }

}
