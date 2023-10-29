package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class Task3Test {
    @Test
    void test() {
        Assertions.assertEquals(Map.of("a", 2, "bb", 2), Task3.freqDict(List.of("a", "bb", "a", "bb")));
        Assertions.assertEquals(Map.of("that",1, "and", 2, "this", 1), Task3.freqDict(List.of("this", "and", "that", "and")));
        Assertions.assertEquals(Map.of("код", 3, "bug", 1), Task3.freqDict(List.of("код", "код", "код", "bug")));
        Assertions.assertEquals(Map.of(1, 2, 2, 2), Task3.freqDict(List.of(1, 1, 2, 2)));
    }
}
