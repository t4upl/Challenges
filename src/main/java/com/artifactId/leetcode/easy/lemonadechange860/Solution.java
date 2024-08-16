package com.artifactId.leetcode.easy.lemonadechange860;

public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int[] billCount = new int[2];
        for (int bill : bills) {

            if (bill == 5) {
                billCount[0] = billCount[0] + 1;
                continue;
            }

            if (bill == 10) {
                if (billCount[0] == 0) {
                    return false;
                }

                billCount[0] = billCount[0] - 1;
                billCount[1] = billCount[1] + 1;
                continue;
            }

            if (bill == 20) {
                if (billCount[1] > 0 && billCount[0] > 0) {
                    billCount[0] = billCount[0] - 1;
                    billCount[1] = billCount[1] - 1;
                    continue;
                }

                if (billCount[0] > 2) {
                    billCount[0] = billCount[0] - 3;
                    continue;
                }
                return false;
            }
        }

        return true;
    }

}
