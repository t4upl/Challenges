package com.artifactId.CodilityJobs.p25102018;

public class Solution3 {
    public int solution(String S) {
        // write your code in Java SE 8

        int moves = 0;
        int start = S.indexOf('1');

        if (start == -1) {
            return 0;
        }

        S = S.substring(start);
        System.out.println(S);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(S.length() - 1 - i) == '1') {
                moves++;
            }
            moves++;
        }
        moves--;

        return  moves;
    }
}
