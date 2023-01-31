package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;

public class ReadingPracticeTest {
    @Test
    public void fixConditional() {
        int number = 3;

        // Practice #1:
        // Fix the conditional operator so the print statement prints "false"
        System.out.println("Is number equal to 4?");
        System.out.println(number = 4);
    }

    @Test
    public void operators() {

        int a = 6;
        int b = 3;
        int c = 5;

        // Practice #1:
        // Can you modify the code so that the `if` condition will return true if `a` is *NOT* greater than `b`?
        System.out.println("Practice 1");
        if (a < b) {
            System.out.println("a is less than b");
            System.out.println(a+b);
        }
        else {
            System.out.println("a is not less than b");
            System.out.println(b+c);
        }

        // Practice #2:
        // Modify the code so it will display 'Not company' if numPeople is equal to anything besides 2
        System.out.println("Practice 2");
        int numPeople = 3;

        if (numPeople == 3) {
            System.out.println("Not company");
        }
        else {
            System.out.println("Two is company");
        }
    }

    @Test
    public void stringDisplay() {
        // Determining a color
        // 1 - Create a variable dayOfWeek and set it to a starting value of "Monday".
        // 2. Create an if statement to check the value of the variable dayOfWeek. If the variable is equal to "Monday", print out "I don't like Mondays"
        // 3. Create an else if statement. If the dayOfWeek is "Tuesday" or dayOfWeek is "Wednesday", print out "Tuesday's gray and Wednesday too"
        // 4. Create an else statement to catch all other days
        // and log "It's a new day"

        // 5. Run the code by manually changing the value of dayOfWeek to each of the options and then clicking "Run"

        // Write your code here
        System.out.println("I don't like Mondays");
    }

    @Test
    public void changeVariable() {
        // Alter the line on 69 to update your pets name
        String petName = "";
        System.out.println("My pet's name is " + petName);
    }

    @Test
    public void chooseDeclaration() {
        String favoriteSaladDressing = null;

        // Uncomment one correct line to update the variable to "ranch dressing"
        // favoriteSaladDressing = ranch dressing;
        // favoriteSaladDressing = 'ranch dressing';
        // favoriteSaladDressing = "ranch dressing";
        // favoriteSaladDressing = ranchDressing

        System.out.println(favoriteSaladDressing);
    }
}
