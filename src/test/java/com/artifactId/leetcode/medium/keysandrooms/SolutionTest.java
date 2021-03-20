package com.artifactId.leetcode.medium.keysandrooms;

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
    List<List<Integer>> rooms = TestUtils.toTwoDimList("[[1],[2],[3],[]]");
    boolean expected = true;
    boolean result = solution.canVisitAllRooms(rooms);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    List<List<Integer>> rooms = TestUtils.toTwoDimList("[[1,3],[3,0,1],[2],[0]]");
    boolean expected = false;
    boolean result = solution.canVisitAllRooms(rooms);
    Assert.assertEquals(expected, result);
  }


}