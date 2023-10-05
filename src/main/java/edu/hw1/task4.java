package edu.hw1;

public class task4 {
    public static void main(String[] args) {
    }

    public static String fixString(String origString) {
        char[] ch = origString.toCharArray();
        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        return new String(ch);
    }
}
