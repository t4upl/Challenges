package com.artifactId.leetcode.other.jewelsandstones;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new SolutionImpl();
  }

  @Test
  public void leet1() {
    Assertions.assertEquals(3, solution.numJewelsInStones("aA",  "aAAbbbb"));
  }

  @Test
  public void leet2() {
    Assertions.assertEquals(0, solution.numJewelsInStones("z",  "ZZ"));
  }


}
