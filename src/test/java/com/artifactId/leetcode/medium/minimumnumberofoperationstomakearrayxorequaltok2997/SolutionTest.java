package com.artifactId.leetcode.medium.minimumnumberofoperationstomakearrayxorequaltok2997;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.minOperations(new int[]{2,1,3,4}, 1)).isEqualTo(2);
    }

    @Test
    void leet2() {
        Solution solution = new Solution();
        assertThat(solution.minOperations(new int[]{9,7,9,14,8,6}, 12)).isEqualTo(3);

    }
}