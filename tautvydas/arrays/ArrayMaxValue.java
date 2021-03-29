package com.tautvydas.arrays;

public class ArrayMaxValue {
    public static void main(String[] args) {
        double[] myArray = {3, 2.5, -8, 11};
        // FIND LARGEST ELEMENT
        double max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}
