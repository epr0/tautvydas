package com.tautvydas.object_oriented.classes5;

public class Stogas {
    public int plotis;
    public int ilgis;
    public double storis;

    Stogas() {

    }

    Stogas(int plotis, int ilgis, double storis) {
        this.plotis = plotis;
        this.ilgis = ilgis;
        this.storis = storis;
    }

    public int skaiciuotiStogoPlota() {
        return this.ilgis * this.plotis;
    }

    public double skaiciuotiStogoTuri() {
        return this.ilgis * this.plotis * this.storis;
    }

}