package com.artifactId.leetcode.easy.binarysearchtree;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    @Test
    void shouldFindExisting() {
        Solution solution = new Solution();
        int[] array = IntStream.range(1, 33).toArray();
        assertThat(solution.search(array, 1)).isEqualTo(0);
        assertThat(solution.search(array, 32)).isEqualTo(31);

        array = IntStream.range(1, 32).toArray();
        assertThat(solution.search(array, 1)).isEqualTo(0);
        assertThat(solution.search(array, 31)).isEqualTo(30);
        array = IntStream.range(1, 2).toArray();
        assertThat(solution.search(array, 1)).isEqualTo(0);

        array = IntStream.range(1, 3).toArray();
        assertThat(solution.search(array, 1)).isEqualTo(0);
        assertThat(solution.search(array, 2)).isEqualTo(1);
    }


    @Test
    void shouldReturnMinusOneIfNumberNotInArray() {
        Solution solution = new Solution();
        assertThat(solution.search(new int[]{1, 2, 4, 5, 6, 7, 8, 9}, 3)).isEqualTo(-1);
    }

}