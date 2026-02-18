package com.lpu.multithreading;

public class ThreadJoin {
    public static void main(String... args) throws InterruptedException {
        System.out.println("START");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Hello " + i + " from " + Thread.currentThread());
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        System.out.println(t1.getState());

        t1.start();
        Thread.sleep(2000);
//        System.out.println(t1.getState());
//        worker t2 = new worker();
//        System.out.println(t1.getState());
        //t2.start();

        //t2.join();

        System.out.println(t1.getState());
//        t1.join();
        System.out.println(t1.getState());
        Thread.sleep(2000);
        System.out.println("END "+ Thread.currentThread());
    }
}
