package com.tautvydas.object_oriented.classes5;

public class HouseBuilder {
    public static void main(String[] args) {
        // Pamatas pamatas = new Pamatas();
        // pamatas.plotis = 10;
        // pamatas.ilgis = 15;

        Pamatas pamatas = new Pamatas(300, 100, 600);
        System.out.println("Pamato plotas: " + pamatas.skaiciuotiPlota());
        System.out.println("Pamato tūris: " + pamatas.skaiciuotiTuri());

        Pamatas pamatas1 = new Pamatas();
        pamatas.aukstis = 50;
        pamatas.ilgis = 1000;
        pamatas.plotis = 25;
        System.out.println("Pamato1 plotas: " + pamatas1.skaiciuotiPlota());
        System.out.println("Pamato1 tūris: " + pamatas1.skaiciuotiTuri());


        Siena siena = new Siena(3, 20, 0.25);
        // siena.plotis = 5;
        // siena.ilgis = 6;
        System.out.println("Sienos plotas: " + siena.skaiciuotiSienosPlota());
        System.out.println("Sienos tūris: " + siena.skaiciuotiSienosTuri());

        Stogas stogas = new Stogas(5, 10, 0.3);
        // stogas.ilgis = 10;
        // stogas.plotis = 15;
        System.out.println("Stogo plotas: " + stogas.skaiciuotiStogoPlota());
        System.out.println("Stogo tūris: " + stogas.skaiciuotiStogoTuri());

        House house = new House(1800.5, 120, 4);
        System.out.println("Namo kaina: " + house.skaiciuotiKaina());
        System.out.println("Vidutinis " + house.kambariuSkaicius + " kambarių plotas: "
                + house.skaiciuotiVidKambPlota());

        house.kainaKvadratinioMetro = 1200;
        System.out.println("Nauja namo kaina: " + house.skaiciuotiKaina());

        house.kambariuSkaicius = 5;
        System.out.println("Vidutinis " + house.kambariuSkaicius + " kambarių plotas: "
                + house.skaiciuotiVidKambPlota());


        // int bendrasPlotas = pamatas.skaiciuotiPlota() + siena.skaiciuotiSienosPlota() + stogas.skaiciuotiStogoPlota();

    }
}
