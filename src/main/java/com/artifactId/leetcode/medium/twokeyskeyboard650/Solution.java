package com.artifactId.leetcode.medium.twokeyskeyboard650;

public class Solution {

    int answer = -1;
    int n;
    public int minSteps(int n) {
        this.n= n;
        makeStep(0, 1, 0);
        return answer;
    }

    private void makeStep(int stepCount, int numberOfAs, int clipBoard) {
        if (numberOfAs == n) {
            answer = stepCount;
        }

        if (numberOfAs > n || answer != -1) {
            return;
        }

        makeStep(stepCount + 2, numberOfAs * 2, numberOfAs);
        makeStep(stepCount + 1, numberOfAs + clipBoard, clipBoard);
    }





}
