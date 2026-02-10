package com.lpu.OOps.Abstraction;

import java.util.logging.Logger;

public interface BankInterface {

    //whatever you declare as variable they are public static final by default
    public static final Logger logger = Logger.getLogger(BankAccount.class.getName());

//    public BankInterface(){}

    //only abstract functions are allowed
    void deposit(long... amount);//abstract method // by deafault all the functions are abstract

    abstract void withdraw(long amount);//abstract method



}
