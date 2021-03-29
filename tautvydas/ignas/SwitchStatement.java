package com.tautvydas.ignas;

public class SwitchStatement {
    public static void main(String[] args) {
        int grade = 5;
        switch (grade) {
            case 10:
                System.out.println("Super Star!");
                break;
            case 9:
            case 7:
                System.out.println("Hm, Not bad!");
                break;
            case 5:
                System.out.println("You passed");
            case 4:
                System.out.println("You failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
