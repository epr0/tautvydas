package com.tautvydas.loops;

public class For1 {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            if (x > 5) {
                break;  //nutraukia ciklą.
            }
            System.out.println("x is " + x);
        }
    }
}