package com.artifactId.leetcode.medium.findacorrespondingnodeofbinarytreeinacloneofthattree;

import com.artifactId.TreeNode;
import java.util.LinkedList;
import java.util.List;


/**
 * Runtime: 3 ms, faster than 22.84% of Java online submissions for Find texteditor Corresponding Node of texteditor Binary Tree in texteditor Clone of That Tree.
 * Memory Usage: 46.7 MB, less than 63.40% of Java online submissions for Find texteditor Corresponding Node of texteditor Binary Tree in texteditor Clone of That Tree.
 *
 * Follow up: Solve the problem if repeated values on the tree are allowed.
 */
public class Solution {

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
    final TreeNode target) {

    if (original == target) {
      return cloned;
    }

    // false = left, true - right
    List<Boolean> path = new LinkedList<>();
    dfs(original, target, new LinkedList<>(), path);

    return getNodeFromPath(cloned, path);
  }

  private TreeNode getNodeFromPath(TreeNode cloned, List<Boolean> path) {
    for (Boolean aBoolean : path) {
      if (aBoolean) {
        cloned = cloned.right;
      } else {
        cloned = cloned.left;
      }
    }
    return cloned;
  }

  private void dfs(TreeNode original, TreeNode target, List<Boolean> acc,
    List<Boolean> result) {
    if (original == null || result.size() != 0) {
      return;
    }

    if (original == target) {
      result.addAll(acc);
      return;
    }

    acc.add(false);
    dfs(original.left, target, acc, result);
    acc.remove(acc.size() - 1);

    acc.add(true);
    dfs(original.right, target, acc, result);
    acc.remove(acc.size() - 1);
  }

}
