package com.artifactId.mockit;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Connect4 {

    public static void main(String[] args) {
        addToken(new String[6][7], "RED", 0);
        addToken(new String[6][7], "RED", 1);

        String[][] board = new String[6][7];
        board[5][1] = "YELLOW";
        addToken(board, "RED", 1);
    }

    static void print(String[][] board) {
        IntStream.range(0, board.length).forEach(index -> System.out.println(Arrays.toString(board[index])));
    }

    static void addToken(String[][] board, String color, int column) {
        for (int i = board.length - 1; i > -1 ; i--) {
            if (board[i][column] == null) {
                board[i][column] = color;
                break;
            }
        }
        print(board);
    }

}
