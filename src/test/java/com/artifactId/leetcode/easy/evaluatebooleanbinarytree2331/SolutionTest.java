package com.artifactId.leetcode.easy.evaluatebooleanbinarytree2331;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import com.artifactId.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        TreeNode treeNode = NodeUtils.parseTreeNode("[2,1,3,null,null,0,1]");
        assertThat(solution.evaluateTree(treeNode)).isEqualTo(true);
    }
}