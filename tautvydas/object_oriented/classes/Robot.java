package com.tautvydas.object_oriented.classes;

public class Robot {

    //apsirasom objekto Robot busena/state
    public String name;
    String color;
    int weight = 100;
    double version = 1.0;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    //apsirasome objekto Robot elgesi/behavior
    void sayHello() {
        System.out.println("Labas mano vardas yra " + name);
    }

    void dance(String kitoRobotoVardas) {
        System.out.println("As soku... soku... soku... su " + kitoRobotoVardas);
    }

    int skaiciuotiSuma(int papildmasSvoris) {
        int suma = weight + papildmasSvoris;
        return suma;
    }
}
