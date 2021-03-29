package com.tautvydas.ignas;

public class BreakBreak {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Pirmas while loop");
            while (true) {
                System.out.println("Antras while loop");
                break;
            }
            break;
        }
    }
}
