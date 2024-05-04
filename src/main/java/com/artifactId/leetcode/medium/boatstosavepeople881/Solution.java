package com.artifactId.leetcode.medium.boatstosavepeople881;

import java.util.Arrays;

public class Solution {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int result = 0;
        int smaller =  0;
        int bigger = people.length - 1;
        while (smaller <= bigger) {
            if (people[smaller] + people[bigger] <= limit) {
                smaller++;
            }
            bigger--;
            result++;

        }
        return result;
    }

}
