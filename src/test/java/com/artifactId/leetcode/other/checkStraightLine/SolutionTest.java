package com.artifactId.leetcode.other.checkStraightLine;

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
    boolean result = solution.checkStraightLine(
      new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}});
    boolean expected = true;

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    boolean result = solution.checkStraightLine(
      new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
    boolean expected = false;

    Assertions.assertEquals(expected, result);
  }

}
