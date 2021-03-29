package com.tautvydas.ignas;

public class SuperCar {
    String spalva;
    int ratai;
    int bakas;
    int degalai;
    int pervirsis;
    public static int GREITIS = 100;

    SuperCar() {                    // šitas konstruktorius jau ne tuščias.
        spalva = "geltona";
        ratai = 4;
        bakas = 100;
        degalai = 0;
    }

    public SuperCar(String spalva, int ratai, int bakas) {
        this.spalva = spalva;
        this.ratai = ratai;
        this.bakas = bakas;
    }

    public void nuvaziavoTyliai() {         // void metodas kažką padaro, pvz. nupiešia apskritimą ekrane, kai užduodi spindulį.
        if (ratai < 4)
            System.out.println("Masina nevaziuos, per mazai ratu.");
        else
            System.out.println("masina nuvaziavo " + bakas + " kilometru tyliai");
    }

    public String nuvaziavo() {
        return "masina nuvaziavo " + bakas + " kilometru";
    }

    public int pripiltiBaka(int ipilamiDegalai) {
        if (bakas >= ipilamiDegalai) {
            degalai += ipilamiDegalai;
        } else {
            pervirsis = ipilamiDegalai - bakas;
            degalai = bakas;
        }
        return pervirsis;

    }
}
