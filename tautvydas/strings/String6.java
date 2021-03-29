package com.tautvydas.strings;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("iveskite zodi: ");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        System.out.println("Ivestas zodis atbulai: " + stringBuilder.reverse());
    }
}

