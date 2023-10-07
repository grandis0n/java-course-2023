package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    @DisplayName("Тест 1")
    void isNestableTest1() {
        Assertions.assertTrue(Task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6}));
    }

    @Test
    @DisplayName("Тест 2")
    void isNestableTest2() {
        Assertions.assertTrue(Task3.isNestable(new int[] {3, 1}, new int[] {4, 0}));
    }

    @Test
    @DisplayName("Тест 3")
    void isNestableTest3() {
        Assertions.assertFalse(Task3.isNestable(new int[] {9, 9, 8}, new int[] {8, 9}));
    }

    @Test
    @DisplayName("Тест 4")
    void isNestableTest4() {
        Assertions.assertFalse(Task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3}));
    }
}
