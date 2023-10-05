package edu.hw1;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
    }

    public static boolean isNestable(int[] array1, int[] array2) {
        return Arrays.stream(array1).max().getAsInt() < Arrays.stream(array2).max().getAsInt() &
            Arrays.stream(array1).min().getAsInt() > Arrays.stream(array2).min().getAsInt();
    }
}
