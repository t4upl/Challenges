package com.artifactId.leetcode.medium.searchtwodmatrix;

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
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int target = 3;
    boolean expected = true;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int target = 13;
    boolean expected = false;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[][] matrix =  {};
    int target = 0;
    boolean expected = false;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int target = 23;
    boolean expected = true;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int target = 50;
    boolean expected = true;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[][] matrix = {{50}};
    int target = 50;
    boolean expected = true;
    boolean result = solution.searchMatrix(matrix, target);
    Assert.assertEquals(expected, result);
  }


}