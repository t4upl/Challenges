package com.artifactId.leetcode.other.trappingrainwater;

import java.util.Stack;

public class TrappingRainWaterSolutionUsingStackImpl implements TrappingRainWaterSolution {

  @Override
  public int trap(int[] height) {
    int ans = 0, current = 0;
    Stack<Integer> st = new Stack<>();
    while (current < height.length) {
      while (!st.empty() && height[current] > height[st.peek()]) {
        int top = st.pop();
        if (st.empty())
          break;
        int distance = current - st.peek() - 1;
        int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
        ans += distance * bounded_height;
      }
      st.push(current++);
    }
    return ans;
  }
}
