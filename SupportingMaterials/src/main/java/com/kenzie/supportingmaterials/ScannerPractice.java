package com.kenzie.supportingmaterials;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Enter your name");

        // Read what the user types
        String name = scanner.nextLine();

        // Print out what the user typed in
        System.out.println("Hello " + name + "! It's nice to meet you.");
        // Ask the user for their age
        System.out.println("How old are you?");
        //Read what the user types
        int age = scanner.nextInt();

        System.out.println("Oh! " + age + (" is a wonderful age!"));
    }
}
