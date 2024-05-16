package com.artifactId.leetcode.easy.evaluatebooleanbinarytree2331;

import com.artifactId.leetcode.TreeNode;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.val < 2) {
            return root.val == 1;
        }
        //OR
        if (root.val == 2) {
            if (root.left.val == 1 || root.right.val == 1) {
                return true;
            }

            boolean bool1 = evaluateTree(root.left);
            if (bool1) {
                return true;
            }
            return evaluateTree(root.right);
        }

        //AND
        if (root.val == 3) {
            if (root.left.val == 0 || root.right.val == 0) {
                return false;
            }

            boolean bool1 = evaluateTree(root.left);
            if (!bool1) {
                return false;
            }
            return evaluateTree(root.right);
        }
        throw new RuntimeException();
    }

}
