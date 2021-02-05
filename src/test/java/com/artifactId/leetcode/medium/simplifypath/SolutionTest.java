package com.artifactId.leetcode.medium.simplifypath;

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
    String path = "/home/";
    String expected = "/home";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String path = "/../";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String path = "/home//foo/";
    String expected = "/home/foo";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String path = "/a/./b/../../c/";
    String expected = "/c";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String path = "/../../../";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    String path = "/";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    String path = "/a/../../b/../c//.//";
    String expected = "/c";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test4() {
    String path = "/a//b////c/d//././/..";
    String expected = "/a/b/c";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test5() {
    String path = "/..";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test6() {
    String path = "/.";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test7() {
    String path = "/home/../../..";
    String expected = "/";
    String result = solution.simplifyPath(path);
    Assert.assertEquals(expected, result);
  }


}