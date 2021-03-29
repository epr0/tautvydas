package com.tautvydas.control_flow;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite pasaulio šalių kryptį (n/s/e/w): ");
        char direction = scanner.next().charAt(0); //charAt(1) reiškia, kad skaito antrą įvestą simbolį, pvz. 5n, tai skaitys n.

        switch (direction) {
            case 'n':
            case 'š':
                System.out.println("Keliaujame šiaurės kryptimi!");
                break;
            case 's':
                System.out.println("Keliaujame pietų kryptimi!");
                break;
            case 'e':
                System.out.println("Keliaujame rytų kryptimi!");
                break;
            case 'w':
                System.out.println("Keliaujame vakarų kryptimi!");
                break;
            default:
                System.out.println("Keliaujame nežinoma kryptimi!");
        }
    }
}