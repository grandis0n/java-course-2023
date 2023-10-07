package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    @DisplayName("Тест 1")
    void fixStringTest1() {
        Assertions.assertEquals("Помогите исправить строки!", Task4.fixString("оПомигети псаривьтс ртко!и"));
    }

    @Test
    @DisplayName("Тест 2")
    void fixStringTest2() {
        Assertions.assertEquals("214365", Task4.fixString("123456"));
    }

    @Test
    @DisplayName("Тест 3")
    void fixStringTest3() {
        Assertions.assertEquals("This is a mixed up string.", Task4.fixString("hTsii  s aimex dpus rtni.g"));
    }

    @Test
    @DisplayName("Тест 4")
    void fixStringTest4() {
        Assertions.assertEquals("abcde", Task4.fixString("badce"));
    }

    @Test
    @DisplayName("Пустая строка")
    void fixStringTest5() {
        Assertions.assertEquals("", Task4.fixString(""));
    }

}
