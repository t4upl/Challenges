package com.artifactId.leetcode.easy.sumofleftleaves404;

import com.artifactId.NodeUtils;
import com.artifactId.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        TreeNode treeNode = NodeUtils.parseTreeNode("[3,9,20,null,null,15,7]");
        assertThat(solution.sumOfLeftLeaves(treeNode)).isEqualTo(24);

        treeNode = NodeUtils.parseTreeNode("[3,9]");
        assertThat(solution.sumOfLeftLeaves(treeNode)).isEqualTo(9);

        treeNode = NodeUtils.parseTreeNode("[3,null,20]");
        assertThat(solution.sumOfLeftLeaves(treeNode)).isEqualTo(0);

    }
}