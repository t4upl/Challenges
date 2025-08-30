package com.artifactId.leetcode.medium.sortmatrixbydiagonals3446;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n][grid[0].length];
        List<Integer> sorted = new ArrayList<>(n);
        for (int row = 0; row < n; row++) {
            sorted.clear();
            for (int col = 0; col < n - row; col++) {
                sorted.add(grid[row+col][col]);
            }
            sorted.sort(Comparator.reverseOrder());
            for (int col = 0; col < n - row; col++) {
                grid[row+col][col] = sorted.get(col);
            }
        }

        for (int col = 1; col < n; col++) {
            sorted.clear();
            for (int row = 0; row < n - col; row++) {
                sorted.add(grid[row][col+row]);
            }
            sorted.sort(Comparator.naturalOrder());
            for (int row = 0; row < n - col; row++) {
                grid[row][col+row] = sorted.get(row);
            }
        }

        return grid;
    }

}
