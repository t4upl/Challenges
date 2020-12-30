package com.artifactId.leetcode.medium.gameoflife;

import com.artifactId.leetcode.TestUtils;
import java.util.Arrays;
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
    String boardString = "[[0,1,0],[0,0,1],[1,1,1],[0,0,0]]";
    int[][] board = TestUtils.toMatrix(boardString);
    String expectedString = "[[0,0,0],[1,0,1],[0,1,1],[0,1,0]]";
    int[][] expected = TestUtils.toMatrix(expectedString);
    solution.gameOfLife(board);
    Assert.assertTrue(Arrays.deepEquals(expected, board));
  }

  @Test
  public void leet2() {
    String boardString = "[[1,1],[1,0]]";
    int[][] board = TestUtils.toMatrix(boardString);
    String expectedString = "[[1,1],[1,1]]";
    int[][] expected = TestUtils.toMatrix(expectedString);
    solution.gameOfLife(board);
    Assert.assertTrue(Arrays.deepEquals(expected, board));
  }


}