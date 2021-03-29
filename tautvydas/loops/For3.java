package com.tautvydas.loops;

public class For3 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            if (x == 0) {
                System.out.println("##########");
                // System.out.println();
            }
            System.out.println("#        #");
            if (x == 4) {
                System.out.println("##########");
            }
        }
        System.out.println();
        for (int y = 0; y < 5; y++) {
            System.out.println("##########");
        }
    }
}