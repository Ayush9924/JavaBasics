package com.lpu.OOps.encapsulation;

public class Car {
//    final private String name = "TOYOTA HILUX";
    final private String name;
    private String noPlate;
    private float mielage;

    public Car(String name, String noPlate){
        this.name = name;
        this.noPlate = noPlate;
        this.mielage = mielage;
    }


    public String getName(){
        return name;
    }
    public String getNoPlate(){
        return noPlate;
    }
    public float getMielage(){
        return mielage;
    }
    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }
    public void setMielage(float mielage){
        this.mielage = mielage;
    }
}
