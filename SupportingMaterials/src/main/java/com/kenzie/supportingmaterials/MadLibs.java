package com.kenzie.supportingmaterials;

public class MadLibs {
    public static void madLibs(String[] args) {
        System.out.println("Welcome to Mad Libs!");

        // Don't worry about args[number] right now...
        String place = args[0];
        String food = args[1];
        String animal = args[2];

        String sentence = "I was once a " + animal + " but through my journey to " + place + " and my consumption of " + food + " I became human again!";
        // TODO - Write a statement to tell a MadLibs story with the variables above
        System.out.println(sentence);
    }
}
