package com.lpu.OOps.strings;

public class InterExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s2.intern();
//        it will create a brand new stirng if its not exist in there other wise it compares it value with the differnt string from anywhere its finds


        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
