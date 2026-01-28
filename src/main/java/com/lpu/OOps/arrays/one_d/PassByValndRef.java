package com.lpu.OOps.arrays.one_d;

public class PassByValndRef {
    public static void main(String[] args) {
        int[] arr = {23,345,45,54,45,60};//array object
        int n=20;
        Integer n_ = new Integer(200);
        new PassByValndRef().foo(n_, arr);
        System.out.println(n_);
        System.out.println(arr[0]);
    }
    void foo(int n,int[] arr){
        Integer n_ = 100;
        arr[0] = -1;
    }
}
