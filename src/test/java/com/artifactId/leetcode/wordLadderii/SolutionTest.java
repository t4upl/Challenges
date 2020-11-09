package com.artifactId.leetcode.wordLadderii;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
  public void leet1() {
    String beginWord = "hit";
    String endWord = "cog";
    List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
    List<List<String>> result = solution.findLadders(beginWord, endWord, wordList);
    List<List<String>> expected = Arrays.asList(Arrays.asList("hit", "hot", "dot", "dog", "cog"),
      Arrays.asList("hit", "hot", "lot", "log", "cog"));
    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet2() {
    String beginWord = "hit";
    String endWord = "cog";
    List<String> wordList = Arrays.asList("hot","dot","dog","lot","log");
    List<List<String>> result = solution.findLadders(beginWord, endWord, wordList);
    List<List<String>> expected = Collections.emptyList();
    Assert.assertEquals(expected, result);
  }

}