package com.tautvydas.ignas;

public class StringBuilderTool {
    public static void main(String[] args) {
        //taip nereikia daryti
        String x = "Hello ";
        x = x + "Java";
        x = x + ", this is ";
        x = x + "my World.";
        System.out.println(x);
        // geriau daryti taip
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ").append("Java").append(", this is ").append("my World.");
        System.out.println(sb);
    }
}
