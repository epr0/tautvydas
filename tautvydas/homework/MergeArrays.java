package com.tautvydas.homework;


import java.util.Arrays;


/**
 * Java program to combine two arrays in Java. In this Java example
 * first we have concatenated two int arrays and later two String arrays.
 * First array combine examples use Apache commons ArrayUtils, second array
 * join example uses Guava's ObjectArrays and the last array concatenates example uses JDK.
 *
 * @author Javin Paul
 */
public class MergeArrays {

    public static void main(String args[]) {

        //JDK way to combine two array in Java
        int[] array1 = {101, 102, 103, 104};
        int[] array2 = {105, 106, 107, 108};
        int[] concatenate = combine(array1, array2);
        System.out.println("concatenated array : " + Arrays.toString(concatenate));

    }


    public static int[] combine(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

}


