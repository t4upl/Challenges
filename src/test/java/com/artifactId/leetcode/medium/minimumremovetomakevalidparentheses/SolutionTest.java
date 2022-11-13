package com.artifactId.leetcode.medium.minimumremovetomakevalidparentheses;

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
    String s = "lee(t(c)o)de)";
    String expected = "lee(t(c)o)de";
    String result = solution.minRemoveToMakeValid(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "texteditor)b(c)d";
    String expected = "ab(c)d";
    String result = solution.minRemoveToMakeValid(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "))((";
    String expected = "";
    String result = solution.minRemoveToMakeValid(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String s = "(texteditor(b(c)d)";
    String expected = "texteditor(b(c)d)";
    String result = solution.minRemoveToMakeValid(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String s = "))()(())())(";
    String expected = "()(())()";
    String result = solution.minRemoveToMakeValid(s);
    Assert.assertEquals(expected, result);
  }




}