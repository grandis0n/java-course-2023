package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task3Test {
    @Test
    void isNestableTest1() {
        Assertions.assertTrue(task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6}));
    }

    @Test
    void isNestableTest2() {
        Assertions.assertTrue(task3.isNestable(new int[] {3, 1}, new int[] {4, 0}));
    }

    @Test
    void isNestableTest3() {
        Assertions.assertFalse(task3.isNestable(new int[] {9, 9, 8}, new int[] {8, 9}));
    }

    @Test
    void isNestableTest4() {
        Assertions.assertFalse(task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3}));
    }
}
