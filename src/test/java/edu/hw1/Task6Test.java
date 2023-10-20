package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    @DisplayName("Тест числа 6174")
    void test0() {
        Assertions.assertEquals(0, Task6.countK(6174));
    }

    @Test
    @DisplayName("Тест 1")
    void test1() {
        Assertions.assertEquals(3, Task6.countK(3524));
    }

    @Test
    @DisplayName("Тест 2")
    void test2() {
        Assertions.assertEquals(5, Task6.countK(6621));
    }

    @Test
    @DisplayName("Тест 3")
    void test3() {
        Assertions.assertEquals(4, Task6.countK(6554));
    }

    @Test
    @DisplayName("Тест 4")
    void test4() {
        Assertions.assertEquals(3, Task6.countK(1234));
    }
}
