package com.artifactId.leetcode.other.constructbinarysearchtreefrompreordertraversal;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new SolutionImpl();
  }

  /**
         (8)
   */
  @Test
  public void test1() {
    TreeNode expected = new TreeNode(8);
    TreeNode treeNode = solution.bstFromPreorder(new int[]{8});
    Assertions.assertEquals(expected, treeNode);
  }

  /**
        (8)
       /
     (1)
   */
  @Test
  public void test2() {
    TreeNode expected = new TreeNode(8);
    expected.left =  new TreeNode(1);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{8, 1});
    Assertions.assertEquals(expected, treeNode);
  }


  /**
        (8)
       /  \
    (1)   (9)
   */
  @Test
  public void test3() {
    TreeNode expected = new TreeNode(8);
    expected.left =  new TreeNode(1);
    expected.right =  new TreeNode(9);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{8, 1, 9});
    Assertions.assertEquals(expected, treeNode);
  }

  /**
            (8)
           /  \
        (3)   (9)
       /
     (1)

   */
  @Test
  public void test4() {
    TreeNode expected = new TreeNode(8);
    TreeNode three = new TreeNode(3);
    expected.left = three;
    expected.right =  new TreeNode(9);

    three.left = new TreeNode(1);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{8, 3, 1, 9});
    Assertions.assertEquals(expected, treeNode);
  }

  /**
            (80)
           /  \
        (20)   (90)
       /  \
     (10)  (30)

   */
  @Test
  public void test5() {
    TreeNode expected = new TreeNode(80);
    TreeNode twenty = new TreeNode(20);
    expected.left = twenty;
    expected.right =  new TreeNode(90);

    twenty.left = new TreeNode(10);
    twenty.right = new TreeNode(30);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{80, 20, 10, 30, 90});
    Assertions.assertEquals(expected, treeNode);
  }

  /**
                (80)
               /  \
            (20)   (90)
           /  \
         (10)  (30)
        /
      (5)

   */
  @Test
  public void test6() {
    TreeNode expected = new TreeNode(80);
    TreeNode twenty = new TreeNode(20);
    expected.left = twenty;
    expected.right =  new TreeNode(90);

    TreeNode ten = new TreeNode(10);
    twenty.left = ten;
    twenty.right = new TreeNode(30);
    ten.left = new TreeNode(5);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{80, 20, 10, 5, 30, 90});
    Assertions.assertEquals(expected, treeNode);
  }


  /**
            (8)
            /  \
         (5)   (10)
         /  \     \
      (1)  (7)    (12)

   */
  @Test
  public void leet1() {
    TreeNode expected = new TreeNode(8);
    TreeNode five = new TreeNode(5);
    expected.left = five;
    TreeNode ten = new TreeNode(10);
    expected.right = ten;

    five.left = new TreeNode(1);
    five.right = new TreeNode(7);
    ten.right = new TreeNode(12);

    TreeNode treeNode = solution.bstFromPreorder(new int[]{8,5,1,7,10,12});
    Assertions.assertEquals(expected, treeNode);
  }


//            (80)
//                \
//                 (90)
//                /   \
//            (100)   (140)
//            /   \
//         (110)  (120)



}
