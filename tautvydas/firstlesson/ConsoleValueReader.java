package com.tautvydas.firstlesson;

import java.util.Scanner;

public class ConsoleValueReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite pirmą skaičių: ");
        int num1 = scanner.nextInt();
        System.out.print("Įveskite antrą skaičių: ");
        int num2 = scanner.nextInt();
        System.out.print("Įveskite trečią skaičių: ");
        int num3 = scanner.nextInt();
        System.out.print("Įveskite ženklą (x,/,+,-) kokį matematinį veiksmą norite daryti: ");
        char zenklas = scanner.next().charAt(0);
        int rezultatas = 0;
        String klaidosPranesimas;

        if (zenklas == 'x') {
            rezultatas = num1 * num2 * num3;
        } else if (zenklas == '/') {
            rezultatas = num1 / num2 / num3;
        } else if (zenklas == '+') {
            rezultatas = num1 + num2 + num3;
        } else if (zenklas == '-') {
            rezultatas = num1 - num2 - num3;
        } else {
            klaidosPranesimas = "Įvestas klaidingas simbolis.";
            System.out.println(klaidosPranesimas);
            System.exit(1);
        }
        System.out.println("Jūsų įvestų skaičių matematinis veiksmas yra " + rezultatas + ".");
    }
}
