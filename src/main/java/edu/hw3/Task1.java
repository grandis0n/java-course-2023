package edu.hw3;

public class Task1 {
    private Task1() {
    }

    public static String atbash(String str) {
        StringBuilder answerStr = new StringBuilder();
        for (char tempChar : str.toCharArray()) {
            if (Character.isLetter(tempChar)) {
                answerStr.append(
                    Character.isLowerCase(tempChar) ? ((char) ('z' - tempChar + 'a'))
                        : ((char) ('Z' - tempChar + 'A')));
            } else {
                answerStr.append(tempChar);
            }
        }
        return answerStr.toString();
    }
}
