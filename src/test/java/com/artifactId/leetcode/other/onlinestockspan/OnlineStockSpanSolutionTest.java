package com.artifactId.leetcode.other.onlinestockspan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OnlineStockSpanSolutionTest {

  OnlineStockSpanSolution onlineStockSpanSolution;

  @Before
  public void setup() {
    onlineStockSpanSolution = new OnlineStockSpanSolutionImpl();
  }

  @Test
  public void test1() {
    int result = onlineStockSpanSolution.next(3);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(2);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test2() {
    int result = onlineStockSpanSolution.next(1);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(4);
    Assert.assertEquals(2, result);

    result = onlineStockSpanSolution.next(6);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test3() {
    int result = onlineStockSpanSolution.next(1);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(4);
    Assert.assertEquals("Bad result for input 4 [1, 4] ", 2, result);

    result = onlineStockSpanSolution.next(3);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(4);
    Assert.assertEquals("Bad result for input 4 [1, 4, 3, 4, 4]", 4, result);

    result = onlineStockSpanSolution.next(4);
    Assert.assertEquals(5, result);
  }

  @Test
  public void test4() {
    int result = onlineStockSpanSolution.next(10);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(10);
    Assert.assertEquals(2, result);

    result = onlineStockSpanSolution.next(6);
    Assert.assertEquals(1, result);
  }

  @Test
  public void leetTest1() {


    int result = onlineStockSpanSolution.next(100);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(80);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(60);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(70);
    Assert.assertEquals(2, result);

    result = onlineStockSpanSolution.next(60);
    Assert.assertEquals(1, result);

    result = onlineStockSpanSolution.next(75);
    Assert.assertEquals(4, result);

    result = onlineStockSpanSolution.next(85);
    Assert.assertEquals(6, result);

  }

}
