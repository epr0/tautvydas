package com.tautvydas.secondlesson;

import java.util.Scanner;

public class Pavyzdys {
    public static void main(String[] args) {
        boolean repeatAction = true;
        int errorCounter = 0;
        int counterLimit = 3;
        Scanner scanner = new Scanner(System.in);
        while (repeatAction == true) {
            // Call methods:
            Method1();
            Method2();
            Method3();
            errorCounter = 0; // <== reset errorCounter before asking user input
            // boolean inputCorrect = false; // <== default value;
            while (errorCounter < counterLimit) {
                System.out.println("REPEAT? Y/N");
                try {
                    String answer = scanner.nextLine();
                    if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                        // User input is NOT "y" or "n"
                        System.out.println("Nežinomas pasirinkimas!");
                        errorCounter++;
                    } else if (answer.equalsIgnoreCase("n")) {
                        // User input in "n"
                        System.out.println("Programos pabaiga.");
                        System.exit(0); // <== Terminate program because of user request. [Correct exit]
                    } else {
                        // User input is "y". Break while loop and call methods again.
                        break;
                    }
                } catch (Exception e) {
                    // Error!
                    System.out.println("Neteisinga ivestis!");
                    errorCounter++;
                }
                if (errorCounter == counterLimit) {
                    System.out.println("Virsytas bandymu skaicius. Progamos pabaiga.");
                    System.exit(1); // <== Terminate program because of error! [Incorrect exit]
                } else if (errorCounter > 0) {
                    System.out.println("Bandykite dar karta...");
                }
                //while ends here
            }
            //while ends here
        }
    }

    private static void Method1() {
        System.out.println("Method 1 completed!");
    }

    private static void Method2() {
        System.out.println("Method 2 completed!");
    }

    private static void Method3() {
        System.out.println("Method 3 completed!");
    }
}
