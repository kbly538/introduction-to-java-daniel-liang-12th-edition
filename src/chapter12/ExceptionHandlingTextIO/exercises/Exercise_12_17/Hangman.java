/*
(Game: hangman) Rewrite Programming Exercise 7.35. The program reads the
words stored in a text file named hangman.txt. Words are delimited by spaces.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] wordList = prepareDict();
        startGame(wordList);
    }

    public static String charArrayToString(char[] chars) {
        String s = "";
        for (char ch : chars)
            s += ch;
        return s;
    }

    public static boolean isIdentical(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != array2[i])
                    return false;
            }
        }
        return true;
    }


    public static String[] prepareDict() {
        File file = new File("D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_17\\words.txt");
        ArrayList<String> wordList = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                wordList.add(input.next().trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] wordsArray = new String[wordList.size()];
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordList.get(i);
        }

        return wordsArray;
    }


    public static void startGame(String[] words) {
        Scanner input = new Scanner(System.in);
        char[] currentWord = words[(int) (Math.random() * words.length)].toCharArray();
        char[] hiddenWord = new char[currentWord.length];

        System.out.println();
        int misses = 0;
        boolean gameOver = false;
        boolean newLevel = true;
        while (!gameOver) {
            if (newLevel == true) {
                currentWord = words[(int) (Math.random() * words.length)].toCharArray();
                hiddenWord = new char[currentWord.length];
                for (int i = 0; i < currentWord.length; i++) {
                    hiddenWord[i] = '*';
                }
                newLevel = false;
            }
            System.out.print("(guess) Enter a letter in word " + charArrayToString(hiddenWord) + " > ");
            String guess = input.next().toLowerCase();
            char guessChar = guess.charAt(0);
            boolean isInWord = true;

            boolean correctAnswer = false;
            if (guess.equals(charArrayToString(currentWord))) {
                correctAnswer = true;
            } else {
                if (guess.length() > 1) {
                    System.out.println("Not correct. Game over.");
                    gameOver = true;
                }
            }
            if (correctAnswer == false) {
                for (int i = 0; i < currentWord.length; i++) {
                    if (guessChar == currentWord[i]) {
                        if (hiddenWord[i] != guessChar) {
                            hiddenWord[i] = guessChar;
                            isInWord = true;
                            for (int j = 0; j < currentWord.length; j++) {
                                if (currentWord[j] == guessChar) {
                                    hiddenWord[j] = guessChar;
                                }

                            }
                            break;
                        } else {
                            System.out.println(guessChar + " is already in the word.");
                            isInWord = true;
                            break;
                        }
                    } else {
                        isInWord = false;
                    }

                }
                if (isInWord == false) {
                    System.out.println(guess + " is not in the word.");
                    misses++;
                }

            }


            if (isIdentical(currentWord, hiddenWord) || correctAnswer) {
                System.out.println("The word is " + charArrayToString(currentWord)
                        + ". You missed " + misses + (misses > 1 ? " times." : " time."));
                System.out.println("Would you like to play again? y/n");
                char playAgain = input.next().charAt(0);
                if (playAgain == 'y') {
                    newLevel = true;
                } else {
                    gameOver = true;
                    System.exit(1);
                }
            }


        }
    }
}
