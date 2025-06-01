package com.artifactId.leetcode.easy.longestunequaladjacentgroupssubsequencei;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> answer =  new ArrayList<>();
        if (words.length == 0) {
            return answer;
        }
        if (words.length == 1) {
            return List.of(words[0]);
        }

        int currVal = groups[0];
        answer.add(words[0]);
        for (int i = 1; i < groups.length; i++) {
            if (groups[i] == currVal) {
                continue;
            }
            currVal = groups[i];
            answer.add(words[i]);
        }

        return answer;
    }

}
