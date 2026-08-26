package com.artifactId.leetcode.easy.smallestmissingmultipleofk3718;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        int i = new Solution().missingMultiple(new int[]{8, 2, 3, 4, 6}, 2);
        assertThat(i).isEqualTo(10);
    }

    @Test
    void leet2() {
        int i = new Solution().missingMultiple(new int[]{1,4,7,10,15}, 5);
        assertThat(i).isEqualTo(5);
    }

    @Test
    void leet3() {
        int i = new Solution().missingMultiple(new int[]{99}, 99);
        assertThat(i).isEqualTo(198);
    }

    @Test
    void test1() {
        int i = new Solution().missingMultiple(new int[]{1,4,7,5,15}, 5);
        assertThat(i).isEqualTo(10);
    }

    @Test
    void test2() {
        int i = new Solution().missingMultiple(new int[]{98}, 99);
        assertThat(i).isEqualTo(99);
    }

}