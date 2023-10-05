package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task4Test {
    @Test
    void fixStringTest1() {
        Assertions.assertEquals("Помогите исправить строки!", task4.fixString("оПомигети псаривьтс ртко!и"));
    }

    @Test
    void fixStringTest2() {
        Assertions.assertEquals("214365", task4.fixString("123456"));
    }

    @Test
    void fixStringTest3() {
        Assertions.assertEquals("This is a mixed up string.", task4.fixString("hTsii  s aimex dpus rtni.g"));
    }

    @Test
    void fixStringTest4() {
        Assertions.assertEquals("abcde", task4.fixString("badce"));
    }

}
