package com.artifactId.leetcode.medium.minimumtimedifference539;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().findMinDifference(List.of("23:59","00:00"))).isEqualTo(1);
    }

    @Test
    void leet2() {
        assertThat(new Solution().findMinDifference(List.of("00:00","23:59","00:00"))).isEqualTo(0);
    }

}