package com.tautvydas.hyperskill;

import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] normalMatrix = new int[n][n];
        int[][] spiralMatrix = new int[n][n];

        int normalValue = 1;
        int spiralValue = 1;

        int firstRow = 0;
        int firstColumn = 0;
        int lastRow = n - 1;
        int lastColumn = n - 1;

        // For creating spiralMatrix
        while (spiralValue <= n * n) {
            for (int i = firstColumn; i <= lastColumn; i++) {
                spiralMatrix[firstRow][i] = spiralValue;
                spiralValue++;
            }
            for (int i = firstRow + 1; i <= lastRow; i++) {
                spiralMatrix[i][lastColumn] = spiralValue;
                spiralValue++;
            }
            for (int i = lastColumn - 1; i >= firstColumn; i--) {
                spiralMatrix[lastRow][i] = spiralValue;
                spiralValue++;
            }
            for (int i = lastRow - 1; i > firstRow; i--) {
                spiralMatrix[i][firstColumn] = spiralValue;
                spiralValue++;
            }
            firstRow++;
            firstColumn++;
            lastRow--;
            lastColumn--;
        }

        // For printing spiralMatrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // For creating and printing normalMatrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                normalMatrix[i][j] = normalValue;
                System.out.print(normalMatrix[i][j] + "\t");
                normalValue++;
            }
            System.out.println();
        }
    }
}
