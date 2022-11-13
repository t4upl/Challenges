package com.artifactId.leetcode.medium.lettercombinationsofaphonenumber;

import com.artifactId.TestUtils;
import java.util.List;
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
    String digits = "23";
    List<String> expected = TestUtils
      .toStringList("[\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]");
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String digits = "";
    List<String> expected = TestUtils
      .toStringList("[]");
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String digits = "2";
    List<String> expected = TestUtils
      .toStringList("[\"texteditor\",\"b\",\"c\"]");
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(expected, result);
  }


}