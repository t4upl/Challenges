package com.artifactId.leetcode.easy.shortestdistancetoacharacter;

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
    String s = "loveleetcode";
    char c = 'e';
    int[] expected = TestUtils.toArray("[3,2,1,0,1,0,0,1,2,2,1,0]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "aaab";
    char c = 'b';
    int[] expected = TestUtils.toArray("[3,2,1,0]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "aaba";
    char c = 'b';
    int[] expected = TestUtils.toArray("[2,1,0,1]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test1() {
    String s = "cabc";
    char c = 'c';
    int[] expected = TestUtils.toArray("[0,1,1,0]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test2() {
    String s = "c";
    char c = 'c';
    int[] expected = TestUtils.toArray("[0]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test3() {
    String s = "cab";
    char c = 'c';
    int[] expected = TestUtils.toArray("[0,1,2]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }

  @Test
  public void test4() {
    String s = "abc";
    char c = 'c';
    int[] expected = TestUtils.toArray("[2,1,0]");
    int[] result = solution.shortestToChar(s, c);
    Assert.assertArrayEquals(expected, result);
  }


}