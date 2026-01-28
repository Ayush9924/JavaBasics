package com.lpu.OOps.strings;

public class StringsIntro {
    public static void main(String[] args) {
        String s1 = new String("hello kitty");
        String s2 = "hello kitty";
        String s3 = "hello kitty";
        String s4 = new String("hello kitty");
        String s2_ = new String(s2);

        if(s2 == s2_){ // == compares the address
            System.out.println("EQUAL");
        }
        else {
            System.out.println("NOT EQUAL");
        }

        if(s1.equals(s2)){// if we want to compare the value two then we use .equals
            System.out.println("equal value");
        }
        else{
            System.out.println("not equal value");
        }

        String s5 = "Hello Kitty";

    }
}
