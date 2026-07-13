package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
}