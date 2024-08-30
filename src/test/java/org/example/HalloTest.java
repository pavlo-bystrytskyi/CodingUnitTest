package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalloTest {

    @Test
    void checkString() {
        String[] given = {"Hello mark",  "cisao", "sAlut Joe", "haaaallo"};
        boolean[] expected = {true,  false, true, false};
        for (int i = 0; i < given.length; i++) {
            assertEquals(expected[i],Hallo.checkString(given[i]));
        }
    }
}