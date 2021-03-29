package com.tautvydas.object_oriented.classes3;

public class RobotAndPersonTester {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.vardas = "Robotas Policininkas";
        robot.spalva = "Raudona";
        robot.svoris = 50;
        robot.sayHello();
        robot.sayProperties();
        Person person = new Person("Thomas", "Calm", false, robot);
        //person.robotOwned.sayProperties();
        //System.out.println(person.robotOwned.toString());
        //System.out.println(person.name);
        //System.out.println(person.personality);
        //System.out.println(person.isSitting);
        //person.sitDown();
        //System.out.println(person.isSitting);
    }
}