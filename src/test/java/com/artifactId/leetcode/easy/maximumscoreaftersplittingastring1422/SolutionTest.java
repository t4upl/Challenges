package com.artifactId.leetcode.easy.maximumscoreaftersplittingastring1422;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    @Test
    void leet3() {
        Solution solution = new Solution();
        assertThat(solution.maxScore("1111")).isEqualTo(3);
    }

    @Test
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.maxScore("0000")).isEqualTo(3);
    }
}