package com.artifactId.leetcode.medium.pathwithmaximumgold1219;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.getMaximumGold(TestUtils.toMatrix("[[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]"))).isEqualTo(28);
    }
}