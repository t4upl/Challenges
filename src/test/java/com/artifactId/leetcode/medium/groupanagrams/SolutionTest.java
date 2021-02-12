package com.artifactId.leetcode.medium.groupanagrams;

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
    String s = "[\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]";
    String expectedAsString = "[[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]";
    String[] strs = TestUtils.toStringArray(s);
    List<List<String>> expected = TestUtils.toTwoDimStringList(expectedAsString);
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(TestUtils.toSetOfSets(expected), TestUtils.toSetOfSets(result));
  }

  @Test
  public void leet2() {
    String s = "[\"\"]";
    String expectedAsString = "[[\"\"]]";
    String[] strs = TestUtils.toStringArray(s);
    List<List<String>> expected = TestUtils.toTwoDimStringList(expectedAsString);
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(TestUtils.toSetOfSets(expected), TestUtils.toSetOfSets(result));
  }

  @Test
  public void leet3() {
    String s = "[\"a\"]";
    String expectedAsString = "[[\"a\"]]";
    String[] strs = TestUtils.toStringArray(s);
    List<List<String>> expected = TestUtils.toTwoDimStringList(expectedAsString);
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(TestUtils.toSetOfSets(expected), TestUtils.toSetOfSets(result));
  }


}