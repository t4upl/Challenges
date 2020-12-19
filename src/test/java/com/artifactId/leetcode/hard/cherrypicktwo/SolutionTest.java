package com.artifactId.leetcode.hard.cherrypicktwo;

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
    int[][] grid = {{3,1,1}, {2,5,1}, {1,5,5}, {2,1,1}};
    int expected = 24;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[][] grid = {{1,0,0,0,0,0,1},{2,0,0,0,0,3,0},{2,0,9,0,0,0,0},{0,3,0,5,4,0,0},{1,0,2,3,0,0,6}};
    int expected = 28;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[][] grid = {{1,0,0,3},{0,0,0,3},{0,0,3,3},{9,0,3,3}};
    int expected = 22;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet4() {
    int[][] grid = {{1,1},{1,1}};
    int expected = 4;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void tets1() {
    int[][] grid = {{10}};
    int expected = 10;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void tets2() {
    int[][] grid = {{10, 1, 20}, {1, 30, 40}, {50, 1, 60}, {90, 80, 1}};
    int expected = 380;
    int result = solution.cherryPickup(grid);
    Assert.assertEquals(expected, result);
  }






}