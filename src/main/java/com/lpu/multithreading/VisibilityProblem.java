package com.lpu.multithreading;
//volatile keyword is used to make sure taht value of the variable is always read from the main memory and not from the thread local cache

public class VisibilityProblem {//it will make you change the any of the term volatile

    //if you mark a variable as volatile it means that any thread that reads the variable will see the most recent value written to it by any other thread
    //this is beacuse the volatile keywoprd ensures that all threads see the same value of the variable  and that any changes made to the variable by onr thread are immediatly visible to all other threads.

    volatile static boolean flag = true;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while(flag){
                System.out.println("Stop me if you can");
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            flag = false;
        });
        t2.start();
    }
}
//TODO synchronize block learn about it
