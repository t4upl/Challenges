package com.artifactId.leetcode.medium.pathwithmaximumgold1219;

import java.util.stream.IntStream;

public class Solution {

    public static final int[][] OFFSETS = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int rows;
    private int columns;

    public int getMaximumGold(int[][] grid) {
        rows = grid.length;
        columns = grid[0].length;
        int maxGold = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int gold = dfs(grid, row, col);
                maxGold = Math.max(maxGold, gold);
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row == rows || col == columns || grid[row][col] == 0) {
            return 0;
        }

        int gold = grid[row][col];
//        System.out.println(gold);
        grid[row][col] = 0;
        int maxGold = 0;
        for (int[] offset: OFFSETS) {
            maxGold = Math.max(maxGold, dfs(grid, row + offset[0], col + + offset[1]));
        }
        grid[row][col] = gold;
        return maxGold + gold;
    }

}
