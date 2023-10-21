package edu.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings({"RegexpSinglelineJava", "UncommentedMain"})
public class Hangman {
    Hangman() {
    }

    public static void main(String[] args) {
        final int lives = 5;
        int mistakes = 0;
        Scanner keybord = new Scanner(System.in);

        List<String> dict = Arrays.asList(
            "alert",
            "north",
            "moisturize",
            "aspire",
            "listen",
            "building",
            "mission",
            "inoculate",
            "supply"
        );
        int wordID = (int) (Math.random() * dict.size());
        String wordToGuess = dict.get(wordID).toLowerCase();
        System.out.println("Game started! To surrender write \"surrender\"");
        List<Character> playerGuesses = new ArrayList<>();
        printWordState(wordToGuess, playerGuesses);

        while (true) {
            int status = getPlayerGuess(keybord, wordToGuess, playerGuesses);
            switch (status) {
                case 1:
                    System.out.println("Hit!");
                    break;
                case 0:
                    System.out.println("Missed, mistake " + ++mistakes + " out of 5.");
                    break;
                case -1: {
                    System.out.println("You sur, the word was " + wordToGuess);
                    break;
                }
                default:
                    break;
            }

            if (status == -1) {
                break;
            }

            if (printWordState(wordToGuess, playerGuesses)) {
                System.out.println("You won!");
                break;
            }
            if (mistakes == lives) {
                System.out.println("You lost! Word was: " + wordToGuess);
                break;
            }
        }
    }

    public static int getPlayerGuess(Scanner keybord, String wordToGuess, List<Character> playerGuesses) {
        String letterGuess;
        do {
            System.out.print("Guess a letter: ");
            letterGuess = keybord.nextLine();
            if (letterGuess.equalsIgnoreCase("surrender")) {
                return -1;
            }
        } while (letterGuess.length() != 1 || playerGuesses.contains(letterGuess.charAt(0)));

        playerGuesses.add(Character.toLowerCase(letterGuess.charAt(0)));
        return wordToGuess.contains(letterGuess) ? 1 : 0;
    }

    public static boolean printWordState(String wordToGuess, List<Character> playerGuesses) {
        int correctCount = 0;
        System.out.print("The word: ");
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (playerGuesses.contains(wordToGuess.charAt(i))) {
                System.out.print(wordToGuess.charAt(i));
                correctCount++;
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        return (wordToGuess.length() == correctCount);
    }
}

