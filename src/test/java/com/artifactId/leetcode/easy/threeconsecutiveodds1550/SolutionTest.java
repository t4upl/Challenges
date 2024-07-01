package com.artifactId.leetcode.easy.threeconsecutiveodds1550;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet10() {
        Solution solution = new Solution();
        assertThat(solution.threeConsecutiveOdds(TestUtils.toArray("[1,1,1]"))).isTrue();
        assertThat(solution.threeConsecutiveOdds(TestUtils.toArray("[1,1]"))).isFalse();
    }
}