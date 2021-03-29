package com.tautvydas.firstlesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Math.round;

public class GasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.print("Užpiltų degalų tipas (Diesel/Petrol/Gas): ");
        String tipas = scanner.nextLine();
        double kaina = 0;
        if (tipas.equals("Diesel")) {
            kaina = 1.25;
            System.out.println("Kuro kaina 1,25 Eur/l");
        } else if (tipas.equals("Petrol")) {
            kaina = 1.15;
            System.out.println("Kuro kaina 1,15 Eur/l");
        } else if (tipas.equals("Gas")) {
            kaina = 0.56;
            System.out.println("Kuro kaina 0,56 Eur/l");
        } else {
            System.out.println("Tokios kuro rūšies nėra.");
            return;
        }


        System.out.print("Kolonėlės Nr.: ");
        byte kolonele = scanner.nextByte();
        System.out.print("Užpilto kuro kiekis litrais: ");
        double kiekis = scanner.nextDouble();
        double suma = kaina * kiekis;


        // System.out.print("Litro kaina (Eur): ");
        // double kaina = scanner.nextDouble();
        // double suma = Math.round((kaina) * kiekis)) * 100 / 100;

        System.out.println("--------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|         Degalinė „Viada“           |");
        System.out.println("|                                    |");
        System.out.println("|  " + dtf.format(now) + "   " + "\t\t|");
        System.out.println("|                                    |");
        System.out.println("|  Kuro tipas  :   " + tipas + "            |");
        System.out.println("|  Litrai      :   " + kiekis + "              |");
        System.out.println("|  Eur/Litras  : € " + kaina + "              |");
        System.out.println("|                                    |");
        System.out.println("|  Suma        : € " + suma + "       |");
        System.out.println("|                                     |");
        System.out.println("--------------------------------------");
    }
}

