package com.artifactId.leetcode.medium.flipbinarytreetomatchpreordertraversal;

import com.artifactId.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Flip Binary Tree To Match Preorder Traversal.
 * Memory Usage: 38.8 MB, less than 81.76% of Java online submissions for Flip Binary Tree To Match Preorder Traversal.
 */
public class Solution {

  private List<Integer> ans = new ArrayList<>();
  private int index = -1;
  private boolean failed = false;

  public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
    ans = new ArrayList<>(voyage.length);
    preorder(root, voyage);

    if (failed) {
      ans.clear();
      ans.add(-1);
    }

    return ans;
  }

  private void preorder(TreeNode root, int[] voyage) {
    if (root == null || failed) {
      return;
    }

    this.index += 1;

    if (voyage[index] != root.val) {
      failed = true;
      return;
    }

    int childrenCount = getChildrenCount(root);
    if (childrenCount == 2 && voyage[index + 1] != root.left.val) {
      TreeNode left = root.left;
      root.left = root.right;
      root.right = left;
      ans.add(root.val);
    }

    preorder(root.left, voyage);
    preorder(root.right, voyage);
  }

  private int getChildrenCount(TreeNode root) {
    int left = root.left == null ? 0 : 1;
    int right = root.right == null ? 0 : 1;
    return left + right;
  }

}
