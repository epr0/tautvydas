package com.tautvydas.hyperskill;

import java.util.*;

public class Sudoku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entering the size of sudoku
        int n = scanner.nextInt();
        int size = n * n;
        // Creating sudoku 2D array from Console input
        int[][] sudoku = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sudoku[i][j] = scanner.nextByte();
            }
        }
        // Creating sorted and non-repetitive array of numbers for comparison
        int[] nonRepetitive = new int[size];
        for (int i = 0; i < size; i++) {
            nonRepetitive[i] = i + 1;
        }
        // Checking sorted rows (comparing with non-repetitive array)
        int[] row = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                row[j] = sudoku[i][j];
            }
            Arrays.sort(row);
            if (!Arrays.equals(row, nonRepetitive)) {
                System.out.println("NO");
                return;
            }
        }
        // Checking sorted columns (comparing with non-repetitive array)
        int[] column = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                column[j] = sudoku[j][i];
            }
            Arrays.sort(column);
            if (!Arrays.equals(column, nonRepetitive)) {
                System.out.println("NO");
                return;
            }
        }
        // Checking sorted smaller squares (comparing with non-repetitive array)
        int[] square = new int[size];
        int startingRow = 0;
        int startingColumn = 0;

        while (startingRow < size) {
            // Checking every square from left to right
            while (startingColumn < size) {
                int k = 0;
                for (int i = startingRow; i < n + startingRow; i++) {
                    for (int j = startingColumn; j < n + startingColumn; j++) {
                        square[k] = sudoku[i][j];
                        k++;
                    }
                }
                Arrays.sort(square);
                if (!Arrays.equals(square, nonRepetitive)) {
                    System.out.println("NO");
                    return;
                }
                startingColumn += n;
            }
            startingRow += n;
            startingColumn = 0;
        }
        System.out.println("YES");
    }
}

/*
3
5 8 9 6 7 4 2 1 3
7 4 3 1 8 2 9 5 6
1 2 6 9 5 3 8 7 4
9 3 5 4 2 1 7 6 8
4 1 2 8 6 7 3 9 5
6 7 8 3 9 5 1 4 2
8 6 4 2 1 9 5 3 7
3 9 7 5 4 8 6 2 1
2 5 1 7 3 6 4 8 9
YES


2
1 1 2 2
1 1 2 2
3 3 4 4
3 3 4 4
NO
 */

