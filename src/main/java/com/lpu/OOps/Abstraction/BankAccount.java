package com.lpu.OOps.Abstraction;

import java.util.logging.Logger;

public class BankAccount {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());

    // MAIN constructor
    public BankAccount(String name, long balance, String ifscCode,
                       long accountNumber, AccountType accountType) {

        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;   // minimum balance
    }

    void deposit(long... amount) {
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("Invalid deposit amount");
            } else {
                balance += amt;
                logger.info("Deposited: " + amt);
            }
        }
        logger.info("New balance is " + balance);
    }

    void withdraw(long amount) {
        if (amount <= 0) {
            logger.warning("Invalid withdrawal amount");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            logger.info("Withdrawn: " + amount);
        } else {
            logger.warning("Insufficient balance");
        }

        logger.info("New balance is " + balance);
    }

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
