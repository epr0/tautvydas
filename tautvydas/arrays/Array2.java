package com.tautvydas.arrays;

import java.util.Arrays;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};

        System.out.println(arrayOfInts[0]); // prints 10
        System.out.println(arrayOfInts[1]); // prints 15
        System.out.println(arrayOfInts[2]); // prints 20
        System.out.println(arrayOfInts[3]); // prints 25
        System.out.println(arrayOfInts[4]); // prints 30

        // Prints all array: 10 15 20 25 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }

        System.out.println(); // Spausdinama tuščia eilutė

        // Prints 10 15 20 25 30
        for (int i : arrayOfInts) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Nauja funkcija, kuri yra JDK v.8, bet nėra v.6
        // Atspausfina masyvą naudojant tik vieną eilutę masyvo sukūrimui ir vieną eilutę masyvo atspausdinimui.
        List<Integer> integerList = Arrays.asList(10, 15, 20, 15, 25, 30);
        integerList.forEach(number -> System.out.println(number + " "));
    }
}
