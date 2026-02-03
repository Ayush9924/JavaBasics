package com.lpu.questions;

public class polymorphism {
    int area(int side){
        return side*side;
    }
    int area(int l, int b){
        return l * b;
    }
    int area(int l, int b, int h){
        return l*b*h;
    }

}
