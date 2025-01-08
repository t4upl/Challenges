package com.artifactId.leetcode.medium.minimumnumberofoperationstomoveallballstoeachbox1769;

public class Solution {

    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        if (boxes.length() == 1) {
            answer[0] = 0;
            return answer;
        }

        int left = 0;
        int right = 0;
        int sum = 0;

        for (int i = 1; i < boxes.length(); i++) {
            char c = boxes.charAt(i);
            if (c == '0') {
                continue;
            }
            sum+=i;
            right++;
        }
        answer[0] = sum;

        for (int i = 1; i < boxes.length(); i++) {
            if (boxes.charAt((i - 1)) == '1') {
                left++;
            }
            if (boxes.charAt((i)) == '1') {
                right--;
                sum--;
            }
            sum += left  - right;
            answer[i] = sum;
        }

        return answer;
    }

}
