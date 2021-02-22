package com.artifactId.leetcode.medium.longestwordindictionarythroughdeleting;

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
    String s = "abpcplea";
    List<String> d = TestUtils.toStringList("[\"ale\",\"apple\",\"monkey\",\"plea\"]");
    String expected = "apple";
    String result = solution.findLongestWord(s, d);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "abpcplea";
    List<String> d = TestUtils.toStringList("[\"a\",\"b\",\"c\"]");
    String expected = "a";
    String result = solution.findLongestWord(s, d);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "barfoofoobarthefoobarman";
    List<String> d = TestUtils.toStringList("[\"the\",\"foo\",\"bar\"]");
    String expected = "bar";
    String result = solution.findLongestWord(s, d);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    String s = "abpcplea";
    List<String> d = TestUtils.toStringList("[\"z\",\"x\",\"y\"]");
    String expected = "";
    String result = solution.findLongestWord(s, d);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    String s = "abpcplea";
    List<String> d = TestUtils.toStringList("[\"pea\",\"xyzacs\",\"y\"]");
    String expected = "pea";
    String result = solution.findLongestWord(s, d);
    Assert.assertEquals(expected, result);
  }


}