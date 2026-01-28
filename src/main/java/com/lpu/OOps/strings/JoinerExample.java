package com.lpu.OOps.strings;

import java.util.StringJoiner;

public class JoinerExample {
    public static void main(String[] args) {
        //csv uses
        StringJoiner sj = new StringJoiner(",", "[","]");
        sj.add("apple");
        sj.add("banana");
        sj.add("orange");
        System.out.println(sj.toString());
    }
}
