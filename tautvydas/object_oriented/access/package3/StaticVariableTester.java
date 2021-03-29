package com.tautvydas.object_oriented.access.package3;

public class StaticVariableTester {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 123;
        employee1.salary = "3000";
        //employee1.ceo = "Steve Jobs";
        Employee employee2 = new Employee();
        employee2.id = 321;
        employee2.salary = "3330";
        //employee2.ceo = "Mark Cuban";
        //employee1.ceo = "new name of ceo";
        //Employee.ceo = "New name"; //go for class name instead of var name for static.
        employee1.showInfo();
        employee2.showInfo();
    }
}

class Employee {
    int id;
    String salary;
    // String ceo;
    static String ceo = "Larry"; //will not be object specific, it will be applicable for all objects

    static {
        ceo = "Larry"; //will be executed once, and not every time we create and object.
        //loads first
        //constructor loads second
    }

    void showInfo() {
        System.out.println(id + " : " + salary + " : " + ceo);
    }
}
