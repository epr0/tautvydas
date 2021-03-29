package com.tautvydas.object_oriented.classes;

public class RobotTester {
    public static void main(String[] args) {
        Robot pirmasisRobotas = new Robot();
        System.out.println(pirmasisRobotas.name);
        pirmasisRobotas.name = "Tomas";
        System.out.println(pirmasisRobotas.name);
        pirmasisRobotas.sayHello();
        pirmasisRobotas.dance(pirmasisRobotas.name);

        Robot antrasRobotas = new Robot();
        antrasRobotas.name = "Edvinas";
        antrasRobotas.sayHello();
        antrasRobotas.dance(pirmasisRobotas.name);

        int suma = pirmasisRobotas.skaiciuotiSuma(58);
        System.out.println(suma);

        antrasRobotas.setWeight(200);
        System.out.println(antrasRobotas.skaiciuotiSuma(87));

    }

}
