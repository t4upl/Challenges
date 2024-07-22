package com.artifactId.leetcode.medium.deletenodesandreturnforest1110;

import com.artifactId.leetcode.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> toDelete = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        List<TreeNode> roots = new LinkedList<>();
        dfs(root, roots, toDelete,  true);
        roots.forEach(newRoot -> dfsDelete(newRoot, toDelete));

        return roots;
    }

    private void dfsDelete(TreeNode root, Set<Integer> toDelete) {
        if (root == null) {
            return;
        }

        if (root.left != null && toDelete.contains(root.left.val)) {
            root.left = null;
        }

        if (root.right != null && toDelete.contains(root.right.val)) {
            root.right = null;
        }

        dfsDelete(root.left, toDelete);
        dfsDelete(root.right, toDelete);

    }

    private void dfs(TreeNode root, List<TreeNode> roots, Set<Integer> toDelete, boolean parentDeleted) {
        if (root == null) {
            return;
        }

        boolean nodeDeleted = toDelete.contains(root.val);
        if (parentDeleted && !nodeDeleted) {
            roots.add(root);
        }

        dfs(root.left, roots, toDelete, nodeDeleted);
        dfs(root.right, roots, toDelete, nodeDeleted);
    }


}
