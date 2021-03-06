package com.artifactId.leetcode.other.coinchange;

/**
 * Runtime: 37 ms, faster than 18.49% of Java online submissions for Coin Change.
 * Memory Usage: 42.6 MB, less than 10.56% of Java online submissions for Coin Change.
 */
public class Solution {

  private int[] coins;
  private int[] lookUp;

  public int coinChange(int[] coins, int amount) {
    this.coins = coins;
    this.lookUp = new int[amount +  1];
    return coinChangeInner(amount);
  }

  private int coinChangeInner(int amount) {
    if (amount == 0) {
      return 0;
    }

    if (amount < 0) {
      return -1;
    }

    if (lookUp[amount] != 0) {
      return lookUp[amount];
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < coins.length; i++) {
      int coinChangeInner = coinChangeInner(amount - coins[i]);
      if (coinChangeInner != -1) {
        min = Math.min(min, coinChangeInner + 1);
      }
    }

    if (min == Integer.MAX_VALUE) {
      min =  -1;
    }

    lookUp[amount] = min;
    return min;
  }



}
