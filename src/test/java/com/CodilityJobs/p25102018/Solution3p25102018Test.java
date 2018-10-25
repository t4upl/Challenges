package com.CodilityJobs.p25102018;

import com.journaldev.CodilityJobs.p25102018.Solution3;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution3p25102018Test {

    @Test
    public void test(){
        Solution3 solution3 = new Solution3();
        Assertions.assertEquals(0, solution3.solution("0"));
        Assertions.assertEquals(0, solution3.solution("00"));
    }

    @Test
    public void test2(){
        Solution3 solution3 = new Solution3();
        Assertions.assertEquals(7, solution3.solution("011100"));
    }

    @Test
    public void test3(){
        Solution3 solution3 = new Solution3();
        Assertions.assertEquals(1, solution3.solution("1"));
    }

    @Test
    public void test4(){
        Solution3 solution3 = new Solution3();
        Assertions.assertEquals(2, solution3.solution("10"));
    }
}
