package com.lpu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = {10,11,5,6,0};
        try {
            System.out.println(10 / arr[num]);
        }
        catch (ArrayIndexOutOfBoundsException e){//class is ArrayIndex
            System.out.println("Exception occurred");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("exception occurred");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("exception occures");
            e.printStackTrace();
        }catch (Exception e){// if we use it before it make dead code always put this at the end make sure as a default exception block
            System.out.println("exception occurred");
            e.printStackTrace();
        }

        System.out.println("END");
    }

}
//throwable has two child errorr and exceptions //what ever bad things happen its because of throwable
//ArraysIndexOutOfBound -> indexoutofbond -> runtimeexceptions -> exception - throwable