package com.lpu.OOps.strings;
import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int inputNum = sc.nextInt();
        System.out.println(inputNum);

        //string flushing
        sc.nextLine();

        System.out.println("enter sentence");
        //String word = sc.next();
        String sentence = sc.nextLine();
        System.out.println(sentence);
        System.out.println(sentence.length());
    }
}
