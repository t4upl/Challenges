package com.artifactId.leetcode.medium.countcollisionsonaroad2211;

import java.util.Optional;
import java.util.Stack;

public class Solution {

    public int countCollisions(String directions) {
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < directions.length(); i++) {
//            System.out.println(i);
            char c = directions.charAt(i);
            switch (c) {
                case 'L': {
                    if (stack.isEmpty()) {
                        continue;
                    }
                    Character elementLCollidedWith = stack.peek();
                    // Math.max because colides with either S or R
                    int rCount = Math.max(getRCount(stack), 1);
                    int colliededWithR = elementLCollidedWith == 'R' ? 1 : 0;
                    result = result + rCount + colliededWithR;

                    stack.clear();
                    stack.push('S');
                    break;
                }
                case 'S': {
                    int rCount = getRCount(stack);
                    result = result + rCount;
                    stack.clear();
                    stack.push(c);
                    break;
                }
                case 'R': {
                    stack.push(c);
                };
            }
        }

        return result;
    }

    private static int getRCount(Stack<Character> stack) {
        int rCount = 0;
        while (!stack.isEmpty() && stack.peek() == 'R') {
            rCount++;
            stack.pop();
        }
        return rCount;
    }

}
