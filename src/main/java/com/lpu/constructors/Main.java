package com.lpu.constructors;

public class Main {
    public static void main(String[] args) {
        Marker m1 = new Marker();

        Marker m2 = new Marker();

        Marker m3 = m2;

        m1.brand = "Luxar";
        m1.color = "black";
        m1.price = 50;

        System.out.println(m1.brand);
        System.out.println(m1.color);
        System.out.println(m1.price);

        System.out.println(m2.brand);
        System.out.println(m2.color);
        System.out.println(m2.price);

        m2.price = 90;
        System.out.println(m3.price);

        System.out.println(m3);//give us hash code
        //almost unique code for it
        System.out.println(m3.hashCode());
        Marker m4 = m1;
        m1 = null;
//        System.out.println(m1.price);
        System.out.println(m4.price);


    }
}
