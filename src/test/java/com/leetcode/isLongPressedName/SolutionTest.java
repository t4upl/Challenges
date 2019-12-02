package com.leetcode.isLongPressedName;

import com.artifactId.leetcode.isLongPressedName.Solution;
import com.artifactId.leetcode.isLongPressedName.Solution2;
import com.artifactId.leetcode.isLongPressedName.SolutionInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solution;

  @Before
  public void setUp() {
    solution = new Solution2();
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

  @Test
  public void test6() {
    boolean longPressedName = solution.isLongPressedName("a", "a");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test7() {
    boolean longPressedName = solution.isLongPressedName("a", "aa");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test8() {
    boolean longPressedName = solution.isLongPressedName("a", "aab");
    Assert.assertEquals(false,longPressedName);
  }

  @Test
  public void test9() {
    boolean longPressedName = solution.isLongPressedName("ab", "ac");
    Assert.assertEquals(false,longPressedName);
  }

  @Test
  public void test10() {
    boolean longPressedName = solution.isLongPressedName("ab", "aabb");
    Assert.assertEquals(true,longPressedName);
  }

  @Test
  public void test11() {
    boolean longPressedName = solution.isLongPressedName("ab", "aabbc");
    Assert.assertEquals(false,longPressedName);
  }

  @Test
  public void leetTest13() {
    boolean longPressedName = solution.isLongPressedName("pyplrz", "ppyypllr");
    Assert.assertEquals(false,longPressedName);
  }

}
