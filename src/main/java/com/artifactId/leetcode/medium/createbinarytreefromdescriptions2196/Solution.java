package com.artifactId.leetcode.medium.createbinarytreefromdescriptions2196;

import com.artifactId.leetcode.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(int[] descriptior: descriptions) {
            nodes.putIfAbsent(descriptior[0], new TreeNode(descriptior[0]));
            nodes.putIfAbsent(descriptior[1], new TreeNode(descriptior[1]));
            TreeNode parent = nodes.get(descriptior[0]);
            TreeNode child = nodes.get(descriptior[1]);
            if (descriptior[2] == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            children.add(descriptior[1]);
        }

        Integer rootVal = nodes.keySet().stream().filter(value -> !children.contains(value)).findFirst().orElseThrow();
        return nodes.get(rootVal);
    }

}
