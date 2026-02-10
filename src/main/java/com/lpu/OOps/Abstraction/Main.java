package com.lpu.OOps.Abstraction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BankAccount ac1 =
                new BankAccount("Ayush", 504664L,
                        "HDFV69", 90556L ,AccountType.SAVINGS);

        System.out.println(ac1);

        ac1.deposit(3400, 3000, 21000, 200, -9);
        System.out.println(ac1);

        ac1.withdraw(400);
        System.out.println(ac1);

//        BankAccountAbs ac2 =
//                new BankAccountAbs("Ayush", "HDFC69",
//                        95231430L, AccountType.SAVINGS);

        BankAccountAbs ac2 = new BankAccountAbsImpl("ayush", "HDFC123",98665133L,AccountType.SAVINGS);
        BankAccountAbs ac3 = new BankAccountAbsImpl("ayush", "HDFC123",98665133L,AccountType.SAVINGS){
            @Override
            void deposit(long... amount) {//TODO

            }

            @Override
            void withdraw(long amount) {//TODO

            }
        };

        //interfaces
        BankInterface bankInterface = new BankInterFaceImpl("ayush",10000,"HDFC98",5064331L,AccountType.SAVINGS);

        BankInterface ac4 = new BankInterface() {
            @Override
            public void deposit(long... amount) {
                System.out.println("depositing :" + Arrays.toString(amount));
            }

            @Override
            public void withdraw(long amount) {
                System.out.println("withdrawing :" + amount);
            }
        };
        ac4.withdraw(1000);
        ac4.deposit(500, 2000);


    }
}
