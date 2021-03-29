package com.tautvydas.strings;

public class String5 {
    public static void main(String[] args) {
        // STRINGS BUILDER DEMO
        //Note, string are immutable almost all of the time.
        String string = "Zaliasis";
        string.concat(" Vanagas");
        System.out.println(string); // prints Zaliasis, because Strings are immutable.

        String sujungtas = string.concat(" Vanagas");  // sukūriau naują stringą, kuris yra string "Zaliasis" + String "Vanagas"
        System.out.println(sujungtas); // prints Zaliasis Vanagas

        String string2 = string.concat(" Vanagas");
        String string3 = string2.concat(" Vanagas");
        System.out.println(string3);


        String sarasas = "Tomas, Artur";
        String sarasas2 = sarasas.concat(" Tautvydas");
        System.out.println(sarasas2);
        //StringBuffer and StringBuilder are used
        //mutable, thread safe for synchronisation.
        StringBuffer buffer = new StringBuffer("Raudonas");
        //Vis dar vienas ir tas pats objektas
        //buffer.append(" Tigras");
        //buffer.replace(0,8, "Baltas");
        //buffer.delete(0,2);
        System.out.println(buffer);
        //Faster than stringBuffer
        StringBuilder builder = new StringBuilder("Geltonas");
        builder.append(" Lokys").append(" Paukstis").append(" Varnas");
        builder.replace(0, 8, "Baltasis");
        // builder.delete(8, 10);
        System.out.println(builder);
    }
}
