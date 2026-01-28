package com.lpu.OOps.strings;

public class StringBuilders {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();//specific import
        sb.append("how are you");
        sb.append("?");
        System.out.println(sb);
        sb.insert(0,"hello");
        System.out.println(sb);
    }
}
//we use it in file manupulation
