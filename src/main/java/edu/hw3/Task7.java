package edu.hw3;

import java.util.Comparator;

public class Task7 {
    private Task7() {
    }

    static Comparator<String> nullsFirst() {
        return Comparator.nullsFirst(String::compareTo);
    }
}
