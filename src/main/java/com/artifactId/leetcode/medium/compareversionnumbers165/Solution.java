package com.artifactId.leetcode.medium.compareversionnumbers165;

public class Solution {

    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");

        int maxLength = Math.max(split1.length, split2.length);

        for (int i = 0; i < maxLength; i++) {
            int compare = Integer.compare(getInt(split1, i), getInt(split2, i));
            if (compare != 0) {
                return compare;
            }

        }
        return 0;
    }

    private int getInt(String[] split, int i) {
        if (i < split.length) {
            return Integer.parseInt(split[i]);
        }
        return 0;
    }


}
