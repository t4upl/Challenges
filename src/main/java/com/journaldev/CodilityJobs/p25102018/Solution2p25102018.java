package com.journaldev.CodilityJobs.p25102018;

public class Solution2p25102018 {

    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean [] isConsumed = new boolean[A.length];
        for (boolean b : isConsumed) {
            b =  false;
        }

        int maxLength = 0;

        for (int i = 0; i < A.length; i++) {
            if (!isConsumed[i]) {
                int length = consume(A, isConsumed, i);
                System.out.println(length);

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    private int consume(int[] A, boolean[] B, int index) {
        int sum = 1;
        int next = A[index];


        System.out.println("\t" + A[index]);

        while (next != index) {
            B[next] = true;
            next = A[next];

            System.out.println("\t" + A[next]);
            sum++;
        }

        return sum;
    }
}
