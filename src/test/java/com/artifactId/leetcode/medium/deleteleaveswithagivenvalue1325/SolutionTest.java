package com.artifactId.leetcode.medium.deleteleaveswithagivenvalue1325;

import com.artifactId.NodeUtils;
import com.artifactId.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        TreeNode root = NodeUtils.parseTreeNode("[1,2,3,2,null,2,4]");
        TreeNode expected = NodeUtils.parseTreeNode("[1,null,3,null,4]");
        assertThat(solution.removeLeafNodes(root, 2))
                .isEqualTo(expected);

    }
}