package com.artifactId.leetcode.easy.checkarrayformationthroughconcatenation;

import com.artifactId.TestUtils;
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
    String arrString = "[85]";
    String piecesString = "[[85]]";
    boolean expected = true;
    int[] arr = TestUtils.toArray(arrString);
    int[][] pieces = TestUtils.toMatrix(piecesString);
    boolean result = solution.canFormArray(arr, pieces);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String arrString = "[15,88]";
    String piecesString = " [[88],[15]]";
    boolean expected = true;
    int[] arr = TestUtils.toArray(arrString);
    int[][] pieces = TestUtils.toMatrix(piecesString);
    boolean result = solution.canFormArray(arr, pieces);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String arrString = "[49,18,16]";
    String piecesString = " [[16,18,49]]";
    boolean expected = false;
    int[] arr = TestUtils.toArray(arrString);
    int[][] pieces = TestUtils.toMatrix(piecesString);
    boolean result = solution.canFormArray(arr, pieces);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String arrString = " [91,4,64,78]";
    String piecesString = " [[78],[4,64],[91]]";
    boolean expected = true;
    int[] arr = TestUtils.toArray(arrString);
    int[][] pieces = TestUtils.toTwoDimArray(piecesString);
    boolean result = solution.canFormArray(arr, pieces);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet5() {
    String arrString = "  [1,3,5,7]";
    String piecesString = " [[2,4,6,8]]";
    boolean expected = false;
    int[] arr = TestUtils.toArray(arrString);
    int[][] pieces = TestUtils.toMatrix(piecesString);
    boolean result = solution.canFormArray(arr, pieces);
    Assert.assertEquals(expected, result);
  }


}