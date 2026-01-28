package com.lpu.basics;

public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x = 10 % 3;
        System.out.println(x);

        x = 965;
        System.out.println(965%10);
        System.out.println(965/10);

        int y = 100;

        x = 9;
        x = x+100;
        x += 100;

        //bit wise logical operator

        System.out.println(7 & 6);
        System.out.println(7 | 6);
        System.out.println(7 ^ 6);
        System.out.println(~7);

        //right shift
        System.out.println(8>>1);
        System.out.println(8>>2);

    }
}
