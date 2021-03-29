package com.tautvydas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] specificArray = new int[3];

        specificArray[0] = 123;
        specificArray[1] = 345;
        specificArray[2] = 678;

        for (int itemInArray : specificArray) {
            System.out.println(itemInArray);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Now input size of array: ");
        int arraySize = scanner.nextInt();

        int[] userArray = new int[arraySize];
        System.out.println();

        System.out.println("Now input values of array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + " reikšmė: ");
            userArray[i] = scanner.nextInt();
        }
        System.out.print("Your Array is " + Arrays.toString(userArray));

    }
}
