package com.lpu.OOps.Inheritance.playeer;

public class Football extends Player {

    int goal;
    int jerseyNum;
    boolean isCaptain;

    public Football(String name, int age, int experience, int matchPlayer, int goal, int jerseyNum, boolean isCaptain) {

        super(name, age, experience, matchPlayer); // MUST be first line
//        super() is used to call the parent class constructor to initialize inherited variables.
        this.goal = goal;
        this.jerseyNum = jerseyNum;
        this.isCaptain = isCaptain;
    }
}
