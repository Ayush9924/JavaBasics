package com.lpu.multithreading;

public class worker extends Thread{
    public void run(){


        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(500);
                System.out.println("hello " + i + " from " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

