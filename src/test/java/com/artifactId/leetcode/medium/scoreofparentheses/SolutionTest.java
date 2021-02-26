package com.artifactId.leetcode.medium.scoreofparentheses;

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
    String S = "()";
    int expected = 1;
    int result = solution.scoreOfParentheses(S);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String S = "(())";
    int expected = 2;
    int result = solution.scoreOfParentheses(S);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String S = "()()";
    int expected = 2;
    int result = solution.scoreOfParentheses(S);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String S = "(()(()))";
    int expected = 6;
    int result = solution.scoreOfParentheses(S);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String S = "()(())";
    int expected = 3;
    int result = solution.scoreOfParentheses(S);
    Assert.assertEquals(expected, result);
  }


}