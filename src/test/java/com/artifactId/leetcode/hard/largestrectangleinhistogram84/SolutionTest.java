package com.artifactId.leetcode.hard.largestrectangleinhistogram84;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.largestRectangleArea(new int[]{1,2,3,2,1,1,2})).isEqualTo(7);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3, 1})).isEqualTo(10);
    }

}