package com.artifactId.leetcode.easy.binarytreetilt;

import com.artifactId.NodeUtils;
import com.artifactId.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    TreeNode root = NodeUtils.parseTreeNode("[1,2,3]");
    int expected = 1;
    int result = solution.findTilt(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    TreeNode root = NodeUtils.parseTreeNode("[4,2,9,3,5,null,7]");
    int expected = 15;
    int result = solution.findTilt(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    TreeNode root = NodeUtils.parseTreeNode("[21,7,14,1,1,2,2,3,3]");
    int expected = 9;
    int result = solution.findTilt(root);
    Assert.assertEquals(expected, result);
  }


}