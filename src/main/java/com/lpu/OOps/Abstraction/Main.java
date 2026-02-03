package com.lpu.OOps.Abstraction;

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



    }
}
