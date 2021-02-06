package com.artifactId.leetcode.medium.pseudopalindromicpathsinbinarytree;

import static com.artifactId.NodeUtils.parseTreeNode;

import com.artifactId.TestUtils;
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
  public void leet1() {
    TreeNode root = parseTreeNode("[2,3,1,3,1,null,1]");
    int expected = 2;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    TreeNode root = parseTreeNode("[2,1,1,1,3,null,null,null,null,null,1]");
    int expected = 1;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    TreeNode root = parseTreeNode("[9]");
    int expected = 1;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    TreeNode root = parseTreeNode("[]");
    int expected = 0;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    TreeNode root = parseTreeNode("[2,2,1]");
    int expected = 1;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    TreeNode root = parseTreeNode("[2,2,2]");
    int expected = 2;
    int result = solution.pseudoPalindromicPaths(root);
    Assert.assertEquals(expected, result);
  }


}