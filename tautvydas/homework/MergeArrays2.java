package com.tautvydas.homework;

import java.util.Scanner;

public class MergeArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite kiek bus masyvų: ");
        int masyvuKiekis = scanner.nextInt();
        int[][] masyvai = new int[masyvuKiekis][];
        int bendrasElementuKiekis = 0;
        for (int i = 0; i < masyvuKiekis; i++) {
            System.out.print("Įveskite [" + i + "] masyvo dydį: ");
            int masyvoDydis = scanner.nextInt();
            int[] newArray = new int[masyvoDydis];
            System.out.println("Įveskite masyvo reikšmes: ");
            for (int a = 0; a < masyvoDydis; a++) {
                System.out.print("Iveskite [" + a + "] reikšmę: ");
                newArray[a] = scanner.nextInt();
                bendrasElementuKiekis++;
            }
            masyvai[i] = newArray;
        }
        int[] sujungtasMasyvas = new int[bendrasElementuKiekis];
        System.out.println();
        System.out.println("Išvedame masyvus į consolę:");
        int sujungtoMasyvoIndexas = 0;
        for (int i = 0; i < masyvai.length; i++) {
            for (int j = 0; j < masyvai[i].length; j++) {
                System.out.printf("%5d ", masyvai[i][j]);
                sujungtasMasyvas[sujungtoMasyvoIndexas++] = masyvai[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sujungto masyvo bendras elementu kiekis yra " + bendrasElementuKiekis);
        System.out.println();
        System.out.println("Bendras sujungtas masyvas atrodo taip");
        for (int i = 0; i < bendrasElementuKiekis; i++) {
            System.out.print(sujungtasMasyvas[i] + " ");
        }
        System.out.println("");
        System.out.println("Ačiū, kad naudojatės masyvų sujungimo paslaugomis. :)");
    }
}