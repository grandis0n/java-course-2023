package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static Integer countDigits(Integer number) {
        return number.equals(0) ? 1 : (int) (Math.log10(Math.abs(number)) + 1);
    }
}
