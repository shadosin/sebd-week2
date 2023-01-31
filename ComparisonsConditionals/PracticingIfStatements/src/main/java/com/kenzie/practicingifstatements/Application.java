package com.kenzie.practicingifstatements;

public class Application {
    //Complete the Following Exercises.
    public static void Exercise_One(int number){
        // Is it larger than 10?
        // - Create an if statement that checks if number is greater than 10.
        // - If it is, then log "It is bigger than 10!" using System.out.println().
        // - Your code should output the message to the console.
        // Write your code here

    }

    public static void Exercise_Two(String color){
        // Determining a color
        // 1 - Create an if statement, if color is "blue", then log "The sky is blue." using System.out.println
        // 2 - Create an else if statement, and if color is "red" then log "The flower is red."
        // 3 - Create another else if statement where if the color is "green" then log "The leaf is green."
        // 4 - Finally, create an else statement and log "It is a different color."
        //
        // Write your code here

    }

    public static void Exercise_Three(int value){
        //  Create an if statement that determines if variable 'value' has an even or odd number.
        //   Hint: The Numbers Reading explains how to do this.  Go back and read it, look for the
        //   "Remainder" operator.
        // - If value is even, then print "The number is even."
        //   otherwise print "The number is odd."
        //  Write your code here

    }

    public static void Exercise_Four(int number){
        //    Create conditional statements to create the following results with the number.
        //     If the number is greater than 10, and the number is less than 20, then print "Between 10 and 20!"
        //     If the number is greater than or equal to 20, then print "20 or greater!"
        //     If the number is exactly 16, then print "16!"
        //     If the number is less than or equal to 10, print "10 or less!";
        //     Make sure that each of the four cases output the correct message to the console.
        // Hint:
        //     You may need to rearrange your conditions to make this easy!
        //     A good practice is to take the most restrictive condition and check it first (like 16),
        //     then work your way to the most broad condition ("Some other number").
        // Hint Two:
        //     You can either do this with nested if statements, or you can do it with
        //     a chain of if else statements, some of those just might need multiple conditions
        //     (like: if (a && b) )
        //
        // Your code here:

    }

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One");
        // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Change the number variable to something larger than 10, run your code and make sure it works.
        int number = 5;
        //
        //
        Exercise_One(number);


        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");
        // Test your code! Change the value of the color variable to different colors and run your code.
        // Pick either "blue", "red", or "green" and assign it to the color variable.
        // The correct message should log to the console.
        String color = "";
        //
        //
        Exercise_Two(color);


        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        // - Change the number assigned to value to different odd and even numbers to make sure your
        //   code works.
        int value = 4;
        //
        //
        Exercise_Three(value);


        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // Try changing your variable to other numbers!  For example: 3, 13, 16, 20
        int num = 4;
        //
        //
        Exercise_Four(num);


        // When you are done with all of the exercises, check your console output to make sure it
        // matches the expected output of each exercise and remove any extraneous System.out.println()
        // statements from your code.

    }
}
