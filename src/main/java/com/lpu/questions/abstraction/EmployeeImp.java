package com.lpu.questions.abstraction;

public class EmployeeImp extends Employee{


    public EmployeeImp(String name) {
        super(name);
    }

    @Override
    public void role() {
        System.out.println("Role: Delivery Employee");
    }
}