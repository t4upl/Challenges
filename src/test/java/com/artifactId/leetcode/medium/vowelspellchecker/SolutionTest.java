package com.artifactId.leetcode.medium.vowelspellchecker;

import com.artifactId.TestUtils;
import java.util.Arrays;
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
  public void test1() {
    String[] wordlist = TestUtils.toStringArray("[\"KiTe\",\"kite\",\"hare\",\"Hare\"]");
    String[] queries = TestUtils.toStringArray(
      "[\"kite\",\"Kite\",\"KiTe\",\"Hare\",\"HARE\",\"Hear\",\"hear\",\"keti\",\"keet\",\"keto\"]");
    String[] expected = TestUtils.toStringArray(
      "[\"kite\",\"KiTe\",\"KiTe\",\"Hare\",\"hare\",\"\",\"\",\"KiTe\",\"\",\"KiTe\"]");
    String[] result = solution.spellchecker(wordlist, queries);

    Assert.assertTrue(Arrays.equals(expected, result));
  }


}