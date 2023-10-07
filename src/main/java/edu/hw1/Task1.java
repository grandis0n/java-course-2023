package edu.hw1;

public final class Task1 {
    private Task1() {
    }

    @SuppressWarnings("MagicNumber")
    public static Integer minutesToSeconds(String time) {
        String[] minSec = time.split(":");
        int minutes = Integer.parseInt(minSec[0]);
        int seconds = Integer.parseInt(minSec[1]);
        if (seconds >= 60 || seconds < 0 || minutes < 0) {
            return -1;
        } else {
            return minutes * 60 + seconds;
        }
    }
}
