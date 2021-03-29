package com.tautvydas.loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nĮveskite žodį: ");
            String input = scanner.nextLine();
            System.out.println("Įvedėte: " + input);
        } while (true);
    }
}
