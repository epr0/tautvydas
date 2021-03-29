package com.tautvydas.strings;

public class String3 {
    public static void main(String[] args) {
        //int tipo literalai
        int a = 1;
        int b = 2;
        //String literals, created in 'String pool area'
        String eilute1 = "abc";
        String eilute2 = "abc";
        // == tikrina ar abu operandai yra tokie patys objektai,
        System.out.println(eilute1 == eilute2);
        // equals tikrina ar jie turi tokia pacia REIKSME.
        System.out.println(eilute1.equals(eilute2));
        //String object 'Created in heap area'
        String eilute3 = new String("abc");
        System.out.println(eilute1 == eilute3);
        System.out.println(eilute3.equals(eilute1));
        System.out.println();
        System.out.println("__________________");
        String s1 = "Labas";
        String s2 = "Labas";
        String s3 = new String("Labas");
        String s4 = new String("Labas");
        String s5 = "Viso";
        System.out.println(" Comparing strings with equals:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(" Comparing strings with ==:");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println();
        System.out.println("__________________");
        // equals tikrina ar tai ta pati reiksme
        System.out.println(new String("test").equals("test"));// --> true
        // ... bet tai nera tas pats objektas
        System.out.println(new String("test") == "test"); // ->false;
        // ... jie taip pat nera tie lygus
        System.out.println(new String("test") == new String("test")); // --> false
        // jie yra lygus, nes tai String literalai ir jei dalinasi ta pacia nuoroda i test eilute
        System.out.println("test" == "test"); // --> true
        // ... sujungta eilutes nuroda taip pat lygi test eilutes nuorodai, nes jie rodo i ta pacia eilute
        System.out.println("test" == "te" + "st");// --> true
    }
}




