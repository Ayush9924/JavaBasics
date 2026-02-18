package com.lpu.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");

        System.out.println(Thread.currentThread());//currentThread is the static function in thread class

//        for (int i = 0; i<10; i++){
//            Thread.sleep(500);
//            System.out.println("hello"+i);
//
//        }
        worker t1 = new worker();
        t1.setName("t1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

//        t1.run();
        worker t2 = new worker();
        t2.setName("t2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
//        t1.run();
        System.out.println("END");

        Thread t3 = new Thread(new work());
        t3.setName("t3");
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();

        Thread t4 = new Thread(new work());
        t4.setName("t4");
        t4.setPriority(2);
        t4.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("hello" + i);
        }
    }
}
//[#5,main,5,main] t1.run();
//[#40,thread-0,5,main]
