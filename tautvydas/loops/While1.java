package com.tautvydas.loops;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite žodį: ");
        String input = scanner.nextLine();
        System.out.println("Įvedėte: " + input);

        while (!input.equalsIgnoreCase("stop")) {
            System.out.print("\nĮveskite žodį: ");
            input = scanner.nextLine();
            System.out.println("Įvedėte: " + input);
            System.out.println("Norėdami baigti įveskite žodį \"Stop\".");
        }
    }
}
