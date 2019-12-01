package com.leetcode.repeatedSubstringPattern;

import com.artifactId.leetcode.repeatedSubstringPattern.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() {
    this.solution = new Solution();
  }

  @Test
  public void leetTest1() {
    String s = "abab";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(true, b);
  }

  @Test
  public void leetTest2() {
    String s = "aba";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(false, b);
  }


  @Test
  public void leetTest3() {
    String s = "abcabcabcabc";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(true, b);
  }

  @Test
  public void myTest1() {
    String s = "aaa";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(true, b);
  }

  @Test
  public void myTest2() {
    String s = "ababab";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(true, b);
  }

  @Test
  public void myTest3() {
    String s = "ab";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(false, b);
  }

  @Test
  public void myTest4() {
    String s = "abababc";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(false, b);
  }

  @Test
  public void myTest5() {
    String s = "abababcabababc";
    boolean b = solution.repeatedSubstringPattern(s);
    Assert.assertEquals(true, b);
  }




}
