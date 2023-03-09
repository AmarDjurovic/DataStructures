package org.test_example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.MaxInteger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxIntegerTest {
    static int[] numbers;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        numbers = MaxInteger.readNumbers("/Users/Korisnik/Desktop/numbers.txt");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        numbers = null;
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testFindsCorrectMaximum() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertEquals(800, maxNumber);
    }

    @Test
    void testDoesNotFindIncorrectMaximum() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertNotEquals(42, maxNumber);
    }

}
