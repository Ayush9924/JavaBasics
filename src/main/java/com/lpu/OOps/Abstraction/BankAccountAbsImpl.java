package com.lpu.OOps.Abstraction;

public class BankAccountAbsImpl extends BankAccountAbs{

    public BankAccountAbsImpl(String name, String ifscCode, long accountNumber, AccountType accountType) {
        super(name, ifscCode, accountNumber, accountType);
    }

    @Override
    void deposit(long... amount) {
        for (long amt : amount ){
            if (amt <= 0){
                logger.warning("invalid amounts");
            }else
                balance += amt;
        }
        logger.info("new balance is " + balance);

    }

    @Override
    void withdraw(long amount) {
        if (amount > 0){
            if(balance >= amount){
                balance -= amount;
            }
        }else {
            logger.warning("invalid amount");
        }
    }
}
