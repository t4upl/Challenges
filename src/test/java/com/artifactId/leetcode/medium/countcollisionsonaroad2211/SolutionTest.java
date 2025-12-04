package com.artifactId.leetcode.medium.countcollisionsonaroad2211;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void leet1() {
        assertThat(new Solution().countCollisions("RLRSLL")).isEqualTo(5);
    }

    @Test
    void leet2() {
        assertThat(new Solution().countCollisions("LLRR")).isEqualTo(0);
    }

    @Test
    void leet3() {
        assertThat(new Solution().countCollisions("LLRLRLLSLRLLSLSSSS")).isEqualTo(10);
    }

    @Test
    void test1() {
        assertThat(new Solution().countCollisions("LLR")).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(new Solution().countCollisions("LLRLR")).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(new Solution().countCollisions("LLRLRLL")).isEqualTo(5);
    }


}