package com.artifactId.leetcode.medium.doubleanumberrepresentedasalinkedlist2816;

import com.artifactId.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.doubleIt(ListNodeUtils.toListNode("[9,9,9]"))).isEqualTo(ListNodeUtils.toListNode("[1,9,9,8]"));
    }

    @Test
    void leet3() {
        Solution solution = new Solution();
        assertThat(solution.doubleIt(ListNodeUtils.toListNode("[3,4,5,4,2,5,5,9,9,9]"))).isEqualTo(ListNodeUtils.toListNode("[6,9,0,8,5,1,1,9,9,8]"));
    }
}