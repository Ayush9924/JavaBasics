package com.lpu.basics;

public class primitiveDataTypes {
    public static void main(String[] args) {
        //int
        byte a = 24;
        short b = 55;
        int c = 888;
        long d = 546269;
        long phonenumber = 8252782508L;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(d);
        System.out.println(phonenumber);

        boolean isJava = false;
        isJava = true;
        char rupee = '$';
        int dollor = rupee;
        System.out.println(dollor);

        int x = 659556;
        char xChar = (char)x;
        System.out.println(xChar);

        float valueOfPi = 3.145223F;
        System.out.println(valueOfPi);

        b = a;
        a = (byte)b;
        System.out.println(b);

        phonenumber = 8252782508L;
        float phoneFloat = phonenumber;
        System.out.println(phoneFloat);



    }

}
