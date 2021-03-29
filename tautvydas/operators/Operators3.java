package com.tautvydas.operators;

public class Operators3 {
    public static void main(String[] args) {
        int x;

        // ASSIGNMENT OPERATORS

        x = 5;  // kintamajam x-sui priskiriame reikšmę 5;
        System.out.println("x=" + x);

        x *= 2; // x-są (x=5) padauginame iš 2 ir priskiriame rezultatą 10;
        System.out.println("x*=2 yra " + x);

        x /= 5;  // x-so naują reikšmę (rezultatą) padaliname iš 5 ir priskiriame jam naują reikšmę 2;
        System.out.println("x/=5 yra " + x);

        x -= 3; // iš x-so prieš tai gautos reikšmės atimame 3 ir priskiriame jam naują reiškšmę -1;
        System.out.println("x-=3 yra " + x);

        x += 7; // prie x-so naujos reikšmės pridedame 7 ir priskiriame jam naują reikšmę 6;
        System.out.println("x+=7 yra " + x);

        // ARITHMETIC OPERATORS

        x++;  // prie x-so naujos reikšmės prideda 1 ir gauna 7;
        System.out.println("x++ yra " + x);

        x--;  // iš x-so naujos reikšėms atima 1 ir gauna 6;
        System.out.println("x-- yra " + x);

        // CONDITIONAL OPERATOR ? :

        int a = 6, b = 12;
        String out = a == b ? "Yes" : "No";
        /*
        Klaustukas reiškia ar a=b, Yes ir No atskirtas dvitaškiu.
        Jei a=b (true), tai visada ims kairiąją dvitaškio pusę, nesvarbu ar ten bus yes, ar no parašyta.
        */
        System.out.println("Ans: " + out);


    }
}
