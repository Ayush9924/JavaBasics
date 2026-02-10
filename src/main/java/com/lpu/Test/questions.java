package com.lpu.Test;

import java.util.Scanner;

public class questions {
        public static void ChangeString(int n, String str) {
            StringBuilder scanner = new StringBuilder();
            for (int i = 0; i < n; i++) {
                scanner.append(str);
            }
            String Str = scanner.toString();
            String finalStr =Str.toUpperCase();

            System.out.println(finalStr);
            System.out.println("Length: " +finalStr.length());
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();

            ChangeString(n, str);
        }
    }

