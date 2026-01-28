package com.lpu.questions;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter anything you want it to be in reverse:");
        String a = scanner.next();
        String rev = "";
        for (int i = 0; i<a.length(); i++){
            rev = a.charAt(i)+rev;
            //System.out.println(rev);
        }
        System.out.println("am opposite of what you written : "+rev);

    }
}
