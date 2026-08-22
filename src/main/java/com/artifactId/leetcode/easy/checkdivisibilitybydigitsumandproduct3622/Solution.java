package com.artifactId.leetcode.easy.checkdivisibilitybydigitsumandproduct3622;

public class Solution {

    public boolean checkDivisibility(int n) {
        int nCopy = n;
        int sum = 0;
        int product = 1;
        while (nCopy > 0) {
            int remainderOfTen = nCopy % 10;
            sum += remainderOfTen;
            product *= remainderOfTen;
            nCopy = nCopy / 10;
        }

        return n % (sum + product) == 0;
    }
}
