package com.artifactId.leetcode.medium.spiralmatrixtwo;

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
  public void test1() {
    int n = 1;
    int[][] result = solution.generateMatrix(n);
    int[][] expected = new int[n][n];
    expected[0][0] = 1;
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int n = 2;
    int[][] result = solution.generateMatrix(n);
    int[][] expected = new int[n][n];
    expected[0][0] = 1;
    expected[0][1] = 2;
    expected[1][1] = 3;
    expected[1][0] = 4;
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int n = 4;
    int[][] result = solution.generateMatrix(n);
    int[][] expected = new int[n][n];

    expected[0][0] = 1;
    expected[0][1] = 2;
    expected[0][2] = 3;
    expected[0][3] = 4;

    expected[1][3] = 5;
    expected[2][3] = 6;

    expected[3][3] = 7;
    expected[3][2] = 8;
    expected[3][1] = 9;
    expected[3][0] = 10;

    expected[2][0] = 11;
    expected[1][0] = 12;

    expected[1][1] = 13;
    expected[1][2] = 14;

    expected[2][2] = 15;
    expected[2][1] = 16;


    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet1() {
    int n = 3;
    int[][] result = solution.generateMatrix(n);
    int[][] expected = new int[n][n];
    expected[0][0] = 1;
    expected[0][1] = 2;
    expected[0][2] = 3;

    expected[1][2] = 4;

    expected[2][2] = 5;
    expected[2][1] = 6;
    expected[2][0] = 7;

    expected[1][0] = 8;
    expected[1][1] = 9;

    Assert.assertEquals(expected, result);
  }


}