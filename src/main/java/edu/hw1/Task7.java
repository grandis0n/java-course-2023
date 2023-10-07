package edu.hw1;

public class Task7 {
    private Task7() {
    }

    public static int rotateRight(int n, int shift) {
        int tempShift = shift;
        StringBuilder binaryN = new StringBuilder(Integer.toBinaryString(n));
        tempShift %= binaryN.length();
        StringBuilder tempEnd =
            new StringBuilder(binaryN.substring(binaryN.length() - tempShift, binaryN.length()));
        binaryN.delete(binaryN.length() - tempShift, binaryN.length());
        binaryN.insert(0, tempEnd.reverse());
        return Integer.parseInt(binaryN.toString(), 2);
    }

    public static int rotateLeft(int n, int shift) {
        int tempShift = shift;
        StringBuilder binaryN = new StringBuilder(Integer.toBinaryString(n));
        tempShift %= binaryN.length();
        String tempBegin = binaryN.substring(0, tempShift);
        binaryN.delete(0, tempShift);
        binaryN.append(tempBegin);
        return Integer.parseInt(binaryN.toString(), 2);
    }
}
