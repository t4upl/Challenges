package com.CodilityJobs.p25102018;

import com.CodilityJobs.TestUtils;
import com.journaldev.CodilityJobs.p25102018.Solution2p25102018;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Solution2p25102018Test {

    @Test
    public void test() {
        Solution2p25102018 solution2 = new Solution2p25102018();

        int[] A = new int[7];
        A[0] = 5;
        A[1] = 4;
        A[2] = 0;
        A[3] = 3;
        A[4] = 1;
        A[5] = 6;
        A[6] = 2;

        Assertions.assertEquals(4, solution2.solution(A));
    }

    @Test
    public void test2() {
        Solution2p25102018 solution2 = new Solution2p25102018();

        int[] A = new int[7];
        A[0] = 5;
        A[1] = 4;
        A[2] = 0;
        A[3] = 3;
        A[4] = 1;
        A[5] = 6;
        A[6] = 2;

        TestUtils.reverseArray(A);
        System.out.println(Arrays.toString(A));

        Assertions.assertEquals(6, solution2.solution(A));
    }

    @Test
    public void test3() {
        Solution2p25102018 solution2 = new Solution2p25102018();
        int[] A = new int[3];
        A[0] = 1;
        A[1] = 2;
        A[2] = 0;

        Assertions.assertEquals(3, solution2.solution(A));
    }


    @Test
    public void test4() {
        Solution2p25102018 solution2 = new Solution2p25102018();
        int[] A = new int[5];
        A[0] = 2;
        A[1] = 3;
        A[2] = 4;
        A[3] = 1;
        A[4] = 0;

        Assertions.assertEquals(3, solution2.solution(A));
    }

    @Test
    public void test5() {
        Solution2p25102018 solution2 = new Solution2p25102018();
        int[] A = new int[5];
        A[0] = 1;
        A[1] = 0;
        A[2] = 3;
        A[3] = 4;
        A[4] = 2;

        Assertions.assertEquals(3, solution2.solution(A));
    }






}
