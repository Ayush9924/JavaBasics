package com.lpu.polymorphism;

public class Main {
    public static void main(String[] args) {
        shape S = new shape();
        System.out.println(S.squ(5));
        System.out.println(S.rec(5, 7));
        System.out.println(S.circle(15));
        System.out.println(S.parallelogram(5, 8));

    }
    //overLoading compile time same fucntion name with diff parameter, diff types, diff position;

}
