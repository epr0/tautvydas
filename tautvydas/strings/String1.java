package com.tautvydas.strings;

public class String1 {
    public static void main(String[] args) {
        // string yra objektas, visi kiti (int, char..) yra primityvai.
        String a = "abc";
        String b = "abc";
        String c = "ABC";
        String eilute1 = new String("abc");  //objektas
        String eilute2 = new String("abc");  //objektas
        String eilute = new String("ABC");  //objektas

        // LYGINIMO REZULTATAI
        System.out.println(a == b);                      /* TRUE, nes stringai a ir b sukurti ne kaip objektai ir
                                                            lygina tik nuorodas į juos. */

        System.out.println(eilute1 == eilute2);          /* FALSE, nes stringai sukurti kaip objektai per new String,
                                                            todėl lyginti reikia su equals ir bus TRUE. */
        System.out.println((a == eilute1));              /* FALSE, nes vienas stringas sukurtas kaip objektas per
                                                            new String, o kitas paprastai priskirtas, todėl
                                                            lyginti reikia su equals ir bus TRUE. */

        System.out.println(eilute1.equals(eilute2));     // TRUE, nes stringus lyginame su equals.
        System.out.println(a.equals(b));                 // TRUE, nes stringus lyginame su equals.
        System.out.println(a.equals(eilute1));           // TRUE, nes stringus lyginame su equals.

        System.out.println(c.equalsIgnoreCase(a));       /* TRUE, nes tik naudodami equals komandą galime pridėti
                                                            IgnoreCase komandą. Su == to negalime padaryti. */
        System.out.println(c.equalsIgnoreCase(eilute1)); // TRUE, nes stringus lyginame su equals.

    }
}
