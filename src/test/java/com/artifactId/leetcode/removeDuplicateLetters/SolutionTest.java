package com.artifactId.leetcode.removeDuplicateLetters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solution;

  @Before
  public void setup() {
    solution = new Solution();
  }

  @Test
  public void test1() {
    Assert.assertEquals("ab", solution.removeDuplicateLetters("ab"));
  }

  @Test
  public void test2() {
    Assert.assertEquals("ab", solution.removeDuplicateLetters("baab"));
  }

  @Test
  public void test3() {
    Assert.assertEquals("abc", solution.removeDuplicateLetters("bcaabc"));
  }

  @Test
  public void test4() {
    Assert.assertEquals("abc", solution.removeDuplicateLetters("cbabc"));
  }

  @Test
  public void test5() {
    Assert.assertEquals("ab", solution.removeDuplicateLetters("aab"));
  }

  @Test
  public void test6() {
    Assert.assertEquals("abc", solution.removeDuplicateLetters("bcabc"));
  }

  @Test
  public void test7() {
    Assert.assertEquals("bac", solution.removeDuplicateLetters("bcac"));
  }

  @Test
  public void test8() {
    Assert.assertEquals("acdb", solution.removeDuplicateLetters("acdcbc"));
  }

  @Test
  public void test9() {
    Assert.assertEquals("ab", solution.removeDuplicateLetters("bab"));
  }

  @Test
  public void test10() {
    Assert.assertEquals("ab", solution.removeDuplicateLetters("abab"));
  }


  @Test
  public void leetCodeTest1() {
    Assert.assertEquals("abc", solution.removeDuplicateLetters("bcabc"));
  }

  @Test
  public void leetCodeTest2() {
    Assert.assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));
  }


  @Test
  public void leetCodeTest3() {
    Assert.assertEquals("ba", solution.removeDuplicateLetters("baa"));
  }

  @Test
  public void leetCodeTest4() {
    Assert.assertEquals("bac", solution.removeDuplicateLetters("bbcaac"));
  }

  @Test
  public void leetCodeTest5() {
    Assert.assertEquals("abc", solution.removeDuplicateLetters("abacb"));
  }




}
