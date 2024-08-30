package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void sum() {
        int[][] numbers = {{0, 1}, {100, -5}, {5, 5}};
        int[] expectedResults = {1, 95, 10};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(
                    Main.sum(numbers[i][0], numbers[i][1]),
                    expectedResults[i]
            );
        }
    }

    @org.junit.jupiter.api.Test
    void isEven() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean[] expectedResults = {false, true, false, true, false};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(
                    Main.isEven(numbers[i]),
                    expectedResults[i]
            );
        }
    }

    @org.junit.jupiter.api.Test
    void product() {
        int[][] numbers = {{0, 1}, {100, -5}, {5, 5}};
        int[] expectedResults = {0, -500, 25};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(
                    Main.product(numbers[i][0], numbers[i][1]),
                    expectedResults[i]
            );
        }
    }

    @org.junit.jupiter.api.Test
    void upperCase() {
        String[] strings = {"Some string", "abc", "QWERTZ"};
        String[] expectedResults = {"SOME STRING", "ABC", "QWERTZ"};
        for (int i = 0; i < strings.length; i++) {
            assertEquals(
                    Main.upperCase(strings[i]),
                    expectedResults[i]
            );
        }
    }

    @org.junit.jupiter.api.Test
    void isPositive() {
        int[] numbers = {1, -2, 0, -1, 5};
        boolean[] expectedResults = {true, false, true, false, true};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(
                    Main.isPositive(numbers[i]),
                    expectedResults[i]
            );
        }
    }
}