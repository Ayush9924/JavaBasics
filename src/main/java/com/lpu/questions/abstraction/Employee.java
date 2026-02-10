package com.lpu.questions.abstraction;

public abstract class Employee {

    String name;
    final String empID;
    private static int counter = 0;

    public Employee(String name) {
        this.name = name;
        this.empID = "EMP" + (++counter);
    }

    public abstract void role();

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empID);
    }
}

