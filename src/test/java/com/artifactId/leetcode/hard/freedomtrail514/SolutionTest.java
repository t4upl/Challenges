package com.artifactId.leetcode.hard.freedomtrail514;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void leet1() {
        assertThat(solution.findRotateSteps("godding", "gd")).isEqualTo(4);
    }


    @Test
    void leet2() {
        assertThat(solution.findRotateSteps("godding", "godding")).isEqualTo(13);
    }

    @Test
    void test1() {
        assertThat(solution.findRotateSteps("acbcb", "ab")).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(solution.findRotateSteps("a", "a")).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(solution.findRotateSteps("ab", "ab")).isEqualTo(3);
    }

    @Test
    void leet4() {
        assertThat(solution.findRotateSteps("godd", "godd")).isEqualTo(6);
    }

    @Test
    void leet5() {
        assertThat(solution.findRotateSteps("abcde", "ade")).isEqualTo(6);
    }

    @Test
    void leet6() {
        assertThat(solution.findRotateSteps("abcde", "ad")).isEqualTo(4);
    }


}