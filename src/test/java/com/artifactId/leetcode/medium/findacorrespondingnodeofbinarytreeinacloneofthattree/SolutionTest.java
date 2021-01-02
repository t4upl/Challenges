package com.artifactId.leetcode.medium.findacorrespondingnodeofbinarytreeinacloneofthattree;

import com.artifactId.leetcode.TestUtils;
import com.artifactId.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    String tree = "[7,4,3,null,null,6,19]";
    int targetValue = 3;
    TreeNode original = TestUtils.parseTreeNode(tree);
    TreeNode copy = TestUtils.parseTreeNode(tree);
    TreeNode target = TestUtils.findNodeWithValue(original, targetValue);
    TreeNode expected = TestUtils.findNodeWithValue(copy, targetValue);
    TreeNode result = solution.getTargetCopy(original, copy, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String tree = "[7]";
    int targetValue = 7;
    TreeNode original = TestUtils.parseTreeNode(tree);
    TreeNode copy = TestUtils.parseTreeNode(tree);
    TreeNode target = TestUtils.findNodeWithValue(original, targetValue);
    TreeNode expected = TestUtils.findNodeWithValue(copy, targetValue);
    TreeNode result = solution.getTargetCopy(original, copy, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String tree = "[8,null,6,null,5,null,4,null,3,null,2,null,1]";
    int targetValue = 4;
    TreeNode original = TestUtils.parseTreeNode(tree);
    TreeNode copy = TestUtils.parseTreeNode(tree);
    TreeNode target = TestUtils.findNodeWithValue(original, targetValue);
    TreeNode expected = TestUtils.findNodeWithValue(copy, targetValue);
    TreeNode result = solution.getTargetCopy(original, copy, target);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet4() {
    String tree = "[1,2,3,4,5,6,7,8,9,10]";
    int targetValue = 5;
    TreeNode original = TestUtils.parseTreeNode(tree);
    TreeNode copy = TestUtils.parseTreeNode(tree);
    TreeNode target = TestUtils.findNodeWithValue(original, targetValue);
    TreeNode expected = TestUtils.findNodeWithValue(copy, targetValue);
    TreeNode result = solution.getTargetCopy(original, copy, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet5() {
    String tree = "[1,2,null,3]";
    int targetValue = 2;
    TreeNode original = TestUtils.parseTreeNode(tree);
    TreeNode copy = TestUtils.parseTreeNode(tree);
    TreeNode target = TestUtils.findNodeWithValue(original, targetValue);
    TreeNode expected = TestUtils.findNodeWithValue(copy, targetValue);
    TreeNode result = solution.getTargetCopy(original, copy, target);
    Assert.assertEquals(expected, result);
  }


}