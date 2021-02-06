package com.artifactId.leetcode.easy.checkiftwostringarraysareequivalent;

import com.artifactId.TestUtils;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    String[] word1 = TestUtils.toStringArray("[\"ab\", \"c\"]");
    String[] word2 = TestUtils.toStringArray("[\"a\", \"bc\"]");
    boolean expected = true;
    boolean result = solution.arrayStringsAreEqual(word1, word2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String[] word1 = TestUtils.toStringArray("[\"a\", \"cb\"]");
    String[] word2 = TestUtils.toStringArray("[\"ab\", \"c\"]");
    boolean expected = false;
    boolean result = solution.arrayStringsAreEqual(word1, word2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String[] word1 = TestUtils.toStringArray("[\"abc\", \"d\", \"defg\"]");
    String[] word2 = TestUtils.toStringArray("[\"abcddefg\"]");
    boolean expected = true;
    boolean result = solution.arrayStringsAreEqual(word1, word2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String[] word1 = TestUtils.toStringArray("[\"abc\",\"d\",\"defg\"]");
    String[] word2 = TestUtils.toStringArray("[\"abcddef\"]");
    boolean expected = false;
    boolean result = solution.arrayStringsAreEqual(word1, word2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String[] word1 = TestUtils.toStringArray("[\"ab\", \"c\", \"d\"]");
    String[] word2 = TestUtils.toStringArray("[\"a\", \"bce\"]");
    boolean expected = false;
    boolean result = solution.arrayStringsAreEqual(word1, word2);
    Assert.assertEquals(expected, result);
  }


}