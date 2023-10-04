package edu.hw1;

public final class task1 {
    public static void main(String[] args) {
    }

    public static Integer minutesToSeconds(String time) {
        String[] min_sec = time.split(":");
        int minutes = Integer.parseInt(min_sec[0]);
        int seconds = Integer.parseInt(min_sec[1]);
        if (seconds >= 60 || seconds < 0 || minutes < 0) {
            return -1;
        } else {
            return minutes * 60 + seconds;
        }
    }
}
