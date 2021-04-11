package com.artifactId.leetcode.easy.verifyinganaliendictionary;

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
    String[] words = TestUtils.toStringArray("[\"hello\",\"leetcode\"]");
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    boolean expected = true;
    boolean result = solution.isAlienSorted(words, order);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String[] words = TestUtils.toStringArray("[\"word\",\"world\",\"row\"]");
    String order = "worldabcefghijkmnpqstuvxyz";
    boolean expected = false;
    boolean result = solution.isAlienSorted(words, order);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String[] words = TestUtils.toStringArray("[\"apple\",\"app\"]");
    String order = "\"abcdefghijklmnopqrstuvwxyz\"";
    boolean expected = false;
    boolean result = solution.isAlienSorted(words, order);
    Assert.assertEquals(expected, result);
  }


}