package com.lpu.Test;

abstract class Payment {
    abstract void pay(int amount);
}

class CreditCardPay extends Payment {

    @Override
    void pay(int amount) {
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Amount Paid: " + amount);
    }
}

class UPIPayment extends Payment {

    @Override
    void pay(int amount) {
        System.out.println("Payment tho: UPI");
        System.out.println("Paid: " + amount);
    }
}

public class question1 {

    public static void main(String[] args) {
        Payment p1 = new CreditCardPay();
        p1.pay(1700);
        Payment p2 = new UPIPayment();
        p2.pay(696);
    }
}
