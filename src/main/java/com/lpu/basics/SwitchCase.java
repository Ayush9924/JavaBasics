package com.lpu.basics;

import java.util.Scanner;

public class SwitchCase {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter any thing");
//        String day = scanner.nextLine();
//        System.out.println(day);
//
//        int num = scanner.nextInt();
//        System.out.println(num);
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        outer: while (flag) {
            System.out.println("enter your choice");
            System.out.println("1: coke\n2: limca\n3: pepsi");

            int choice = scanner.nextInt();
//            if (choice == 1) {
//                System.out.println("coke");
//            } else if (choice == 2) {
//                System.out.println("limca");
//            } else if (choice == 3) {
//                System.out.println("coke");
//            } else if( choice == 0){
//                break;
//            }
//            else {
//                System.out.println("make a valid choice");
//            }

            switch (choice){
                case 1: {
                    System.out.println("coke");
                    break;
                }
                case 2: {
                    System.out.println("limca");
                    break;
                }
                case 3: {
                    System.out.println("pepsi");
                    break;
                }
                case 0: {
//                    System.exit(8);
//                    flag = false;
//                    System.out.println(flag);
                    break outer;

                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
//        System.out.println("thank you");
    }
}