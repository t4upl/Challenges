package com.artifactId.leetcode.medium.verticalordertraversalofabinarytree;

import static com.artifactId.NodeUtils.parseTreeNode;

import com.artifactId.TestUtils;
import com.artifactId.TreeNode;
import java.util.List;
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
    TreeNode root = parseTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> expected = TestUtils.toTwoDimList("[[9],[3,15],[20],[7]]");
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    TreeNode root = parseTreeNode("[1,2,3,4,5,6,7]");
    List<List<Integer>> expected = TestUtils.toTwoDimList("[[4],[2],[1,5,6],[3],[7]]");
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    TreeNode root = parseTreeNode("[0,8,1,null,null,3,2,null,4,5,null,null,7,6]");
    List<List<Integer>> expected = TestUtils.toTwoDimList("[[8],[0,3,6],[1,4,5],[2,7]]");
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    TreeNode root = parseTreeNode("[0,2,1,3,null,null,null,4,5,null,7,6,null,10,8,11,9]");
    List<List<Integer>> expected = TestUtils.toTwoDimList("[[4,10,11],[3,6,7],[2,5,8,9],[0],[1]]");
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(expected, result);
  }




}