package com.artifactId.leetcode.medium.maximumdistanceinarrays624;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void leet1() {
        assertThat(new Solution().maxDistance(TestUtils.toTwoDimList("[[1,2,3],[4,5],[1,2,3]]"))).isEqualTo(4);
    }

    @Test
    void leet2() {
        assertThat(new Solution().maxDistance(TestUtils.toTwoDimList("[[1],[1]]"))).isEqualTo(0);
    }

}