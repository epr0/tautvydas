package com.tautvydas.homework;

import java.util.Scanner;

public class AreaPerimeterShapes {
    public static void main(String[] args) {

        final float PI = 3.14F;
        int figurosNr = 0;
        short ilgis = 0;
        short plotis = 0;
        short aukstis = 0;
        int perimetras = 0;
        float plotas = 0;
        float diametras = 0;
        short kampas = 0;
        short sonas1 = 0;
        short sonas2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================================================");
        System.out.println("Sveiki! Jūs įjungėte plokščiųjų figūrų plotų ir perimetrų skaičiavimo programą.");
        System.out.println("===============================================================================");

        while (true) {
            System.out.print("Ar norite tęsti toliau? (Taip/Ne): ");
            String answer = scanner.next();
            if (answer.toLowerCase().equals("ne"))
                break;
            else if (answer.toLowerCase().equals("taip")) {
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Figūros, kurių perimetrus ir plotus gali apskaičiuoti programa: ");
                String[] figura = new String[8];
                figura[0] = "           1. Kvadratas";
                figura[1] = "           2. Stačiakampis";
                figura[2] = "           3. Trikampis";
                figura[3] = "           4. Apskritimas";
                figura[4] = "           5. Trapecija";
                figura[5] = "           6. Lygiagretainis";
                figura[6] = "           7. Rombas";
                figura[7] = "           8. Taisyklingasis šešiakampis";

                for (String figuros : figura)
                    System.out.println(figuros);
                System.out.println("-------------------------------------------------------------------------------");

                System.out.print("Įveskite figūros Nr.: ");
                while (true) {
                    figurosNr = scanner.nextInt();      // kaip padaryti, kad jei parašo String (pvz. bet kokias raides), tai mestų tą patį pranešimą, kad tokios figūros nėra.
                    if (figurosNr >= 1 && figurosNr <= 8)
                        break;
                    System.out.print("Tokios figūros nėra. Įveskite figūros Nr. iš pateikto sąrašo: ");
                }
                System.out.println("-------------------------------------------------------------------------------");
                switch (figurosNr - 1) {
                    case 0:
                        System.out.println("   _________  ");
                        System.out.println("  |         | ");
                        System.out.println("a |         | ");
                        System.out.println("  |_________| ");
                        System.out.println("       a      ");
                        System.out.print("Įveskite kvadrato kraštinės a ilgį (cm): ");
                        ilgis = scanner.nextShort();
                        perimetras = ilgis * 4;
                        plotas = ilgis * ilgis;
                        System.out.println("Kvadrato perimetras yra " + perimetras + " cm, plotas - " + plotas + " cm2.");
                        break;
                    case 1:
                        System.out.println("   _______________  ");
                        System.out.println("  |               | ");
                        System.out.println("a |               | ");
                        System.out.println("  |_______________| ");
                        System.out.println("          b        ");
                        System.out.print("Įveskite stačiakampio:\nplotį (cm) a = ");
                        plotis = scanner.nextShort();
                        System.out.print("ilgį (cm) b = ");
                        ilgis = scanner.nextShort();
                        perimetras = (ilgis + plotis) * 2;
                        plotas = ilgis * plotis;
                        System.out.println("Stačiakampio perimetras yra " + perimetras + " cm, plotas - " + plotas + " cm2.");
                        break;
                    case 2:
                        System.out.println("   /\\");
                        System.out.println("a /  \\ b");
                        System.out.println(" /____\\");
                        System.out.println("    c    ");
                        System.out.println("Įveskite trikampio kraštinių ilgius (cm): ");
                        while (true) {
                            System.out.print("a = ");
                            ilgis = scanner.nextShort();
                            System.out.print("b = ");
                            plotis = scanner.nextShort();
                            System.out.print("c = ");
                            aukstis = scanner.nextShort();
                            if (ilgis + plotis > aukstis && ilgis + aukstis > plotis && plotis + aukstis > ilgis)
                                break;
                            System.out.println("Tokio trikampio nubrėžti neįmanoma.\nDviejų kraštinių ilgių suma turi būti " +
                                    "didesnė už likusią trečiąją kraštinę.");
                        }
                        perimetras = ilgis + plotis + aukstis;
                        float pusperimetris = perimetras / 2;
                        plotas = (float) (Math.round((Math.sqrt(pusperimetris * (pusperimetris - ilgis)
                                * (pusperimetris - plotis) * (pusperimetris - aukstis))) * 100.0) / 100.0);
                        System.out.println("Trikampio perimetras yra " + perimetras + " cm, plotas - " + plotas + " cm2.");
                        break;
                    // kaip plotą suapvalinti iki vieno skaičiaus po kablelio?
                    case 3:
                        System.out.println("       ******       ");
                        System.out.println("     **       **    ");
                        System.out.println("   **           **  ");
                        System.out.println("   **           **  ");
                        System.out.println("     **       **    ");
                        System.out.println("       *******      ");
                        System.out.print("Įveskite apskritimo diametrą (cm) d = ");
                        diametras = scanner.nextFloat();
                        float apskritimoIlgis = PI * diametras;
                        plotas = (Math.round((PI * Math.pow((diametras / 2), 2)) * 10)) / 10f;
                        System.out.println("Apskritimo ilgis yra " + apskritimoIlgis + " cm, plotas - " + plotas + " cm2.");
                        break;
                    case 4:
                        System.out.println("     _____b_____      ");
                        System.out.println("    /|          \\    ");
                        System.out.println(" c / |h          \\ d ");
                        System.out.println("  /__|____________\\  ");
                        System.out.println("          a           ");
                        System.out.println("Įveskite trapecijos kraštinių ilgius:");
                        System.out.print("a = ");
                        ilgis = scanner.nextShort();
                        System.out.print("b = ");
                        plotis = scanner.nextShort();
                        System.out.print("h = ");
                        aukstis = scanner.nextShort();  // reikia padaryti apribojimus kaip trikampiui, kad įvestų tik tokius ilgius, iš kurių būtų galima nubrėžti trapeciją.
                        System.out.print("c = ");
                        sonas1 = scanner.nextShort();
                        System.out.print("d = ");
                        sonas2 = scanner.nextShort();
                        perimetras = ilgis + plotis + sonas1 + sonas2;
                        plotas = (ilgis * plotis) / 2 * aukstis;
                        System.out.println("Trapecijos perimetras yra " + perimetras + " , plotas - " + plotas + ".");
                        break;
                    case 5:
                        System.out.println("     _______________ ");
                        System.out.println("    /              / ");
                        System.out.println(" b /              /  ");
                        System.out.println("  /______________/   ");
                        System.out.println("         a           ");
                        System.out.println("Įveskite lygiagretainio kraštinių ilgius:");
                        System.out.print("a = ");
                        ilgis = scanner.nextShort();
                        System.out.print("b = ");
                        plotis = scanner.nextShort();
                        System.out.println("Įveskite kampą laipsniais tarp kraštinių a ir b: ");
                        System.out.print("alfa = ");
                        kampas = scanner.nextShort();
                        perimetras = (ilgis + plotis) * 2;
                        plotas = ilgis * plotis * (float) Math.sin(Math.toRadians(kampas));
                        System.out.println("Lygiagretainio perimetras yra " + perimetras + " , plotas - " + plotas + ".");
                        break;
                }
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
}
