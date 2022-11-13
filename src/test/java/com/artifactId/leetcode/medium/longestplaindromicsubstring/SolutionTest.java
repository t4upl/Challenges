package com.artifactId.leetcode.medium.longestplaindromicsubstring;

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
    String s = "babad";
    String expected = "bab";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "cbbd";
    String expected = "bb";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "texteditor";
    String expected = "texteditor";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String s = "ac";
    String expected = "texteditor";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String s = "aa";
    String expected = "aa";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    String s = "edaad";
    String expected = "daad";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    String s = "edade";
    String expected = "edade";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    String s = "fedade";
    String expected = "edade";
    String result = solution.longestPalindrome(s);
    Assert.assertEquals(expected, result);
  }


}