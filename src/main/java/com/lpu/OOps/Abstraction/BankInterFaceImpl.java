package com.lpu.OOps.Abstraction;

public class BankInterFaceImpl extends OfflineBank implements BankInterface, RBI{


        String name;
        long balance;
        long accountNumber;
        String ifscCode;
        AccountType accountType;

    // MAIN constructor
    public BankInterFaceImpl(String name, long balance, String ifscCode,
                          long accountNumber, AccountType accountType) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;  // minimum balance
    }


    @Override
    public void deposit(long... amount) {
        for (long amt : amount ){
            if (amt <= 0){
                logger.warning("invalid amounts");
            }else
                balance += amt;
        }
        logger.info("new balance is " + balance);

    }

    @Override
    public void withdraw(long amount) {//In Java, the access modifier for an abstract function (method) in an interface is implicitly public.
        if (amount > 0){
            if(balance >= amount){
                balance -= amount;
            }
        }else {
            logger.warning("invalid amount");
        }
        logger.info("new Balance is "+balance);
    }

    @Override
    public boolean isLicensed() {
        return false;
    }
}

//class can have multiple interfaces
