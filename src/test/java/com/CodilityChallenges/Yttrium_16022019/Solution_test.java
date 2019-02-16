package com.CodilityChallenges.Yttrium_16022019;

import com.artifactId.CodilityChallenges.Yttrium_16022019.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_test {

    Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }



    @Test
    public void test1(){
        Assert.assertEquals(3, solution.solution("abaacbca", 2));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5, solution.solution("aabcabc", 1));
    }

    @Test
    public void test3(){
        Assert.assertEquals(1, solution.solution("zaaaa", 1));
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





}
