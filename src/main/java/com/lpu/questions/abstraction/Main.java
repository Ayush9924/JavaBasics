package com.lpu.questions.abstraction;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new EmployeeImp("Ayush");
        Employee emp2 = new EmployeeImp("Rahul");
        Employee emp3 = new EmployeeImp("Rohit");

        emp1.showDetails();
        emp1.role();

        System.out.println();

        emp2.showDetails();
        emp2.role();

        System.out.println();

        emp3.showDetails();
        emp3.role();
    }
}



//Interface is a blueprint of a class that contains only method declarations, and classes implement it to provide behavior.
//A constructor is a special method that automatically runs when an object is created to initialize its data.
