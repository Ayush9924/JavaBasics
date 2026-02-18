package com.lpu.multithreading;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Double> heavyTask = ()->{//Callable is a functional interface with only one abstract method call() and can throw checked exceptions
            double sum = 0;
            for (int i = 0; i < 10_000_000; i++) {
                sum += Math.sqrt(i);
            }
            Thread.sleep(1000);
            return sum;
        };

        Future<Double> future = executor.submit(heavyTask);
        System.out.println("Main thread : I'm not blocked i can print this immediately.");

        Double total = future.get();

        System.out.println("Computational complete! Total sum: "+total);

        executor.shutdown();;
        System.out.println("END");

    }
}

//get put post explain
//
//GET: Used to fetch/read data from a server.
//
//        POST: Used to send/create new data on a server.
//
//PUT: Used to update/replace existing data on a server.