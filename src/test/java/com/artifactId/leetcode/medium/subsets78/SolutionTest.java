package com.artifactId.leetcode.medium.subsets78;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.subsets(TestUtils.toArray("[1,2,3]"))).isEqualTo(TestUtils.toMatrix("[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]"));
    }
}