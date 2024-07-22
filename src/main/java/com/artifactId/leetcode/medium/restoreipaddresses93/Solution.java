package com.artifactId.leetcode.medium.restoreipaddresses93;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public List<String> restoreIpAddresses(String s) {
        String[] split = s.split("");
        List<String> result = new LinkedList<>();
        List<Integer> accumulator = new LinkedList<>();
        rec(split, 0, accumulator, result);
        return result;
    }

    private void rec(String[] split, int startIndex, List<Integer> accumulator, List<String> result) {
//        System.out.println("startIndex " + startIndex + " "  +  accumulator);
        if (accumulator.size() == 4) {
            if (startIndex == split.length) {
                String newIpAdress = accumulator.stream().map(Object::toString).collect(Collectors.joining("."));
                result.add(newIpAdress);
            }
            return;
        }

        Integer currNumber = 0;
        for (int i = 0; i < 3; i++) {
            if (!(startIndex + i < split.length)) {
                break;
            }


            currNumber = 10 * currNumber + Integer.parseInt(split[startIndex + i]);

            if ((i == 0 && currNumber == 0) || (currNumber > 0 && currNumber < 256)) {
                accumulator.add(currNumber);
                rec(split, startIndex + i + 1, accumulator, result);
                accumulator.remove(accumulator.size() - 1);
            }

            if (currNumber == 0) {
                break;
            }


        }
    }

}
