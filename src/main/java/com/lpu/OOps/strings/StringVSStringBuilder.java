package com.lpu.OOps.strings;

//import java.util.Scanner;

public class StringVSStringBuilder {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        String s1 = "hello";
        long start = System.nanoTime();

        for(int i = 0; i<100000; i++){//6933627700 string time
//            s1 += " world";
            sb.append("word");//14888600 string builder time
        }

        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
