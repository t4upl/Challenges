package com.artifactId.leetcode.onlinestockspan;

import java.util.Stack;

/**
 * Runtime: 28 ms, faster than 94.97% of Java online submissions for Online Stock Span.
 * Memory Usage: 51.4 MB, less than 100.00% of Java online submissions for Online Stock Span.
 */
public class OnlineStockSpanSolutionImpl implements OnlineStockSpanSolution {

  Stack<Integer> prices = new Stack<>();
  Stack<Integer> weights = new Stack<>();

  @Override
  public int next(int price) {

    if (prices.empty()) {
      prices.push(price);
      weights.push(1);
      return 1;
    }

    int weight = 1;
    while (!prices.empty() && prices.peek() <= price) {
      weight += weights.pop();
      prices.pop();
    }

    prices.push(price);
    weights.push(weight);
    return weight;

  }

}
