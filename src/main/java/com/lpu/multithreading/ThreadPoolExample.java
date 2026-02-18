package com.lpu.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(3);//Executors is a class\

        try(ExecutorService executor = Executors.newFixedThreadPool(3)) {


        for (int i = 0; i <= 100; i++) {
            int taskId = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskId + " is running on thread " + threadName);
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        //shut down the pool when finished submitting tasks
//        executor.shutdown();
//functional interface is an interface with only one abstract method and can have multiple default and static methods

    }
}
}