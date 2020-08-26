package com.artifactId.leetcode.maximumwidthofbinarytree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumWidthOfBinaryTreeTest {

  MaximumWidthOfBinaryTreeSolution maximumWidthOfBinaryTreeSolution;

  @Before
  public void setup() {
    maximumWidthOfBinaryTreeSolution = new MaximumWidthOfBinaryTreeSolutionImpl();
  }

  @Test
  public void leetTest1() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode5 = new TreeNode(5);
    TreeNode treeNode3_2 = new TreeNode(3);
    TreeNode treeNode9 = new TreeNode(9);

    treeNode.setChildren(treeNode3, treeNode2);
    treeNode3.setChildren(treeNode5, treeNode3_2);
    treeNode2.setChildren(null, treeNode9);

    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(4, width);
  }

  @Test
  public void leetTest2() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode5 = new TreeNode(5);

    treeNode.setChildren(treeNode3, treeNode2);
    treeNode3.setChildren(treeNode5, null);

    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(2, width);
  }

  @Test
  public void leetTest3() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode5 = new TreeNode(5);
    TreeNode treeNode9 = new TreeNode(9);
    TreeNode treeNode6 = new TreeNode(6);
    TreeNode treeNode7 = new TreeNode(7);

    treeNode.setChildren(treeNode3, treeNode2);
    treeNode3.setChildren(treeNode5, null);
    treeNode2.setChildren(null, treeNode9);
    treeNode5.setChildren(treeNode6, null);
    treeNode9.setChildren(null, treeNode7);

    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(8, width);
  }

  @Test
  public void test1() {
    TreeNode treeNode = new TreeNode(1);
    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(1, width);
  }

  @Test
  public void test2() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode2 = new TreeNode(2);

    treeNode.setChildren(treeNode3, treeNode2);
    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(2, width);
  }


  @Test
  public void test3() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode2 = new TreeNode(2);

    treeNode.setChildren(null, treeNode2);
    int width = maximumWidthOfBinaryTreeSolution.widthOfBinaryTree(treeNode);
    Assert.assertEquals(1, width);
  }

}
