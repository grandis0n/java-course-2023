package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    void test() {
        Assertions.assertEquals("II", Task4.convertToRoman(2));
        Assertions.assertEquals("IV", Task4.convertToRoman(4));
        Assertions.assertEquals("XII", Task4.convertToRoman(12));
        Assertions.assertEquals("XVI", Task4.convertToRoman(16));
        Assertions.assertEquals("XXVII", Task4.convertToRoman(27));
        Assertions.assertEquals("XLIX", Task4.convertToRoman(49));
        Assertions.assertEquals("CCCLXXXIII", Task4.convertToRoman(383));
        Assertions.assertEquals("MMVII", Task4.convertToRoman(2007));
        Assertions.assertEquals("MDCLV", Task4.convertToRoman(1655));
        Assertions.assertEquals("MCDXCIV", Task4.convertToRoman(1494));

    }
}
