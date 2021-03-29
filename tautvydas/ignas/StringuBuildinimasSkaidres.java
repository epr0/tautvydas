package com.tautvydas.ignas;

public class StringuBuildinimasSkaidres {
    public static void main(String[] args) {

        StringBuilder x = new StringBuilder("Tom");
        x.append("&");
        StringBuilder y = x.append("Jerry");
        System.out.println(x);
        System.out.println(y);
    }
}
/*   StringBuilder'is yra klasė, turinti metodus (kaip, pvz., append()), kurie Immutable String'ą į Mutable.
     Tai reiškia, kad su šios klasės metodais mes galima keisti String'o reikšmę. Pvz., su metodu append() prilipdome
     papildomus ženklus ir žodžius ir atspausdintas Stringas x nuo pradinio "Tom" pasikeičia į "Tom&Jerry".

      GRUBUS PAAIŠKINIMAS kaip viskas veikia:
      Su StringBuilderiu sukuriu StringBuilderio objektą ir jam priskiriu "Tom"

      SMULKIAI VISKAS PAAIŠKINTA:
      Kintamajam x priskiriu kintamojo duomenų tipą "StringBuilder", kuris yra pagal nutylėjimą importuota klasė, ir
      su operatoriumi "new" išskiriu šiam kintamajam x vietą HEAP atmintyje, parašau, kad naudos metodą
      StringBuilder() ir priskiriu kintamajam argumentą "Tom".




*/
