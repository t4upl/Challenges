package com.CodilityChallenges.Yttrium_16022019;

import com.artifactId.CodilityChallenges.Yttrium_16022019.Solution2;
import com.artifactId.CodilityChallenges.Yttrium_16022019.Solution3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class Solution2_test {

    Solution3 solution;
    Solution2 naiveSolution;

    @Before
    public void setUp(){

        solution = new Solution3();
        naiveSolution = new Solution2();
    }

    @Test
    public void test1(){
//        Assert.assertEquals(3, solution.solution("abaacbca", 2));
        runTest(3, "abaacbca", 2);
    }

    @Test
    public void test3_2() {
        runTest(1, "zaa", 1);
    }

    @Test
    public void test3(){
        runTest(1, "zaaaa", 1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(5, solution.solution("aabcabc", 1));
        runTest(5, "aabcabc", 1);
    }

    @Test
    public void test4(){
        Assert.assertEquals(-1, solution.solution("aaaa", 2));
    }

    @Test
    public void test5(){
        Assert.assertEquals(0, solution.solution("aaaa", 1));
    }

    @Test
    public void test6(){
        Assert.assertEquals(0, solution.solution("aaaab", 2));
    }

    @Test
    public void test7(){
        Assert.assertEquals(3, solution.solution("abc", 0));
    }

    @Test
    public void test8(){
        Assert.assertEquals(2, solution.solution("abc", 1));
    }

    @Test
    public void test9(){
        Assert.assertEquals(2, solution.solution("aabc", 1));
    }

    @Test
    public void test10(){
        Assert.assertEquals(0, solution.solution("aabc", 3));
    }

    @Test
    public void test11(){
        Assert.assertEquals(9, solution.solution("erqmfuvnng", 1));
    }

    @Test
    public void test12(){
        Assert.assertEquals(17, solution.solution("ydazedqixgyipyrysbwp", 3));
    }

    @Test
    public void random() {
        int numberOfTests = 10;
        int length = 12;
        int K = 4;
        final int a = 'a';
        for (int i = 0; i < numberOfTests; i++) {

            //generate string
            StringBuilder s = new StringBuilder();
            for (int j =0; j < length; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(0, 25 + 1);
                int randomLetter = a + randomNum;
                s.append((char) randomLetter);
            }

            System.out.println("Generated string: " + s.toString());

            runTest(-2, s.toString(), K);

        }


    }

    void runTest(int expected, String S, int K){
        solution = new Solution3();
        naiveSolution = new Solution2();

        if (expected > -2) {
            Assert.assertEquals(expected, naiveSolution.solution(S, K));
            int result = solution.solution(S, K);
            Assert.assertEquals(expected, result);
        } else {
            //if you don't knwo the answer type expected < -1
            //this will compare solution with naive solution
            System.out.println(S);

            System.out.println("running naive");
            int naive = naiveSolution.solution(S, K);

            System.out.println("running result");
            int result = solution.solution(S, K);
            Assert.assertEquals(naive, result);

        }
    }




}
