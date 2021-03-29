package com.tautvydas.object_oriented.classes5;

public class Pamatas {
    int plotis;
    int ilgis;
    int aukstis;

    Pamatas() {         // reikia tuščio konstruktorius, kad

    }

    Pamatas(int plotis, int ilgis, int aukstis) {
        this.plotis = plotis;
        this.ilgis = ilgis;
        this.aukstis = aukstis;
    }

    int skaiciuotiPlota() {
        return this.ilgis * this.plotis;
    }

    int skaiciuotiTuri() {
        return this.plotis * this.aukstis * this.ilgis;
    }
}
