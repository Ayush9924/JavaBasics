package com.lpu.multithreading;

public class RaceConditon {
    int counter = 0;

    synchronized public void incrementCounter() {

        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditon raceConditon = new RaceConditon();

        Thread thread1 = new Thread(() -> raceConditon.incrementCounter());
        Thread thread2 = new Thread(() -> raceConditon.incrementCounter());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + raceConditon.counter);
//        System.out.println("Counter vlaue: " + raceConditon.counter);
    }
}


