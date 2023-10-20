package edu.hw1;

public class Task5 {
    private Task5() {
    }

    public static boolean isPalindromeDescendant(int number) {
        String str = String.valueOf(number);
        if (isPalindrome(str)) {
            return true;
        }
        while (str.length() > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i += 2) {
                int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
                sb.append(sum);
            }
            if (str.length() % 2 == 1) {
                sb.append(Character.getNumericValue(str.charAt(str.length() - 1)));
            }
            str = sb.toString();
            if (str.length() > 1 & isPalindrome(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
