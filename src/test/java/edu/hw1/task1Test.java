package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task1Test {
    @Test
    void minutesToSeconds() {
        int seconds = task1.minutesToSeconds("13:56");
        Assertions.assertEquals(836, seconds);
    }

    @Test
    void minutesToSeconds_secondsError() {
        int seconds = task1.minutesToSeconds("10:81");
        Assertions.assertEquals(-1, seconds);
    }

    @Test
    void minutesToSeconds_negativeNumber() {
        int seconds = task1.minutesToSeconds("-01:23");
        Assertions.assertEquals(-1, seconds);
    }
}
