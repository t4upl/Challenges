package com.artifactId.leetcode.medium.minimumheighttrees310;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution2 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution2();
    }

    @Test
    void leet1() {
        
        assertThat(solution.findMinHeightTrees(6, TestUtils.toMatrix("[[3,0],[3,1],[3,2],[3,4],[5,4]]")))
                .containsAll(List.of(3, 4));
    }

    @Test
    void leet2() {
        
        assertThat(solution.findMinHeightTrees(2, TestUtils.toMatrix("[[0,1]]")))
                .containsAll(List.of(0, 1));
    }

    @Test
    void leet3() {

        // first pass: 6,5,0
        // second pass: 4,3
        
        assertThat(solution.findMinHeightTrees(7, TestUtils.toMatrix("[[0,1],[1,2],[1,3],[2,4],[3,5],[4,6]]")))
                .containsAll(List.of(1, 2));
    }

    @Test
    void leet4() {

        assertThat(solution.findMinHeightTrees(4, TestUtils.toMatrix("[[1,0],[1,2],[1,3]]")))
                .containsAll(List.of(1));
    }

    @Test
    void leet5() {
        assertThat(solution.findMinHeightTrees(1, TestUtils.toMatrix("[]")))
                .containsAll(List.of(0));
    }

    @Test
    void test1() {
        
        assertThat(solution.findMinHeightTrees(6, TestUtils.toMatrix("[[0,1],[1,2],[1,3],[3,4],[3,5]]")))
                .containsAll(List.of(3, 1));
    }

    @Test
    void test2() {
        assertThat(solution.findMinHeightTrees(2, TestUtils.toMatrix("[[0,1]]")))
                .containsAll(List.of(0, 1));
    }

}