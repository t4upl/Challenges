package com.artifactId.leetcode.medium.allancestorsofanodeinadirectedacyclicgraph192;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    @Test
    void leet1() {

        Solution solution = new Solution();
        int[][] input = TestUtils.toMatrix("[[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]");
        List<List<Integer>> expected = TestUtils.toTwoDimList("[[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]");
        assertThat(solution.getAncestors(8, input))
                .isEqualTo(expected);
    }

    @Test
    void test1() {
        Solution solution = new Solution();
        int[][] input = TestUtils.toMatrix("[[0,1],[1,4],[0,2],[2,4],[0,3],[3,2]]");
        List<List<Integer>> expected = TestUtils.toTwoDimList("[[], [0], [0, 3], [0], [0, 1, 2, 3]]");
        assertThat(solution.getAncestors(5, input))
                .isEqualTo(expected);
    }

}