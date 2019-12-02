package com.leetcode.isLongPressedName;

import com.artifactId.leetcode.isLongPressedName.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void test1() {
    boolean longPressedName = solution.isLongPressedName("alex", "aaleex");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test2() {
    boolean longPressedName = solution.isLongPressedName("saeed", "ssaaedd");
    Assert.assertEquals(false,longPressedName);
  }

  @Test
  public void test3() {
    boolean longPressedName = solution.isLongPressedName("leelee", "lleeelee");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test4() {
    boolean longPressedName = solution.isLongPressedName("laiden", "laiden");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test5() {
    boolean longPressedName = solution.isLongPressedName("leeelee", "lleeeleeeeee");
    Assert.assertEquals(true,longPressedName);
  }

}
