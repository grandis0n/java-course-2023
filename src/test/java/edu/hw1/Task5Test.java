package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    @DisplayName("Тест 1")
    void Test1() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(11211230));
    }

    @Test
    @DisplayName("Тест 2")
    void Test2() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(13001120));
    }

    @Test
    @DisplayName("Тест 3")
    void Test3() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(23336014));
    }

    @Test
    @DisplayName("Тест 4")
    void Test4() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(11));
    }

    @Test
    @DisplayName("Проверка цифры")
    void Test5() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(5));
    }

    @Test
    @DisplayName("Проверка нуля")
    void Test6() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(0));
    }

    @Test
    @DisplayName("Не палиндром")
    void Test7() {
        Assertions.assertFalse(Task5.isPalindromeDescendant(359));
    }

    @Test
    @DisplayName("Палиндром потомок")
    void Test8() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(123));
    }

    @Test
    @DisplayName("Палиндром нечетной длины")
    void Test9() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(20002));
    }

    @Test
    @DisplayName("Потомок четной длины - палиндром")
    void Test10() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(5766));
    }

    @Test
    @DisplayName("Потомок нечетной длины - палиндром")
    void Test11() {
        Assertions.assertTrue(Task5.isPalindromeDescendant(23625));
    }

}
