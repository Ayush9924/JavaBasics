package com.lpu.OOps.Inheritance.playeer;

public class Main {
    public static void main(String[] args) {
        Football ronaldo = new Football(
                "Ronaldo",
                38,
                20,
                1100,
                850,
                7,
                true
        );

        System.out.println("Name: " + ronaldo.name);
        System.out.println("Age: " + ronaldo.age);
        System.out.println("Experience: " + ronaldo.experience + " years");
        System.out.println("Matches Played: " + ronaldo.matchPlayer);
        System.out.println("Goals: " + ronaldo.goal);
        System.out.println("Jersey Number: " + ronaldo.jerseyNum);
        System.out.println("Is Captain: " + ronaldo.isCaptain);
    }
}
