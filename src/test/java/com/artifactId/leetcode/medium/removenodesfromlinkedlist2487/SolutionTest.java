package com.artifactId.leetcode.medium.removenodesfromlinkedlist2487;

import com.artifactId.ListNodeUtils;
import com.artifactId.leetcode.other.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.removeNodes(ListNodeUtils.toListNode("[5,2,13,3,8]"))).isEqualTo(ListNodeUtils.toListNode("[13,8]"));
    }

    @Test
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.removeNodes(ListNodeUtils.toListNode("[5]"))).isEqualTo(ListNodeUtils.toListNode("[5]"));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.removeNodes(ListNodeUtils.toListNode("[5,4]"))).isEqualTo(ListNodeUtils.toListNode("[5,4]"));
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        assertThat(solution.removeNodes(ListNodeUtils.toListNode("[5,6]"))).isEqualTo(ListNodeUtils.toListNode("[6]"));
    }


}