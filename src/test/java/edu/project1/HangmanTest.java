package edu.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HangmanTest {
    @Test
    @DisplayName("Полное угадывание")
    void testPrintWordStateFullGuess() {
        String wordToGuess = "wordToGuess";
        List<Character> playerGuesses = new ArrayList<>();
        for (char ch : wordToGuess.toCharArray()) {
            playerGuesses.add(ch);
        }
        Assertions.assertTrue(Hangman.printWordState(wordToGuess, playerGuesses));
    }

    @Test
    @DisplayName("Частичное угадывание")
    void testPrintWordStatePartlyGuess() {
        String wordToGuess = "wordToGuess";
        List<Character> playerGuesses = new ArrayList<>();
        for (char ch : wordToGuess.toCharArray()) {
            playerGuesses.add(ch);
        }
        playerGuesses.remove(0);
        Assertions.assertFalse(Hangman.printWordState(wordToGuess, playerGuesses));
    }

    @Test
    @DisplayName("Без угадываний")
    void testPrintWordStateNoGuess() {
        String wordToGuess = "wordToGuess";
        List<Character> playerGuesses = new ArrayList<>();
        Assertions.assertFalse(Hangman.printWordState(wordToGuess, playerGuesses));
    }

    @Test
    @DisplayName("Верное угадывание")
    void testGetPlayerGuessRightGuess() {
        String input = "a\n";
        Scanner keyboard = new Scanner(input);
        List<Character> playerGuesses = new ArrayList<>();
        int result = Hangman.getPlayerGuess(keyboard, "apple", playerGuesses);

        assertThat(result).isOne();
    }

    @Test
    @DisplayName("Неверное угадывание")
    void testGetPlayerGuessFalseGuess() {
        String input = "g\n";
        Scanner keyboard = new Scanner(input);
        List<Character> playerGuesses = new ArrayList<>();
        int result = Hangman.getPlayerGuess(keyboard, "apple", playerGuesses);
        assertThat(result).isZero();
    }

    @Test
    @DisplayName("Сдаться")
    void testGetPlayerGuessGiveUp() {
        String input = "SuRRendEr\n";
        Scanner keyboard = new Scanner(input);
        List<Character> playerGuesses = new ArrayList<>();
        int result = Hangman.getPlayerGuess(keyboard, "apple", playerGuesses);

        Assertions.assertEquals(-1, result);
    }

    @Test
    @DisplayName("Корректный ввод строки")
    void testGetPlayerGuessIgnoreLongInput() {
        String input = "aaa\nppp\nlelle\njdjksnkj\ne\n";
        Scanner keyboard = new Scanner(input);
        List<Character> playerGuesses = new ArrayList<>();
        int result = Hangman.getPlayerGuess(keyboard, "apple", playerGuesses);
        assertThat(result).isOne();
        Assertions.assertEquals('e', (char) playerGuesses.get(0));
        assertThat(playerGuesses.size()).isOne();
    }
}
