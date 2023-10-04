package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task2Test {
    @Test
    void countDigitsTest() {
        int counter = task2.countDigits(123456789);
        Assertions.assertEquals(9, counter);
    }

    @Test
    void countDigitsTest_negativeNumber() {
        int counter = task2.countDigits(-50);
        Assertions.assertEquals(2, counter);
    }

    @Test
    void countDigitsTest_zero() {
        int counter = task2.countDigits(0);
        Assertions.assertEquals(1, counter);
    }
}
