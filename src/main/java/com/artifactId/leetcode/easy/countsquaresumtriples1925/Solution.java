package com.artifactId.leetcode.easy.countsquaresumtriples1925;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int countTriples(int n) {

        int result  = 0;
        Set<Integer> powerTwo = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            powerTwo.add(i * i);
        }

        int diff = 0;
        for (int a = 1; a < n ; a++) {
            for (int b = a +1; b < n + 1; b++ ){
                if (powerTwo.contains(a * a + b * b)) {
//                    System.out.println(a + " "  + b);
                    result = result + 2;
                };
            }
        }

        return result;
    }

}
