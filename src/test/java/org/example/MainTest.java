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
    }

    @org.junit.jupiter.api.Test
    void product() {
    }

    @org.junit.jupiter.api.Test
    void upperCase() {
    }

    @org.junit.jupiter.api.Test
    void numberIsPositive() {
    }
}