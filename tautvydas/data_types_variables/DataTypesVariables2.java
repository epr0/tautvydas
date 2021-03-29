package com.tautvydas.data_types_variables;

import java.util.Scanner;

public class DataTypesVariables2 {
    public static void main(String[] args) {

        // Primitive variable data types - for storing simple values (byte, short, int, long, float, double, char)
        // Reference variable data types - for storing complex objects - date, mail messages (string, array
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input byte1: ");
        byte bitas1 = scanner.nextByte();
        System.out.print("Input byte2: ");
        byte bitas2 = scanner.nextByte();
        byte suma = (byte) (bitas1 + bitas2);  //castinimas
        // int suma = bitas1 + bitas2;
        System.out.print("Suma: " + (bitas1 + bitas2));

        System.out.println();
        System.out.print("Input short1: ");
        short shortas1 = scanner.nextShort();
        System.out.print("Input short2: ");
        short shortas2 = scanner.nextShort();
        short substract = (short) (shortas1 - shortas2);
        System.out.print("Skirtumas: " + substract);

        System.out.println();
        System.out.print("Input int1: ");
        int intas1 = scanner.nextInt();
        System.out.print("Input int2: ");
        int intas2 = scanner.nextInt();
        int divide = intas1 / intas2;
        System.out.print("Dalyba: " + divide);

        System.out.println();
        System.out.print("Input long1: ");
        long longas1 = scanner.nextLong();
        System.out.print("Input long2: ");
        long longas2 = scanner.nextLong();
        long multiple = longas1 * longas2;
        System.out.print("Daugyba: " + multiple);

        System.out.println();
        System.out.print("Input float1: ");
        float floatas1 = scanner.nextFloat();
        System.out.print("Input float2: ");
        float floatas2 = scanner.nextFloat();
        float dalyba = floatas1 / floatas2;
        float daugyba = floatas1 * floatas2;
        System.out.print("Dalyba: " + dalyba + " Daugyba: " + daugyba);

        System.out.println();
        System.out.print("Input double1: ");
        double doublas1 = scanner.nextDouble();
        System.out.print("Input double2: ");
        double doublas2 = scanner.nextDouble();
        double doubleDaugyba = doublas1 * doublas2;
        System.out.print("Daugyba: " + doubleDaugyba);

        System.out.println();
        System.out.print("Input symbol: ");
        char char1 = scanner.next().charAt(0);
        System.out.println(char1);


        System.out.println();
        System.out.print("Input string: ");
        String stringas = scanner.nextLine();
        System.out.println(stringas.toUpperCase());
        System.out.println(stringas.length());
        System.out.println(stringas.replace("a", "*"));

    }
}
