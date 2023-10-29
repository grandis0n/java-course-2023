package edu.hw3;

import edu.hw3.Task8.BackwardIterator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task8Test {
    @Test
    void BackwardIteratorTest() {
        BackwardIterator<Integer> iterator = new BackwardIterator<>(List.of(1, 2, 3));
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertEquals(1, iterator.next());
    }
}
