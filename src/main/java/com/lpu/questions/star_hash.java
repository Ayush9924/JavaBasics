package com.lpu.questions;

public class star_hash {
    public static void main(String[] args) {
        int n = 5;
        char a = 'a';
        char A = 'A';
//        for (int i = 1; i<=n; i++){
//            for (int j = 5; j>n-i; j--){
//                System.out.print(a);
//                a++;
//            }
//            for (int k = n-1; k>=i; k--){
//                System.out.print(A);
//                A++;
//            }
//            System.out.println();
//        }
//    }
//}

 for (int i = 1; i<n; i++){
        for (int j = 1; j<=n-i; j++){
        System.out.print("x");
            }
                    for (int k = 1; k<=i; k++){
        System.out.print("#");
            }
                    System.out.println();
        }
     }
}