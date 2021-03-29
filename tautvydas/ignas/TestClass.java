package com.tautvydas.ignas;

public class TestClass {

    TestClass() {

    }

    public static void main(String[] args) {

        SuperCar superCar = new SuperCar();
        SuperCar moreSuper = new SuperCar();

        String rezultatas = superCar.nuvaziavo();

        System.out.println(rezultatas);

        superCar.nuvaziavoTyliai();

        System.out.println("=========");

        superCar.GREITIS = 50;                  //statiniai keičiasi visose objektuose, ir superCar, ir moreSuper
        int statinis = superCar.GREITIS;

        System.out.println("superCar " + moreSuper.GREITIS);
        System.out.println("moreSuper " + superCar.GREITIS);

        moreSuper.GREITIS = 100;

        int statinis1 = moreSuper.GREITIS;
        System.out.println("superCar " + moreSuper.GREITIS);
        System.out.println("moreSuper " + superCar.GREITIS);


        System.out.println(statinis);
        System.out.println(statinis1);

        superCar.pripiltiBaka(150);

        System.out.println("įpiltas degalu kiekis: " + superCar.degalai);
        System.out.println("netilpo: " + superCar.pervirsis);

        SuperCar naujaMasina = new SuperCar("raudona", 4, 99);
        int pervirsis = naujaMasina.pripiltiBaka(100);
        naujaMasina.nuvaziavoTyliai();

    }
}
