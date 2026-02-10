package com.lpu.exceptions;

import java.util.Scanner;

public class TryWithResourse {
    public static void main(String[] args) {

        //since scanner is an indeirec child of autoclosable so we can pit in tru with resourses
        //and it will be auto closed
        try (Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ){
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                Thread.sleep(200);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
