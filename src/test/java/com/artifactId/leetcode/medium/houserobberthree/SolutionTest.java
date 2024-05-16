package com.artifactId.leetcode.medium.houserobberthree;

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
    TreeNode root = NodeUtils.parseTreeNode("[3,2,3,null,3,null,1]");
    int expected = 7;
    int result = solution.rob(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    TreeNode root = NodeUtils.parseTreeNode("[3,4,5,1,3,null,1]");
    int expected = 9;
    int result = solution.rob(root);
    Assert.assertEquals(expected, result);
  }


}