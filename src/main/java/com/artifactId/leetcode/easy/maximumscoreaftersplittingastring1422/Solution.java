package com.artifactId.leetcode.easy.maximumscoreaftersplittingastring1422;

public class Solution {

    public int maxScore(String s) {
        long zeroCount = s.chars().filter(x -> x == '0').count();
        long oneCount = s.length() - zeroCount;

        long maxVal = oneCount + ((long) (s.charAt(0) == '0' ? 1 : 0)) - ((long) (s.charAt(0) == '1' ? 1 : 0));
        long currVal = maxVal;
        for (int i = 1; i < s.length() - 1; i++) {
            if(s.charAt(i) == '0') {
                currVal++;
                maxVal = Math.max(currVal, maxVal);
            } else {
                currVal--;
            }
        }

        return (int) maxVal;

    }

}
