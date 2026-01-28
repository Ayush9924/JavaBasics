package com.lpu.questions;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i< word.length(); i++){
            char a = word.charAt(i);
            if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                counter+=1;
            }
        }
        System.out.println(counter);
    }
}
