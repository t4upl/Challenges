package com.artifactId.leetcode.medium.boatstosavepeople881;

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
        assertThat(solution.numRescueBoats(new int[]{1,2}, 3)).isEqualTo(1);
    }

    @Test
    void leet2() {
        assertThat(solution.numRescueBoats(new int[]{3,2,2,1}, 3)).isEqualTo(3);
    }

    @Test
    void leet3() {
        assertThat(solution.numRescueBoats(new int[]{3,5,3,4}, 3)).isEqualTo(4);
    }

    @Test
    void test1() {
        assertThat(solution.numRescueBoats(new int[]{1}, 3)).isEqualTo(1);
    }



}