package edu.hw3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("ASC Test")
    void testASC() {
        List<Task5.Contact> expectedObject = new ArrayList<>();
        expectedObject.add(0, new Task5.Contact("Thomas", "Aquinas"));
        expectedObject.add(1, new Task5.Contact("Rene", "Descartes"));
        expectedObject.add(2, new Task5.Contact("David", "Hume"));
        expectedObject.add(3, new Task5.Contact("John", "Locke"));
        var actualObject = Task5.ContactSorter.parseContacts(new String[] {"John Locke", "Thomas Aquinas", "David Hume",
            "Rene Descartes" }, "ASC");
        assertThat(expectedObject).isEqualToComparingFieldByFieldRecursively(actualObject);
    }

    @Test
    @DisplayName("DESC Test")
    void testDESC() {
        List<Task5.Contact> expectedObject = new ArrayList<>();
        expectedObject.add(0, new Task5.Contact("Carl", "Gauss"));
        expectedObject.add(1, new Task5.Contact("Leonhard", "Euler"));
        expectedObject.add(2, new Task5.Contact("Paul", "Erdos"));
        var actualObject =
            Task5.ContactSorter.parseContacts(new String[] {"Paul Erdos", "Leonhard Euler", "Carl Gauss" }, "DESC");
        assertThat(expectedObject).isEqualToComparingFieldByFieldRecursively(actualObject);
    }

    @Test
    @DisplayName("Empty array test")
    void emptyArrayTest() {
        List<Task5.Contact> expectedObject = new ArrayList<>();
        var actualObject = Task5.ContactSorter.parseContacts(new String[] {}, "DESC");
        assertThat(expectedObject).isEqualToComparingFieldByFieldRecursively(actualObject);
    }

    @Test
    @DisplayName("Null test")
    void nullTest() {
        List<Task5.Contact> expectedObject = new ArrayList<>();
        var actualObject = Task5.ContactSorter.parseContacts(null, "DESC");
        assertThat(expectedObject).isEqualToComparingFieldByFieldRecursively(actualObject);
    }
}
