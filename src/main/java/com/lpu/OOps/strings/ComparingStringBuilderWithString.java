package com.lpu.OOps.strings;

public class ComparingStringBuilderWithString {
    public static void main(String[] args) {
        String str = "apple";
        StringBuilder sb = new StringBuilder("apple");
//        System.out.println(str == sb);
        if(str.equals(sb.toString())){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
