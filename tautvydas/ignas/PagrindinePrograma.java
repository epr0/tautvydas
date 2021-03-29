package com.tautvydas.ignas;

import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prašome užsiregistruoti.");

        System.out.print("Įveskite e-mail: ");
        String emailOriginal = scanner.nextLine();

        System.out.print("Įveskite password: ");
        String passwordOriginal = scanner.nextLine();

        LoginForm loginForm = new LoginForm(emailOriginal, passwordOriginal);

        System.out.println("Jūs sėkmingai užsiregistravote.");
        // System.out.println(loginForm.emailOriginal);
        // System.out.println(loginForm.passwordOriginal);

        System.out.println("\nPrašome prisijungti.");

        System.out.print("\nĮveskite email: ");
        String emailCheckValue = scanner.nextLine();
        System.out.print("\nĮveskite password: ");
        String passwordCheckValue = scanner.nextLine();

        if (!loginForm.login(emailCheckValue, passwordCheckValue)) {
            System.out.println("Įvesti duomenys nesutampa.");
        }

    }
}
