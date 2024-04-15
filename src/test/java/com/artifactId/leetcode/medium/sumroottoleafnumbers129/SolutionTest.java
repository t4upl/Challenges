package com.artifactId.leetcode.medium.sumroottoleafnumbers129;

import com.artifactId.NodeUtils;
import com.artifactId.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        TreeNode treeNode = NodeUtils.parseTreeNode("[4,9,0,5,1]");

        Solution solution = new Solution();
        assertThat(solution.sumNumbers(treeNode)).isEqualTo(1026);
    }
}