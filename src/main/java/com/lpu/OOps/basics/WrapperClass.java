package com.lpu.OOps.basics;

public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper class
        int x = 10;
        Integer x_ = new Integer(x);//object
        System.out.println(x_);

        Boolean bool_ = new Boolean(false);
        System.out.println(bool_);

        Boolean bool2 = false;
        System.out.println(bool2);

        int y = 100;
        Integer y_ = y;//object ( autoboxing when we put primitive in objects )
        System.out.println(y);
        //this whole process is call autoboxing

        int z = y_;//autounboxing when we keep primitive in object

    }
}
