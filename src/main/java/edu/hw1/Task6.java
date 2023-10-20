package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {
    }

    public static int countK(int number) {
        final int numericalSystem = 10;
        final int KaprecalNumber = 6174;
        if (number == KaprecalNumber) {
            return 0;
        }
        int tempNumber = number;
        int reversedNumber = 0;
        int[] digitsArray = new int[Integer.toString(number).length()];
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = tempNumber % numericalSystem;
            tempNumber /= numericalSystem;
        }
        Arrays.sort(digitsArray);
        for (int i = 0; i < digitsArray.length; i++) {
            tempNumber = tempNumber * numericalSystem + digitsArray[i];
            reversedNumber = reversedNumber * numericalSystem + digitsArray[digitsArray.length - 1 - i];
        }
        int answer = reversedNumber - tempNumber;
        return 1 + countK(answer);
    }
}
