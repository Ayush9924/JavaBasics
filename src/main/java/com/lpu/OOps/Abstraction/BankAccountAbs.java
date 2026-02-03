package com.lpu.OOps.Abstraction;

import java.util.logging.Logger;

public abstract class BankAccountAbs {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());

    // MAIN constructor
    public BankAccountAbs(String name, String ifscCode,
                       long accountNumber, AccountType accountType) {

        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 1000L;   // minimum balance
    }

    abstract void deposit(long... amount);

    abstract void withdraw(long amount);

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}
