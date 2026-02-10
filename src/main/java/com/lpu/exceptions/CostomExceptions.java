package com.lpu.exceptions;

public class CostomExceptions {
    public static void main(String[] args){
        ExceptionPropagation ep = new ExceptionPropagation();

        try{

        ep.callA();
        } catch (Exception e){
            e.printStackTrace();
        }
//        catch (Throwable t){ // we should not include a catch with throable as it catches errors as well
//            t.printStackTrace();
//        }

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


