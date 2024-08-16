package com.artifactId.leetcode.medium.spiralmatrixiii885;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] expected = TestUtils.toMatrix("[[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]");
        assertThat(new Solution().spiralMatrixIII(rows, cols, rStart, cStart)).isEqualTo(expected);
    }


    @Test
    void test1() {
        int rows = 3, cols = 3, rStart = 1, cStart = 1;
//        int[][] answer = TestUtils.toMatrix("");
        int[][] actual = new Solution().spiralMatrixIII(rows, cols, rStart, cStart);
        assertThat(actual).isEqualTo(new int[3][3]);
    }
}