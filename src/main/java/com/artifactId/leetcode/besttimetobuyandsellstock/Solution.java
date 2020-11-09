package com.artifactId.leetcode.besttimetobuyandsellstock;

/**
 *
 * Runtime: 1 ms, faster than 98.00% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 38.9 MB, less than 5.66% of Java online submissions for Best Time to Buy and Sell Stock.
 */

public class Solution {

  public int maxProfit(int[] prices) {
    if (prices == null  || prices.length < 2 ) {
      return 0;
    }

    int result  = 0;
    int min = prices[0];
    int max = prices[0];

    for (int i = 1; i < prices.length; i++) {
      int price = prices[i];
      if (price < min) {
        min = price;
        max = price;
        continue;
      }
      if (price > max) {
        max = price;
        result = Math.max(result, max - min);
      }
    }


    return result;

  }

}
