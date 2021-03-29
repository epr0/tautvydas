package com.tautvydas.object_oriented.classes5;

public class Siena {
    public int aukstis;
    public int ilgis;
    public double storis;

    Siena() {

    }

    Siena(int aukstis, int ilgis, double storis) {
        this.aukstis = aukstis;
        this.ilgis = ilgis;
        this.storis = storis;
    }

    public double skaiciuotiSienosTuri() {
        return this.aukstis * this.ilgis * this.storis;
    }

    public int skaiciuotiSienosPlota() {
        return this.aukstis * this.ilgis;
    }


}
