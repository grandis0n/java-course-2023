package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    void test1() {
        Assertions.assertEquals("Svool dliow!", Task1.atbash("Hello world!"));

        Assertions.assertEquals(
            "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi",
            Task1.atbash(
                "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler")
        );
    }
}
