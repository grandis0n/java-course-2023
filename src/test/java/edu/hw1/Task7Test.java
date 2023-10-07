package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    @DisplayName("Тест 1 - свдиг вправо")
    void Test1() {
        Assertions.assertEquals(4, Task7.rotateRight(8, 1));
    }

    @Test
    @DisplayName("Тест 2 - свдиг влево")
    void Test2() {
        Assertions.assertEquals(1, Task7.rotateLeft(16, 1));
    }

    @Test
    @DisplayName("Тест 3 - свдиг влево")
    void Test3() {
        Assertions.assertEquals(6, Task7.rotateLeft(17, 2));
    }

    @Test
    @DisplayName("Тест 4 - свдиг вправо")
    void Test4() {
        Assertions.assertEquals(1, Task7.rotateRight(8, 3));
    }

    @Test
    @DisplayName("Вправо (сдвиг больше чем длина числа)")
    void Test5() {
        Assertions.assertEquals(1, Task7.rotateRight(4, 8));
    }

    @Test
    @DisplayName("Вправо (сдвиг больше чем длина числа)")
    void Test6() {
        Assertions.assertEquals(128, Task7.rotateRight(256, 100));
    }

    @Test
    @DisplayName("Вправо (сдвиг больше чем длина числа)")
    void Test7() {
        Assertions.assertEquals(2, Task7.rotateRight(16, 8));
    }

    @Test
    @DisplayName("Влево (сдвиг больше чем длина числа)")
    void Test8() {
        Assertions.assertEquals(4, Task7.rotateLeft(16, 8));
    }

    @Test
    @DisplayName("Влево (сдвиг больше чем длина числа)")
    void Test9() {
        Assertions.assertEquals(384, Task7.rotateLeft(257, 521));
    }
}
