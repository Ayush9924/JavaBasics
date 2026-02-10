package com.lpu.exceptions;

import java.util.Scanner;

public class TryCatchCombo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        try {


            try {
                for (int i = 0; i < num; i++) {
                    Thread.sleep(200);
                    System.out.println(i);
                }
                //return;//still finally will run
                System.exit(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Finally block executed");
                scanner.close();
            }
//        }catch (Exception e){
//
//        }
        // scanner.close();//after closing we cannot take inputs anymore with the same scanner obj

        try{
            System.out.println(8 / new Scanner(System.in).nextInt());
        }finally {
            scanner.close();
        }
    }
}
