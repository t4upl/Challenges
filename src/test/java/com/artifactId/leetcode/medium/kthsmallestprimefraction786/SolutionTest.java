package com.artifactId.leetcode.medium.kthsmallestprimefraction786;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.kthSmallestPrimeFraction(TestUtils.toArray("[1,2,3,5]"), 3)).isEqualTo(new int[]{2,5});
    }

    @Test
    void leet2() {
        Solution solution = new Solution();
        assertThat(solution.kthSmallestPrimeFraction(TestUtils.toArray("[1,7]"), 1)).isEqualTo(new int[]{1,7});
    }

}