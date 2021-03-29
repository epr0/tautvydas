package com.tautvydas.control_flow;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite savo amžių: ");
        int amzius = scanner.nextInt();

        if (amzius < 18) {
            System.out.println("Tu dar paauglys!");
        } else if (amzius == 18 || amzius < 21) {
            System.out.println("Tu jau pilnametis!");
        } else if (amzius < 65) {
            System.out.println("Tu jau vidutinio amžiaus!");
        } else {
            System.out.println("Tu jau pensininkas!");
        }
    }
}
