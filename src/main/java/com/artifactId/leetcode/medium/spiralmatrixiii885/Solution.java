package com.artifactId.leetcode.medium.spiralmatrixiii885;

public class Solution {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows][cols];
        int max = rows * cols + 1;
        int[][] resultCoordiantes = new int[max - 1][2];
        int current = 1;
        int matrixSize = 3;

        if (max == 1) {
            return result;
        }

        if (isInArray(result, cStart, rStart)) {
            result[rStart][cStart] = current;
            int[] cooridantesRow = new int[2];
            cooridantesRow[0] = rStart;
            cooridantesRow[1] = cStart;
            resultCoordiantes[current - 1] = cooridantesRow;
            current++;
        }

        Position position = new Position(rStart, cStart + 1);

        int counter =  0;

        while (current < max) {
            current = mark(position, matrixSize - 1, 0, 1,  result, current, resultCoordiantes);
            current = mark(position, matrixSize, -1, 0,  result, current, resultCoordiantes);
            current = mark(position, matrixSize, 0, -1,  result, current, resultCoordiantes);
            current = mark(position, matrixSize, 1, 0,  result, current, resultCoordiantes);

            position.setcStart(position.getcStart() + 1);
            matrixSize += 2;
            counter++;
        }

        return resultCoordiantes;
    }

    private int mark(Position position, int matrixSize, int dx, int dy, int[][] result, int current, int[][] resultCoordiantes) {
        for (int i = 0; i < matrixSize; i++) {
            int cStart = position.getcStart();
            int rStart = position.getrStart();

            System.out.println(String.format("row %s col %s", rStart, cStart));

            if (isInArray(result, cStart, rStart)) {
                System.out.println(String.format("row %s col %s in array ", rStart, cStart));
                result[rStart][cStart] = current;

                int[] cooridantesRow = new int[2];
                cooridantesRow[0] = rStart;
                cooridantesRow[1] = cStart;
                resultCoordiantes[current - 1] = cooridantesRow;
                current++;
            }
            position.setcStart(cStart + dx);
            position.setrStart(rStart + dy);
        }

        position.setcStart(position.getcStart() - dx);
        position.setrStart(position.getrStart() - dy);

        return current;
    }

    private static boolean isInArray(int[][] result, int cStart, int rStart) {
        return cStart > -1 && rStart > -1 && cStart < result[0].length && rStart < result.length
                && result[rStart][cStart] == 0
                ;
    }

    class Position {
        int rStart;
        int cStart;

        public Position(int rStart, int cStart) {
            this.rStart = rStart;
            this.cStart = cStart;
        }

        public int getcStart() {
            return cStart;
        }

        public int getrStart() {
            return rStart;
        }

        public void setrStart(int rStart) {
            this.rStart = rStart;
        }

        public void setcStart(int cStart) {
            this.cStart = cStart;
        }
    }


}
