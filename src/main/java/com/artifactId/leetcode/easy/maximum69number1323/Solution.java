package com.artifactId.leetcode.easy.maximum69number1323;

public class Solution {
    public int maximum69Number (int num) {
        int result = num;
        int num1 = num;
        int tenPower = 1;
        while (num1 > 0) {
            int digit = num1 % 10;
            if (digit == 6) {
                result = num + (9 - 6) * tenPower;
            }
            num1 = num1/ 10;
            tenPower = tenPower * 10;
        }

        return result;
    }

}
