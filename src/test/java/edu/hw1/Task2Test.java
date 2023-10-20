package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    @DisplayName("Тест 1")
    void countDigitsTest() {
        int counter = Task2.countDigits(123456789);
        Assertions.assertEquals(9, counter);
    }

    @Test
    @DisplayName("Отрицательное число")
    void countDigitsTest_negativeNumber() {
        int counter = Task2.countDigits(-50);
        Assertions.assertEquals(2, counter);
    }

    @Test
    @DisplayName("Ноль")
    void countDigitsTest_zero() {
        int counter = Task2.countDigits(0);
        Assertions.assertEquals(1, counter);
    }
}
