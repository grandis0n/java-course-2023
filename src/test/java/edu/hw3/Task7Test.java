package edu.hw3;

import java.util.TreeMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static edu.hw3.Task7.nullsFirst;

public class Task7Test {
    @Test
    void treeMapCmpTest() {
        TreeMap<String, String> tree = new TreeMap<>(nullsFirst());
        tree.put(null, "check");
        Assertions.assertTrue(tree.containsKey(null));
    }
}
