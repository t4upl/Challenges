package com.artifactId.leetcode.medium.smallestsubtreewithalldeepestnodes;

import com.artifactId.NodeUtils;
import com.artifactId.TreeNode;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void test1() {
    TreeNode root = NodeUtils.parseTreeNode("[1,2,3,null, null, 4]");
    TreeNode expected = root.right.left;
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    TreeNode root = NodeUtils.parseTreeNode("[1,2,3,null, null, 4, 5, 6, null, null, 7]");
    TreeNode expected = root.right;
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet1() {
    TreeNode root = NodeUtils.parseTreeNode("[3,5,1,6,2,0,8,null,null,7,4]");
    TreeNode expected = root.left.right;
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    TreeNode root = NodeUtils.parseTreeNode("[1]");
    TreeNode expected = root;
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    TreeNode root = NodeUtils.parseTreeNode("[0,1,3,null,2]");
    TreeNode expected = root.left.right;
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(expected, result);
  }


}