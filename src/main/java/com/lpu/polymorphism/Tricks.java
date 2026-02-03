package com.lpu.polymorphism;

public class Tricks {
    public static void main(String[] args) {
        Fruit Manngo = new Fruit("Mango", 20);

    }
}
class Fruit{
    String fruitName;
    int price;//ctr d to make duplicate
    String FruitName;

    public Fruit(String fruitName, int price) {
        this.price = price;
        this.fruitName = fruitName;
    }
}
//once if all the char are of 1 byte its strings "ayush"
//if we take it as "ayush$" then its uses 2 byte for every char ;
