package com.kenzie.practicingifstatements;

public class Application {
    //Complete the Following Exercises.
    public static void exerciseOne(int number) {
        // Is it larger than 10?
        // - Create an if statement that checks if number is greater than 10.
        // - If it is, then log "It is bigger than 10!" using System.out.println().
        // - Your code should output the message to the console.
        // Write your code here

    }

    public static void exerciseTwo(String color) {
        // Determining a color
        // 1 - Create an if statement, if color is "blue", then log "The sky is blue." using System.out.println
        // 2 - Create an else if statement, and if color is "red" then log "The flower is red."
        // 3 - Create another else if statement where if the color is "green" then log "The leaf is green."
        // 4 - Finally, create an else statement and log "It is a different color."
        // (NOTE: DO NOT use a switch statement. Use a series of if/else if/ else statements)
        // Write your code here

    }

    public static void exerciseThree(int value) {
        //  Create an if statement that determines if variable 'value' has an even or odd number.
        //   Hint: The Numbers Reading explains how to do this.  Go back and read it, look for the
        //   "Remainder" operator.
        // - If value is even, then print "The number is even."
        //   otherwise print "The number is odd."
        //  Write your code here

    }

    public static void exerciseFour(int number) {
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
        System.out.println("---Exercise One---");
        // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Be sure that your code has the expected output for all numbers below
        int number = 36;
        //
        System.out.println("The message below should say 'It is bigger than 10!'");
        exerciseOne(number);

        int number2 = 5;
        //
        System.out.println("This case should not print anything else.");
        exerciseOne(number2);

        int number3 = 10;
        //
        System.out.println("This case should not print anything else.");
        exerciseOne(number3);

        int number4 = 11;
        //
        System.out.println("The message below should say 'It is bigger than 10!'");
        exerciseOne(number4);


        // ----------------------------------------------------------------------------------------------
        System.out.println("---Exercise Two---");
        // Test your code! Be sure that for each color, your code only prints the correct response
        // The correct message should log to the console.

        String color = new String("red");
        //
        System.out.println("The message below should be about red");
        exerciseTwo(color);

        String color2 = new String("blue");
        //
        System.out.println("The message below should be about blue");
        exerciseTwo(color2);

        String color3 = new String("green");
        //
        System.out.println("The message below should be about green");
        exerciseTwo(color3);


        String color4 = new String("pink");
        //
        System.out.println("The message below should be about a different color");
        exerciseTwo(color4);

        String color5 = new String("purple");
        //
        System.out.println("The message below should be about a different color");
        exerciseTwo(color5);


        // ----------------------------------------------------------------------------------------------
        System.out.println("---Exercise Three---");
        // As the number assigned to value changes to different odd and even numbers,
        // make sure your code displays the correct response.
        int value = 4;
        //
        System.out.println("The message below should be about evens");
        exerciseThree(value);

        int value2 = 47;
        //
        System.out.println("The message below should be about odds");
        exerciseThree(value2);


        // ----------------------------------------------------------------------------------------------
        System.out.println("---Exercise Four---");
        // Try changing your variable to other numbers!
        int num = 4;
        //
        System.out.println("Testing 4 below");
        exerciseFour(num);

        int num2 = 13;
        //
        System.out.println("Testing 13 below");
        exerciseFour(num2);

        int num3 = 16;
        //
        System.out.println("Testing 16 below");
        exerciseFour(num3);

        int num4 = 20;
        //
        System.out.println("Testing 20 below");
        exerciseFour(num4);

        int num5 = 30;
        //
        System.out.println("Testing 30 below");
        exerciseFour(num5);


        // When you are done with all of the exercises, check your console output to make sure it
        // matches the expected output of each exercise and remove any extraneous System.out.println()
        // statements from your code.

    }
}
