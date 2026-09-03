package com.artifactId.leetcode.medium.constructuniformparityarray2_3876;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        boolean result = new Solution().uniformArray(new int[]{0, 2, 4});
        assertThat(result).isTrue();
    }

    @Test
    void leet1() {
        boolean result = new Solution().uniformArray(new int[]{1,4,7});
        assertThat(result).isTrue();
    }

    @Test
    void leet2() {
        boolean result = new Solution().uniformArray(new int[]{2,3});
        assertThat(result).isFalse();
    }

    @Test
    void leet3() {
        boolean result = new Solution().uniformArray(new int[]{4,6});
        assertThat(result).isTrue();
    }

    @Test
    void leet4() {
        boolean result = new Solution().uniformArray(new int[]{22,2,13});
        assertThat(result).isFalse();
    }


}