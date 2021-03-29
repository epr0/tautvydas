package com.tautvydas.data_types_variables;

import java.util.ArrayList;
import java.util.List;

public class DataTypesVariables1 {
    public static void main(String[] args) {

        byte bitas = 3;
        System.out.println("Bitas: " + bitas);

        short shortNumber = 5;
        System.out.println("Trumpas skaičius: " + shortNumber);

        int number = 2_500_000; // brūkšnelis apačioje atskiria tūkstančius.
        System.out.println("Sveikas skaičius: " + number);

        long longNumber = 4345434356767L;  // L raidę reikia pridėti dėl to, kad Java compileris mato šitą skaičių
        // kaip int ir kad suprastų, kad čia long, reikia pridėti L.
        System.out.println("Ilgasis skaičius: " + longNumber);

        float floatNumber = 5.5f;   // f raidę reikia pridėti dėl to, kad Java compileris mato šitą skaičių
        // kaip double ir kad suprastų, kad čia float, reikia pridėti f arba F.

        System.out.println("Float: " + floatNumber);

        double doubleNumber = 2.3;
        System.out.println("Dvejetainis skaičius: " + doubleNumber);
        double value = 200.3456;
        System.out.printf("Value: %.2f", value); // %.2f - parodo tik 2 skaičius po kablelio.
        System.out.println();

        char character = 'a';
        System.out.println("Simbolis: " + character);
        character = 'b';
        System.out.println("Simbolis: " + character);

        // Simbolis // 16 bits
        // Used to store unicode
        boolean isSunday = true;
        System.out.println("Loginis kintamasis: " + isSunday);

        // Tekstinis objektas
        String eilute = "Today is Saturday";
        System.out.println("Tekstinis objektas: " + eilute);

        // Skaičių masyvas su nustatomu dyžiu
        int[] intArrayWithSize = new int[2]; //int[] masyvo (skaičių talpyklos) pavadinimas, new int[2], kad jis turi 2 vietas.
        intArrayWithSize[0] = 2;
        intArrayWithSize[1] = 1;
        System.out.println("Skaičių masyvas su nustatomu dydžiu: " + intArrayWithSize.length);

        // Skaičių sąrašas su nežinomu dydžiu
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        System.out.println("Skaičius su nežinomu dydžiu: " + ints.get(0));
    }
}
