package com.lpu.exceptions;

public class ExceptionHandlingWIthThrows {

    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.callA();

        System.out.println("END");
}
private void callA() throws InterruptedException {
    System.out.println("callA");
    callB();
}
private void callB() throws InterruptedException {
    System.out.println("CallB");
    callC();
}
private void callC() throws InterruptedException {
    System.out.println("callC");
    Thread.sleep(500);
    System.out.println("END");
}

    }
