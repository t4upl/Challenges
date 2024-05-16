package com.artifactId.leetcode.medium.addonerowtotree;

import com.artifactId.NodeUtils;
import com.artifactId.leetcode.TreeNode;
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
  public void leet1() {
    TreeNode root = NodeUtils.parseTreeNode("[4,2,6,3,1,5]");
    int val = 1;
    int depth = 2;
    TreeNode expected = NodeUtils.parseTreeNode("[4,1,1,2,null,null,6,3,1,5]");
    TreeNode result = solution.addOneRow(root, val, depth);

    String resultString = NodeUtils.toString(result);
    String expectedString = NodeUtils.toString(expected);
    Assert.assertEquals(expectedString, resultString);
  }

  @Test
  public void leet2() {
    TreeNode root = NodeUtils.parseTreeNode("[4,2,null,3,1]");
    int val = 1;
    int depth = 3;
    TreeNode expected = NodeUtils.parseTreeNode("[4,2,null,1,1,3,null,null,1]");
    TreeNode result = solution.addOneRow(root, val, depth);
    String resultString = NodeUtils.toString(result);
    String expectedString = NodeUtils.toString(expected);
    Assert.assertEquals(expectedString, resultString);
  }

  @Test
  public void test1() {
    TreeNode root = NodeUtils.parseTreeNode("[]");
    int val = 1;
    int depth = 1;
    TreeNode expected = NodeUtils.parseTreeNode("[1]");
    TreeNode result = solution.addOneRow(root, val, depth);
    String resultString = NodeUtils.toString(result);
    String expectedString = NodeUtils.toString(expected);
    Assert.assertEquals(expectedString, resultString);
  }

  @Test
  public void test2() {
    TreeNode root = NodeUtils.parseTreeNode("[4,2,null,3,1]");
    int val = 5;
    int depth = 4;
    TreeNode expected = NodeUtils.parseTreeNode("[4,2,null,3,1,5,5,5,5]");
    TreeNode result = solution.addOneRow(root, val, depth);
    String resultString = NodeUtils.toString(result);
    String expectedString = NodeUtils.toString(expected);
    Assert.assertEquals(expectedString, resultString);
  }


}