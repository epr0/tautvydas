package com.tautvydas.control_flow;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a string 'str', 'abc' or 'afk'");
        String inputString = inputScanner.nextLine();
        if (inputString.equalsIgnoreCase("str")) {
            System.out.println("you wrote: " + inputString);
        } else if (inputString.equalsIgnoreCase("abc")) {
            System.out.println("you wrote: " + inputString);
        } else if (inputString.equalsIgnoreCase("afk")) {
            System.out.println("you wrote: " + inputString);
        } else {
            System.out.println("no such symbol");
        }
    }
}