package com.artifactId.leetcode.medium.reversesubstringsbetweeneachpairofparentheses1190;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;

public class Solution {

    public String reverseParentheses(String s) {

        Stack<Character> resultStack = new Stack<>();
        Queue<Character> tempQueue = new LinkedList<>();
        IntStream.range(0, s.length())
                .forEach(index -> {
                    char c = s.charAt(index);
                    if (c != ')') {
                        resultStack.push(c);
                    } else {
                        tempQueue.clear();
                        char currentChar = resultStack.pop();
                        while (currentChar != '(') {
                            tempQueue.add(currentChar);
                            currentChar = resultStack.pop();
                        }
                        while (!tempQueue.isEmpty()) {
                            currentChar = tempQueue.poll();
                            resultStack.push(currentChar);
                        }
                    }
                });

        return stackToString(resultStack);
    }

    private static String stackToString(Stack<Character> resultStack) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!resultStack.isEmpty()) {
            Character currentChar = resultStack.pop();
            stringBuilder.append(currentChar);
        }

        return stringBuilder.reverse().toString();
    }

}
