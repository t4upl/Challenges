package com.artifactId.leetcode.medium.deleteleaveswithagivenvalue1325;

import com.artifactId.leetcode.TreeNode;

public class Solution {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

}
