package com.lpu.basics;

public class LoopsDeepDive {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if(i==5){
                continue;
            }
            System.out.println(i);

        }

        do{
            System.out.println("strop me");
        }while(6<2);

        int y = 10;
        boolean isPositive = y > 0 ? true : false;//ternary operator



//        int j = 0;
//        loop2:
//        for (; j < 10; j++) {
//            System.out.println("j -> " + j);
//        }
//        System.out.println(j);

    }
}

