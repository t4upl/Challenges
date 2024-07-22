package com.artifactId.leetcode.medium.deletenodesandreturnforest1110;

import com.artifactId.NodeUtils;
import com.artifactId.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        TreeNode treeNode = NodeUtils.parseTreeNode("[1,2,3,4,5,6,7]");

        TreeNode answer1 = NodeUtils.parseTreeNode("[1,2,null,4]");
        TreeNode answer2 = NodeUtils.parseTreeNode("[6]");
        TreeNode answer3 = NodeUtils.parseTreeNode("[7]");

        assertThat(new Solution().delNodes(treeNode, Stream.of(3,5).mapToInt(x -> x).toArray()))
                .containsOnly(answer1, answer2, answer3);
    }

    @Test
    void leet21() {
        TreeNode treeNode = NodeUtils.parseTreeNode("[1,null,2,3,null,4,null,5]");
        TreeNode answer1 = NodeUtils.parseTreeNode("[1,null,2]");
        TreeNode answer2 = NodeUtils.parseTreeNode("[4]");

        assertThat(new Solution().delNodes(treeNode, Stream.of(3,5).mapToInt(x -> x).toArray()))
                .containsOnly(answer1, answer2);
    }


}