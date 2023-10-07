package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {
    }

    @SuppressWarnings("MagicNumber")
    public static int countK(int number) {
        if (number == 6174) {
            return 0;
        }
        int tempNumber = number;
        int reversedNumber = 0;
        int[] digitsArray = new int[4];
        for (int i = 0; i < 4; i++) {
            digitsArray[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        Arrays.sort(digitsArray);
        for (int i = 0; i < 4; i++) {
            tempNumber = tempNumber * 10 + digitsArray[i];
            reversedNumber = reversedNumber * 10 + digitsArray[3 - i];
        }
        int answer = reversedNumber - tempNumber;
        return 1 + countK(answer);
    }
}
