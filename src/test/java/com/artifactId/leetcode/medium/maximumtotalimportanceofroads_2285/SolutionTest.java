package com.artifactId.leetcode.medium.maximumtotalimportanceofroads_2285;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.maximumImportance(5, TestUtils.toMatrix("[[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]"))).isEqualTo(43);
    }

    @Test
    void leet3() {
        Solution solution = new Solution();
        assertThat(solution.maximumImportance(5, TestUtils.toMatrix("[[0,1]]"))).isEqualTo(9);
    }

}