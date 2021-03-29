package com.tautvydas.object_oriented.classes5;

public class House {
    public double kainaKvadratinioMetro;
    public int plotas;
    public int kambariuSkaicius;

    public Pamatas pamatas;
    public Siena siena;
    public Stogas stogas;

    House() {

    }

    House(double kainaKvadratinioMetro, int plotas, int kambariuSkaicius) {
        this.kainaKvadratinioMetro = kainaKvadratinioMetro;
        this.plotas = plotas;
        this.kambariuSkaicius = kambariuSkaicius;
    }

    public double skaiciuotiKaina() {
        return this.kainaKvadratinioMetro * this.plotas;
    }

    public int skaiciuotiVidKambPlota() {
        return this.plotas / this.kambariuSkaicius;
    }

}
