package com.tautvydas.object_oriented.classes2;

public class HelicopterTester {
    public static void main(String[] args) {
        int skaicius = 5;
        int kitasSkaicius = 6;
        double dvigubas = 6.5;
        Helicopter helicopter = new Helicopter(); // sukuria sraigtasparnio OBJEKTA
        //sukurti kita objekta
        helicopter.bakoTuris = 5;
        helicopter.vietuSkaicius = 20;
        helicopter.greitis = 300;
        helicopter.svoris = 1000;
        helicopter.kelionesKaina = 5;
        System.out.println("Sraigtasparnio charakteristikos: ");
        System.out.println("bako turis " + helicopter.bakoTuris);
        System.out.println("vietu skaicius " + helicopter.vietuSkaicius);
        System.out.println("greitis " + helicopter.greitis);
        System.out.println("svoris " + helicopter.svoris);
        System.out.println(helicopter.skaicuotiKelionesKaina
                (helicopter.vietuSkaicius, helicopter.kelionesKaina, "Eurai"));
    }
}

class Helicopter {
    int vietuSkaicius; //kiek telpa keleiviu
    int kelionesKaina;
    int greitis; //koks sraigtasparnio greitis
    int svoris; //koks jo svoris
    double bakoTuris; //kiek telpa litru degalu

    String skaicuotiKelionesKaina(int vietos, int kaina, String valiuta) {
        int bendraSuma = kaina * vietos;
        return "keliones kaina valiuta" + valiuta + " " + bendraSuma;
    }
}
