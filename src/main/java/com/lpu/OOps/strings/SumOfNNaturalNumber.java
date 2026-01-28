package com.lpu.OOps.strings;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        //calculate the sum of first n natural number

//        for(int i = 0; i<=num; i++){
//            sum = sum+i;
//            System.out.println(sum+" + "+i);
//        }
        if(num >0){
            sum = (num * (num +1)) / 2;
        }
        System.out.println(sum);
//        Scanner.close();
    }
}
