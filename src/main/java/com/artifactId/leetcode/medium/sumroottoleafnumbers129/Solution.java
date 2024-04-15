package com.artifactId.leetcode.medium.sumroottoleafnumbers129;


import com.artifactId.TreeNode;

public class Solution {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int value) {
        if (root == null) {
            return 0;
        }

        int temp = 10 * value + root.val;
        if (root.left == null && root.right == null) {
            return temp;
        }
        return sumNumbers(root.left, temp ) + sumNumbers(root.right, temp);
    }

}
