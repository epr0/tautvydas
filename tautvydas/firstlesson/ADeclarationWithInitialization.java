package com.tautvydas.firstlesson;

public class ADeclarationWithInitialization {
    public static void main(String[] args) {
        int tautvydoAmzius = 31;
        tautvydoAmzius = 35; //galima taip priskirti naują amžių.
        // int tautvydoAmzius = 37; taip negalima, nes int jau užimtas, galima be int.

        System.out.println(tautvydoAmzius); //ims patį paskutinį Tautvydo amžių.
    }
}
