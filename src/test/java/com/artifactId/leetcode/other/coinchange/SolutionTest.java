package com.artifactId.leetcode.other.coinchange;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void test1() {
    int[] coins = new int[]{10};
    int amount  = 10;
    int result = solution.coinChange(coins, amount);
    assertEquals(1, result);
  }

  @Test
  public void test2() {
    int[] coins = new int[]{5, 10};
    int amount  = 10;
    int result = solution.coinChange(coins, amount);
    assertEquals(1, result);
  }

  @Test
  public void test3() {
    int[] coins = new int[]{5, 10};
    int amount  = 20;
    int result = solution.coinChange(coins, amount);
    assertEquals(2, result);
  }

  @Test
  public void test4() {
    int[] coins = new int[]{5, 8, 10};
    int amount  = 23;
    int result = solution.coinChange(coins, amount);
    assertEquals(3, result);
  }


  @Test
  public void test5() {
    int[] coins = new int[]{50, 2, 1, 40};
    int amount  = 43;
    int result = solution.coinChange(coins, amount);
    assertEquals(3, result);
  }

  @Test
  public void test6() {
    int[] coins = new int[]{50, 2, 1, 40};
    int amount  = 45;
    int result = solution.coinChange(coins, amount);
    assertEquals(4, result);
  }

  @Test
  public void test7() {
    int[] coins = new int[]{50, 2, 40};
    int amount  = 43;
    int result = solution.coinChange(coins, amount);
    assertEquals(-1, result);
  }

  @Test
  public void test8() {
    int[] coins = new int[]{50, 2, 40};
    int amount  = 44;
    int result = solution.coinChange(coins, amount);
    assertEquals(3, result);
  }

  @Test
  public void test9() {
    int[] coins = new int[]{50, 2, 3, 40};
    int amount  = 50;
    int result = solution.coinChange(coins, amount);
    assertEquals(1, result);
  }

  @Test
  public void test10() {
    int[] coins = new int[]{50, 2, 3, 40};
    int amount  = 145;
    int result = solution.coinChange(coins, amount);
    assertEquals(5, result);
  }

  //Having highest nubmer of hgihest valued coin possible does not guarantee minimal numbe rof coins
  @Test
  public void test11() {
    int[] coins = new int[]{200, 150, 1};
    int amount  = 450;
    int result = solution.coinChange(coins, amount);
    assertEquals(3, result);
  }

  @Test
  public void leet1() {
    int[] coins = new int[]{1, 2, 5};
    int amount  = 11;
    int result = solution.coinChange(coins, amount);
    assertEquals(3, result);
  }

  @Test
  public void leet2() {
    int[] coins = new int[]{2};
    int amount  = 3;
    int result = solution.coinChange(coins, amount);
    assertEquals(-1, result);
  }

  @Test
  public void leet3() {
    //4 * 83, 3 * 186, 8 * 408, 5 * 419

    int[] coins = new int[]{83, 186, 408, 419};
    int amount  = 6249;
    List<Integer> list = getAnswer(coins, amount);
    int result = solution.coinChange(coins, amount);
    assertEquals(20, result);
  }

  private List<Integer> getAnswer(int[] coins, int amount) {

    Foo foo3 = new Foo(null, 20, coins[0]);
    Foo foo2 = new Foo(foo3, 20, coins[1]);
    Foo foo1 = new Foo(foo2, 20, coins[2]);
    Foo foo0 = new Foo(foo1, 20, coins[3]);

    while (getSum(foo0, foo1, foo2, foo3) != amount) {
      foo0.next();
    }

    return null;
  }

  private int getSum(Foo foo0, Foo foo1, Foo foo2, Foo foo3) {
    return foo0.getValue() + foo1.getValue() + foo2.getValue() + foo3.getValue();
  }

  private class Foo {
    private Foo nextFoo;
    int times = 1;
    int maxTimes;
    int value;

    Foo(Foo nextFoo, int maxTimes, int value) {
      this.nextFoo = nextFoo;
      this.maxTimes = maxTimes;
      this.value = value;
    }

    void next() {
      if (times < maxTimes) {
        times++;
      } else {
        times = 1;
        nextFoo.next();
      }
    }

    int getValue() {
      return times * value;
    }

    @Override
    public String toString() {
      return "Foo{" +
        "times=" + times +
        ", value=" + value +
        '}';
    }
  }


}