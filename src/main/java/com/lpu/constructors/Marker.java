package com.lpu.constructors;

public class Marker {
    //instance variable direcly declar inside the class;
    int price;
    String color;
    String brand; //string is a class it not a keyword

    Marker() { //non parametrized constructor
        //cycle chaining
        //this(4, "BOOM");
        System.out.println("marker() called");
    }

    Marker(int price, String color) {
        this();
        System.out.println("Marker(int price, String color)");
        this.price = price;
        this.color = color;
        System.out.println();
    }

    Marker(int price, String color, String brand) {
        //contructor chaning
        this(price, color);
        System.out.println("Marker(int price ,String color, String brand) called");
        //shadow problem
        this.price = price;
        this.color = color;
        this.brand = brand;

        System.out.println(price);
        System.out.println(color);
        System.out.println(brand);
    }

    void write() {
        System.out.println("writting witha a " + color + "ink");
    }

    void throwing() {
        System.out.println("throwing marker");
    }

    Marker returnME() {
        return this;

        //this hold address of currect obj
    }
}






