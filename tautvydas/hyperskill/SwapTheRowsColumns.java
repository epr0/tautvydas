package com.tautvydas.hyperskill;
/*
Swap the columns

Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.


Sample Input:
3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1
Sample Output:
12 11 13 14
22 21 23 24
32 31 33 34

 */

import java.util.Scanner;

public class SwapTheRowsColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // SWAP THE ROWS

        byte row1 = scanner.nextByte();
        byte row2 = scanner.nextByte();

        System.out.println();

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[row2][j] + " ");
        }
        System.out.println();
        for (int i = row1 + 1; i < row2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[row1][j] + " ");
        }
        System.out.println();
        for (int i = row2 + 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // SWAP THE COLUMNS
        byte col1 = scanner.nextByte();
        byte col2 = scanner.nextByte();

        if (col1 > col2) {
            byte temp = col1;
            col1 = col2;
            col2 = temp;
        }
        if (col1 == col2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print(matrix[i][col2] + " ");
                for (int j = col1 + 1; j < col2; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print(matrix[i][col1] + " ");
                for (int j = col2 + 1; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
/*

5 5
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45
51 52 53 54 55
1 2

3 5
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
0 2

5 3
11 12 13
21 22 23
31 32 33
41 42 43
51 52 53
2 4

 */

