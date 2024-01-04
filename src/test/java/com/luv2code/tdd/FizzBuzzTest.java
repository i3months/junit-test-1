package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // fizz -> divide by 3
    // buzz -> divide by 5
    // fizzbuzz -> both
    // else

    @Test
    @DisplayName("Divisible by Three")
    @Order(1)
    void testForDivisibleByThree() {
        String expected = "Fizz";

        assertEquals(expected, Fizzbuzz.compute(3), "Fizz");
    }

    @Test
    @DisplayName("Divisible by Five")
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";
        assertEquals(expected, Fizzbuzz.compute(5), "Buzz");
    }

    @Test
    @DisplayName("Divisible by Three, Five")
    @Order(3)
    void testForDivisionByThreeAndFive() {
        String expected = "FizzBuzz";
        assertEquals(expected, Fizzbuzz.compute(15), "FizzBuzz");
    }

    @DisplayName("Test with csv")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(4)
    void testCSV(int value, String expected) {
        assertEquals(expected, Fizzbuzz.compute(value));
    }
    // loop behind junit

}
