package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    @DisplayName("Минуты в секунды")
    void minutesToSeconds() {
        int seconds = Task1.minutesToSeconds("13:56");
        Assertions.assertEquals(836, seconds);
    }

    @Test
    @DisplayName("Секунд > 60")
    void minutesToSeconds_secondsError() {
        int seconds = Task1.minutesToSeconds("10:81");
        Assertions.assertEquals(-1, seconds);
    }

    @Test
    @DisplayName("Секунд 60")
    void minutesToSeconds_60secondsError() {
        int seconds = Task1.minutesToSeconds("10:60");
        Assertions.assertEquals(-1, seconds);
    }

    @Test
    @DisplayName("Отрицательное число")
    void minutesToSeconds_negativeNumber() {
        int seconds = Task1.minutesToSeconds("-01:23");
        Assertions.assertEquals(-1, seconds);
    }
}
