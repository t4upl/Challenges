package com.artifactId.leetcode.hard.largestrectangleinhistogram84;

import java.util.Stack;
import java.util.stream.IntStream;

public class Solution {

    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }

        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        IntStream.range(0, heights.length)
                .forEach(index -> {
                    calculateElemenNotSmallerThanHeightAtindex(heights, index, stack, left, 1, 0);
                });


        stack.clear();
        IntStream.range(1, heights.length + 1)
                .forEach(offset -> {
                    int index = heights.length - offset;
                    System.out.println("index "  + index);
                    calculateElemenNotSmallerThanHeightAtindex(heights, index, stack, right, -1, heights.length - 1);
                });


        return IntStream.range(0, heights.length)
                .map(index -> (right[index] - left[index] + 1) * heights[index]).max().orElse(-1);
    }

    private static void calculateElemenNotSmallerThanHeightAtindex(int[] heights, int index, Stack<Integer> stack, int[] directionHeights,
                                                                   int directionOffset, int emptyStackValue) {
        int currentHeight = heights[index];
        while (!stack.isEmpty() && currentHeight <= heights[stack.peek()]) {
            stack.pop();
        }
        directionHeights[index] = stack.isEmpty() ? emptyStackValue : (stack.peek() + directionOffset);
        stack.push(index);
    }


}
