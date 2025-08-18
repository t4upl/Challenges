package com.artifactId.leetcode.easy.maximum69number1323;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().maximum69Number(9669)).isEqualTo(9969);
    }

    @Test
    void test2() {
        assertThat(new Solution().maximum69Number(6)).isEqualTo(9);
    }


}