package com.artifactId.leetcode.medium.createbinarytreefromdescriptions2196;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().createBinaryTree(TestUtils.toTwoDimArray("[[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]")))
                .isEqualTo(NodeUtils.parseTreeNode("[50,20,80,15,17,19]"));
    }
}