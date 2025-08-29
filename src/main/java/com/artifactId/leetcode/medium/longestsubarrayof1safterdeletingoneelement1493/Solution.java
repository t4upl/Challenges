package com.artifactId.leetcode.medium.longestsubarrayof1safterdeletingoneelement1493;

import java.util.Arrays;

public class Solution {

    public int longestSubarray(int[] nums) {
        int current = 0;
        int prev =  0;
        int result  = 0;
        boolean zeroEncountered = false;
        for (int num: nums) {
            if (num == 0) {
                result = Math.max(result, current + prev);
                prev = current;
                current = 0;
                zeroEncountered = true;
              continue;
            }
            current++;
        }
        result = Math.max(result, current + prev);

        if (!zeroEncountered) {
            return result -1;
        }

        return result;
    }
    
}
