package com.tautvydas.operators;

import javax.sound.midi.Soundbank;

public class Operators1 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x++); /* pirma išspausdina x=4, o paskui prideda 1 per ++, bet neišspausdina,
        o tik priskiria naują reikšmę x-sui*/
        System.out.println(x); // x-sas jau dabar išspausdinamas 5.
        System.out.println(++x); // pirma prie x prideda 1 per ++, tada išspausdina 6.
        System.out.println(x++); // ++ = +1
        System.out.println(--x);
        System.out.println(x % 3); // rodo liekaną.
        System.out.println(11 % 2);
        System.out.println(7 % x++);
        System.out.println(x == 4); // shows is it true or false
        System.out.println(x != 4);
        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // && - AND operatorius.
        System.out.println(x <= y || y > 5);  // || - OR operatorius.

        System.out.println("abc" instanceof String); // instanceof patikrina ar abc yra stringas

        int a = 5;
        a = a + 1; // or a +=1
        System.out.println(a);

        int b = 2;
        int c = 5;
        b *= c;
        System.out.println(b);
    }
}
