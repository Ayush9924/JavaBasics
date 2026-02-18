package com.lpu.multithreading;

public class work implements Runnable{
    public void run(){
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(500);
                System.out.println("HEllO "+ i + " from " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello"+i);

        }
    }
}
