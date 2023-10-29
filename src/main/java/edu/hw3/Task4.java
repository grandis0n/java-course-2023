package edu.hw3;

public class Task4 {
    private Task4() {
    }

    public static String convertToRoman(Integer number) {
        StringBuilder romanNumber = new StringBuilder();
        final int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        var tempNumber = number;
        for (int i = 0; i < arabicValues.length; i++) {
            while (tempNumber >= arabicValues[i]) {
                romanNumber.append(romanSymbols[i]);
                tempNumber -= arabicValues[i];
            }
        }
        return romanNumber.toString();
    }
}
