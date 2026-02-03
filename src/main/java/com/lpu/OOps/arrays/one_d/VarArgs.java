package com.lpu.OOps.arrays.one_d;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {// string array
//        public static void main(String ... ayu) //we passes this as arrgument the its also print as array
        new VarArgs().callMe("hey",3,7,4,5,6);//if we dont know how many int we will pass the we use Varargs
    }
    private void callMe(String str,int ... x){
        System.out.println(x.length);
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}
