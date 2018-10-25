package com.CodilityJobs.p25102018;

import com.journaldev.CodilityJobs.p25102018.Solution1p25102018;
import org.junit.Assert;
import org.junit.Test;


public class Solution1p25102018Test {

    @Test
    public void test() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[6];
        A[0] =  1;
        A[1] =  2;
        A[2] = -3;
        A[3] =  4;
        A[4] =  5;
        A[5] = -6;

        Assert.assertEquals(9 , solution1.solution(A));
    }

    @Test
    public void test1(){
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[7];
        A[0] = -8;
        A[1] =  3;
        A[2] =  0;
        A[3] =  5;
        A[4] = -3;
        A[5] = 12;

        Assert.assertEquals(12 , solution1.solution(A));
    }

    @Test
    public void test2() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[12];
        A[0] = -1;
        A[1] =  2;
        A[2] =  1;
        A[3] =  2;
        A[4] =  0;
        A[5] =  2;
        A[6] =  1;
        A[7] = -3;
        A[8] =  4;
        A[9] =  3;
        A[10] = 0;
        A[11] =-1;

        Assert.assertEquals(8 , solution1.solution(A));
    }

    @Test
    public void test3() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[1];
        A[0] =  1;

        Assert.assertEquals(1 , solution1.solution(A));
    }

    @Test
    public void test4() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[2];
        A[0] =  0;
        A[1] =  1;

        Assert.assertEquals(1 , solution1.solution(A));
    }

    @Test
    public void test5() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[4];
        A[0] =  0;
        A[1] =  1;
        A[2] =  2;
        A[3] =  0;

        Assert.assertEquals(3 , solution1.solution(A));
    }

    @Test
    public void test6() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[4];
        A[0] =  -1;
        A[1] =  1;
        A[2] =  2;
        A[3] =  -1;

        Assert.assertEquals(3 , solution1.solution(A));
    }

    @Test
    public void test7() {
        Solution1p25102018 solution1 = new Solution1p25102018();
        int [] A = new int[5];
        A[0] =  -1;
        A[1] =  1;
        A[2] =  2;
        A[3] =  -1;
        A[4] = 16;

        Assert.assertEquals(16 , solution1.solution(A));
    }


}
