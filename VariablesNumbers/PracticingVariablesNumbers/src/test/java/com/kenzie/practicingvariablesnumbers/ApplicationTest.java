package com.kenzie.practicingvariablesnumbers;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
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
    public void test_exerciseOne() {
        Application.exerciseOne();
        assertThat("You are not printing \"16\" in your print", outContent.toString(), containsString("16"));
    }

    @Test
    public void test_exerciseTwo() {
        Application.exerciseTwo();
        assertThat("You are not printing the result of 6 divided by 3 in your print statement", outContent.toString(), containsString("2"));
    }

    @Test
    public void test_exerciseThree() {
        Application.exerciseThree();
        assertThat("You did not add the parentheses in the correct place", outContent.toString(), containsString("16"));
    }

    @Test
    public void test_exerciseFour() {
        Application.exerciseFour();
        assertThat("You are not printing the variable myNumber in your print", outContent.toString(), containsString("6"));
    }

    @Test
    public void test_exerciseFive() {
        Application.exerciseFive();
        assertThat("You are not printing the variable otherNumber in your print", outContent.toString(), containsString("4.25"));
    }

    @Test
    public void test_exerciseSix() {
        Application.exerciseSix();
        assertThat("You are not printing myNumber multiplied by otherNumber in your print", outContent.toString(), containsString("25.5"));
    }

    @Test
    public void test_exerciseSeven() {
        Application.exerciseSeven();
        assertThat("You are not printing the difference of a minus b in your print", outContent.toString(), containsString("-3"));
    }

    @Test
    public void exerciseEight_NumberOfPets() {
        Application.exerciseEight_NumberOfPets();
        assertThat("You are not printing a valid number in your print statement", stringContainsValidPositiveInteger(outContent.toString()), equalTo(true));
    }

    @Test
    public void exerciseEight_NumberOfPairsOfSunglasses() {
        Application.exerciseEight_NumberOfPairsOfSunglasses();
        assertThat("You are not printing a valid number in your print statement", stringContainsValidPositiveInteger(outContent.toString()), equalTo(true));
    }

    @Test
    public void exerciseEight_RatingOfLastMeal() {
        Application.exerciseEight_RatingOfLastMeal();
        assertThat("You are not printing a valid number in your print statement", stringContainsValidPositiveInteger(outContent.toString()), equalTo(true));
    }

    @Test
    public void exerciseEight_HowManyDaysSinceLastGroceryTrip() {
        Application.exerciseEight_HowManyDaysSinceLastGroceryTrip();
        assertThat("You are not printing a valid number in your print statement", stringContainsValidPositiveInteger(outContent.toString()), equalTo(true));
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

    private static boolean stringContainsValidPositiveInteger(String stringToCheck) {
        try {
            if (stringToCheck != null && !stringToCheck.isEmpty()) {
                char[] chars = stringToCheck.toCharArray();
                for (char c : chars) {
                    if (Character.isDigit(c)) {
                        return true;
                    }
                }
            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
