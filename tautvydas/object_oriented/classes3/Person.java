package com.tautvydas.object_oriented.classes3;

public class Person {

    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned; //koks robotas asmeniui priklauso

    Person(String name, String personality, boolean isSitting, Robot robotOwned) {
        this.name = name;
        this.personality = personality;
        this.isSitting = isSitting;
        this.robotOwned = robotOwned;
    }

    void sitDown() {
        this.isSitting = true;
    }

    void standUp() {
        this.isSitting = false;
    }
}
