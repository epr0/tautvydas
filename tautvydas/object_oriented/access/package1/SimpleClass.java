package com.tautvydas.object_oriented.access.package1;

/*
Java provides a number of access modifiers to set access levels
for classes, variables, methods and constructors.
Those are: Default, Public, Protected and Private
 */
public class SimpleClass { //Only PUBLIC and DEFAULT
    int day = 1; //Default matomumas - Matomas "PACKAGE" lygyje, nereikia nurodyti papildomo access modifier
    public int week = 7; //Public matomumas - Matomas VISUR, nes yra "viesas".
    protected int month = 10; //Protected matomumas - Matomas "PACKAGE" ir visose "vaikinese" klasese (subclass)
    private int year = 2009; //Private matotumas - Matomas tik klaseje, kurioje buvo sukurtas.

    public int printYear() { //Metodai taip pat naudoja visus 4 access modifiers.
        return year;
    }
}
