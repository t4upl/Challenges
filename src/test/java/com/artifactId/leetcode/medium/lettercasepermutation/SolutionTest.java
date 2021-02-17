package com.artifactId.leetcode.medium.lettercasepermutation;

import com.artifactId.TestUtils;
import java.util.HashSet;
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
    String s = "a1b2";
    List<String> expected = TestUtils.toStringList("[\"a1b2\",\"a1B2\",\"A1b2\",\"A1B2\"]");
    List<String> result = solution.letterCasePermutation(s);
    Assert.assertEquals(new HashSet<>(expected), new HashSet<>(result));
  }

  @Test
  public void leet2() {
    String s = "3z4";
    List<String> expected = TestUtils.toStringList("[\"3z4\",\"3Z4\"]");
    List<String> result = solution.letterCasePermutation(s);
    Assert.assertEquals(new HashSet<>(expected), new HashSet<>(result));
  }

  @Test
  public void leet3() {
    String s = "12345";
    List<String> expected = TestUtils.toStringList("[\"12345\"]");
    List<String> result = solution.letterCasePermutation(s);
    Assert.assertEquals(new HashSet<>(expected), new HashSet<>(result));
  }

  @Test
  public void leet4() {
    String s = "0";
    List<String> expected = TestUtils.toStringList("[\"0\"]");
    List<String> result = solution.letterCasePermutation(s);
    Assert.assertEquals(new HashSet<>(expected), new HashSet<>(result));
  }

}