package com.lpu.Test;

class question4 {
    String name;
    int marks;

    static String college = "LPU";
    static final int MAXMARKS = 100;

    question4(String n, int m) {
        this.name = n;
        this.marks = m;
    }

    void printPercentage() {
        double percent = (marks * 100.0) / MAXMARKS;

        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Marks Obtained: " + marks);
        System.out.println("Percentage: " + String.format("%.2f", percent) + "%");
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {

        question4 s1 = new question4("Ayush", 87);
        question4 s2 = new question4("Roxy", 92);

        s1.printPercentage();
        s2.printPercentage();
    }
}
