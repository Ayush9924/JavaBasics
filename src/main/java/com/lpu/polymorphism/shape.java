package com.lpu.polymorphism;

public class shape {
    int squ(int side){
        return side * side;
    }
    int rec(int l, int b){
        return l*b;
    }
    float triangle(int height, float base){
        return 0.5f * height *base;
    }
    double circle(float radius){
        //return 3.14159f * radius * radius;
        return Math.PI * radius * radius;
    }
    float parallelogram(float base, int height){
        return base * height;
    }
}
