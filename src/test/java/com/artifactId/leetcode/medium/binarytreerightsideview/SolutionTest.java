package com.artifactId.leetcode.medium.binarytreerightsideview;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import com.artifactId.leetcode.TreeNode;
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
    TreeNode root = NodeUtils.parseTreeNode("[1,2,3,null,5,null,4]");
    List<Integer> expected = TestUtils.toIntegerList("[1, 3, 4]");
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    TreeNode root = null;
    List<Integer> expected = TestUtils.toIntegerList("[]");
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    TreeNode root = NodeUtils.parseTreeNode("[1]");
    List<Integer> expected = TestUtils.toIntegerList("[1]");
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    TreeNode root = NodeUtils.parseTreeNode("[1, null, 2]");
    List<Integer> expected = TestUtils.toIntegerList("[1, 2]");
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(expected, result);
  }


}