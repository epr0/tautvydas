package com.tautvydas.strings;

public class String2 {
    public static void main(String[] args) {
        String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String b = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        System.out.println();

        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());
        System.out.println();

        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());
        System.out.println();

        System.out.println(a.replace("o", "***"));
        System.out.println(b.replace("o", "***"));
        System.out.println();

        System.out.println(a.endsWith("elit"));
        System.out.println(b.endsWith("elit"));
        System.out.println();

        System.out.println(a.compareTo("L"));   //???


    }
}
