package com.artifactId.leetcode.medium.isgraphbipartie;

import com.artifactId.TestUtils;
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
    int[][] graph = TestUtils.toTwoDimArray("[[1,2,3],[0,2],[0,1,3],[0,2]]");
    boolean expected = false;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[][] graph = TestUtils.toTwoDimArray("[[1,3],[0,2],[1,3],[0,2]]");
    boolean expected = true;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[][] graph = TestUtils.toTwoDimArray(
      "[[],[2,4,6],[1,4,8,9],[7,8],[1,2,8,9],[6,9],[1,5,7,8,9],[3,6,9],[2,3,4,6,9],[2,4,5,6,7,8]]");
    boolean expected = false;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[][] graph = TestUtils.toTwoDimArray("[[1],[2],[0]]");
    boolean expected = false;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[][] graph = TestUtils.toTwoDimArray("[[1],[0]]");
    boolean expected = true;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[][] graph = TestUtils.toTwoDimArray("[[1,3,4],[0,2],[1,3],[0,2],[0]]");
    boolean expected = true;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    int[][] graph = TestUtils.toTwoDimArray("[[1,3,4],[0,2],[1,3],[0,2],[0,3]]");
    boolean expected = false;
    boolean result = solution.isBipartite(graph);
    Assert.assertEquals(expected, result);
  }


}