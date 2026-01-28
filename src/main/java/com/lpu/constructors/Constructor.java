package com.lpu.constructors;

public class Constructor {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        System.out.println(m1.brand);
        System.out.println(m1.color);
        Marker m2 = new Marker(20 ,"pink", "cello");
        System.out.println(m2.color);
        System.out.println(m2);
        System.out.println(m2.hashCode());
        System.out.println(m2.returnME().hashCode());
    }
}
