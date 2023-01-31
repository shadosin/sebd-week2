package com.kenzie.practicingifstatements;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_ExerciseOne_GreaterThanTen() {
        Application.exerciseOne(11);
        assertThat("Make sure your if statement is correct", outContent.toString(), containsString("It is bigger than 10!"));
    }

    @Test
    public void test_ExerciseOne_LessThanTen() {
        Application.exerciseOne(7);
        assertThat("Make sure your if statement is correct", outContent.toString(), not(containsString("It is less than 10!")));
    }

    @Test
    public void test_ExerciseOne_GreaterThanOneHundred() {
        Application.exerciseOne(110);
        assertThat("Make sure your if statement is correct", outContent.toString(), containsString("It is bigger than 10!"));
    }

    @Test
    public void test_ExerciseTwo_Blue() {
        Application.exerciseTwo(new String("blue"));
        assertThat("Check that the color is blue using .equals() and print out the correct message (including punctuation)", outContent.toString(), containsString("The sky is blue."));
    }

    @Test
    public void test_ExerciseTwo_Red() {
        Application.exerciseTwo(new String("red"));
        assertThat("Check that the color is red using .equals() and print out the correct message (including punctuation)", outContent.toString(), containsString("The flower is red."));
    }

    @Test
    public void test_ExerciseTwo_Green() {
        Application.exerciseTwo(new String("green"));
        assertThat("Check that the color is green using .equals() and print out the correct message (including punctuation)", outContent.toString(), containsString("The leaf is green."));
    }

    @Test
    public void test_ExerciseTwo_Other() {
        Application.exerciseTwo(new String("black"));
        assertThat("Make sure you have the base case covered when its not blue, red, or green", outContent.toString(), containsString("It is a different color."));
    }

    @Test
    public void test_ExerciseThree_Even() {
        Application.exerciseThree(2);
        assertThat("Make sure your if statement is correct for evens and odds", outContent.toString(), containsString("The number is even."));
        assertThat("Your output contains the number is odd", outContent.toString(), not(containsString("The number is odd.")));

    }

    @Test
    public void test_ExerciseThree_Odd() {
        Application.exerciseThree(3);
        assertThat("Make sure your if statement is correct for evens and odds", outContent.toString(), containsString("The number is odd."));
        assertThat("Your output contains the number is even", outContent.toString(), not(containsString("The number is even.")));
    }

    @Test
    public void test_ExerciseFour_16() {
        Application.exerciseFour(16);
        assertThat("Make sure your if statement is correct for 16", outContent.toString(), containsString("16!"));
    }

    @Test
    public void test_ExerciseFour_LessThan10() {
        Application.exerciseFour(9);
        assertThat("Make sure your if statement is correct for less than 10", outContent.toString(), containsString("10 or less!"));
    }

    @Test
    public void test_ExerciseFour_10() {
        Application.exerciseFour(10);
        assertThat("Make sure your if statement is correct for 10", outContent.toString(), containsString("10 or less!"));
    }

    @Test
    public void test_ExerciseFour_GreaterThan20() {
        Application.exerciseFour(21);
        assertThat("Make sure your if statement is correct for greater than 20", outContent.toString(), containsString("20 or greater!"));
    }

    @Test
    public void test_ExerciseFour_20() {
        Application.exerciseFour(20);
        assertThat("Make sure your if statement is correct for 20", outContent.toString(), containsString("20 or greater!"));
    }

    @Test
    public void test_ExerciseFour_Between10and20() {
        Application.exerciseFour(15);
        assertThat("Make sure your if statement is correct for between 10 and 20", outContent.toString(), containsString("Between 10 and 20!"));
    }

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Application.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "App can run without crashing");
    }
}
