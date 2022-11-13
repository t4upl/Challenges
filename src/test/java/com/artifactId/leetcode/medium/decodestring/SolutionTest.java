package com.artifactId.leetcode.medium.decodestring;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void test1() {
    String s = "abc";
    String expected = "abc";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    String s = "a1[bc]";
    String expected = "abc";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    String s = "a2[bc]de";
    String expected = "abcbcde";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    String s = "a1[b2[c]d]";
    String expected = "abccd";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet1() {
    String s = "3[texteditor]2[bc]";
    String expected = "aaabcbc";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "3[a2[c]]";
    String expected = "accaccacc";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "2[abc]3[cd]ef";
    String expected = "abcabccdcdcdef";
    String result = solution.decodeString(s);
    Assert.assertEquals(expected, result);
  }






}