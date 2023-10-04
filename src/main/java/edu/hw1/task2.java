package edu.hw1;

public class task2 {
    public static void main(String[] args) {
    }

    public static Integer countDigits(Integer number) {
        return number.equals(0) ? 1 : (int) (Math.log10(Math.abs(number)) + 1);
    }
}
