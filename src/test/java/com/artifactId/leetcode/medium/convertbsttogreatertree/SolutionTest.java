package com.artifactId.leetcode.medium.convertbsttogreatertree;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import com.artifactId.TreeNode;
import javax.xml.soap.Node;
import org.junit.Before;
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
    TreeNode root = NodeUtils
      .parseTreeNode("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]");

    TreeNode expected = NodeUtils
      .parseTreeNode("[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]");

    TreeNode result = solution.convertBST(root);

    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    TreeNode root = NodeUtils
      .parseTreeNode("[0,-2,3,null,-1,null,4]");

    TreeNode expected = NodeUtils
      .parseTreeNode("[7,4,7,null,6,null,4]");

    TreeNode result = solution.convertBST(root);

    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    TreeNode root = NodeUtils
      .parseTreeNode("[-3,-4,0,null,null,-2,1]");

    TreeNode expected = NodeUtils
      .parseTreeNode("[-4,-8,1,null,null,-1,1]");

    TreeNode result = solution.convertBST(root);

    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet5() {
    TreeNode root = NodeUtils.parseTreeNode("[4,-3,null,null,0,-1,2]");
    TreeNode expected = NodeUtils.parseTreeNode("[4,2,null,null,6,5,6]");
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test1() {
    TreeNode root = NodeUtils.parseTreeNode("[7,null,8]");
    TreeNode expected = NodeUtils.parseTreeNode("[15, null,8]");
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(expected, result);
  }


}