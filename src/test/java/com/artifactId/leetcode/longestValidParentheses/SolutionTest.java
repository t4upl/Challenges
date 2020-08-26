package com.artifactId.leetcode.longestValidParentheses;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solutionInterface;

  @Before
  public void setup() {
    solutionInterface = new Solution();
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, solutionInterface.longestValidParentheses("()"));
  }

  @Test
  public void test3() {
    Assert.assertEquals(4, solutionInterface.longestValidParentheses("(())"));
  }

  @Test
  public void test4() {
    Assert.assertEquals(4, solutionInterface.longestValidParentheses("()()"));
  }

  @Test
  public void test5() {
    Assert.assertEquals(6, solutionInterface.longestValidParentheses("()()()"));
  }

  @Test
  public void test6() {
    Assert.assertEquals(6, solutionInterface.longestValidParentheses("()(())"));
  }

  @Test
  public void test7() {
    Assert.assertEquals(2, solutionInterface.longestValidParentheses("(()"));
  }


  @Test
  public void test8() {
    Assert.assertEquals(4, solutionInterface.longestValidParentheses("(()))"));
  }

  @Test
  public void test9() {
    Assert.assertEquals(12, solutionInterface.longestValidParentheses("(()())))(()())(()())"));
  }

  @Test
  public void test10() {
    Assert.assertEquals(2, solutionInterface.longestValidParentheses("))()"));
  }

  @Test
  public void leetTest1() {
    Assert.assertEquals(2, solutionInterface.longestValidParentheses("()(()"));
  }

}
