package com.lpu.OOps.encapsulation;

public class Student {

    // 🔐 Private data members (ENCAPSULATION)
    private int roll;
    private String name;

    // ✅ Parameterized constructor
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // ✅ Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // ✅ Getter for roll
    public int getRoll() {
        return roll;
    }

    // ✅ Setter for roll
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // ✅ Information method
    public String info() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
