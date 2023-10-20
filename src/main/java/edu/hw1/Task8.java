package edu.hw1;

public class Task8 {
    private Task8() {
    }

    @SuppressWarnings("MagicNumber")
    public static boolean knightBoardCapture(int[][] board) {
        int knightAmount = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    knightAmount++;
                }
            }
        }
        int[][] knightCoord = new int[knightAmount][2];
        for (int i = 0; i < 8 & knightAmount > 0; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    knightCoord[knightAmount - 1][0] = i;
                    knightCoord[knightAmount - 1][1] = j;
                    knightAmount--;
                }
            }
        }
        for (int i = 0; i < knightCoord.length; i++) {
            for (int j = i; j < knightCoord.length; j++) {
                int distX = Math.abs(knightCoord[i][0] - knightCoord[j][0]);
                int distY = Math.abs(knightCoord[i][1] - knightCoord[j][1]);
                if (distX == 2 & distY == 1 | distX == 1 & distY == 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
