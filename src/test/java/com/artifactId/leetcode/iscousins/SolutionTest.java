package com.artifactId.leetcode.iscousins;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new SolutionImpl();
  }

  @Test
  public void leet1() {
    TreeNode one = new TreeNode(1);
    TreeNode two = new TreeNode(2);
    TreeNode three = new TreeNode(3);
    TreeNode four = new TreeNode(4);

    one.setLeft(two);
    one.setRight(three);

    two.setLeft(four);

    boolean result = solution.isCousins(one, 4, 3);
    Assertions.assertEquals(false, result);
  }

  @Test
  public void leet2() {
    TreeNode one = new TreeNode(1);
    TreeNode two = new TreeNode(2);
    TreeNode three = new TreeNode(3);
    TreeNode four = new TreeNode(4);
    TreeNode five = new TreeNode(5);

    one.setLeft(two);
    one.setRight(three);

    two.setLeft(four);
    three.setLeft(five);

    boolean result = solution.isCousins(one, 5, 4);
    Assertions.assertEquals(true, result);
  }

  @Test
  public void leet3() {
    TreeNode one = new TreeNode(1);
    TreeNode two = new TreeNode(2);
    TreeNode three = new TreeNode(3);
    TreeNode four = new TreeNode(4);

    one.setLeft(two);
    one.setRight(three);

    two.setLeft(four);

    boolean result = solution.isCousins(one, 2, 3);
    Assertions.assertEquals(false, result);
  }



}

