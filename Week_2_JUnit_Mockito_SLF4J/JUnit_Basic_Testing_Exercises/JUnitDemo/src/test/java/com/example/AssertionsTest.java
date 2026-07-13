package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void passingTest() {
        int a = 10;
        int b = 5;

        assertEquals(15, a + b);
        assertTrue(a > b);
        assertFalse(a < b);
        assertNotEquals(20, a + b);
    }
}