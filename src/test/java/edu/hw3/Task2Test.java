package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Task2Test {
    @Test
    void test1(){
        Assertions.assertEquals(List.of("()", "()", "()"), Task2.clusterize("()()()"));
        Assertions.assertEquals(List.of("((()))"), Task2.clusterize("((()))"));
        Assertions.assertEquals(List.of("((()))", "(())", "()", "()", "(()())"), Task2.clusterize("((()))(())()()(()())"));
        Assertions.assertEquals(List.of("((())())", "(()(()()))"), Task2.clusterize("((())())(()(()()))"));
    }
}
