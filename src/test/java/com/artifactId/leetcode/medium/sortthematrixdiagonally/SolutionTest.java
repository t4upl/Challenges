package com.artifactId.leetcode.medium.sortthematrixdiagonally;

import com.artifactId.leetcode.TestUtils;
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
    int[][] mat = TestUtils.toTwoDimArray("[[3,3,1,1],[2,2,1,2],[1,1,1,2]]");
    int[][] expected = TestUtils.toTwoDimArray("[[1,1,1,1],[1,2,2,2],[1,2,3,3]]");
    int[][] result = solution.diagonalSort(mat);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test1() {
    int[][] mat = TestUtils.toTwoDimArray("[[3]]");
    int[][] expected = TestUtils.toTwoDimArray("[[3]]");
    int[][] result = solution.diagonalSort(mat);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test2() {
    int[][] mat = TestUtils.toTwoDimArray("[[3, 1]]");
    int[][] expected = TestUtils.toTwoDimArray("[[3, 1]]");
    int[][] result = solution.diagonalSort(mat);
    Assert.assertArrayEquals(expected, result);
  }


}