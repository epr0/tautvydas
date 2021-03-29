package com.tautvydas.loops;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write you name: ");
        String name = scanner.nextLine();
        for (int x = 0; x <= 55; x++) {   // jei nori neapibrėžti x reikšmės, tai reikia parašyti tik kabutes:
            // for (int x = 0; ; x++)
            System.out.println(x + ". Your name is " + name);
        }
        int suma = 0;
        for (int x = 10; x <= 30; x++) {
            suma += x;
        }
        System.out.println(suma);
    }
}

