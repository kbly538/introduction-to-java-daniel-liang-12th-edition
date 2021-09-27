/*
(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that",...};
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_35 {
    public static void main(String[] args) {
        startGame();
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

    public static void startGame() {
        Scanner input = new Scanner(System.in);
        String[] words = {"write", "that", "bleach", "phone", "computer"};
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

/* OUTPUT
(guess) Enter a letter in word       > a
a is not in the word.
(guess) Enter a letter in word       > t
t is not in the word.
(guess) Enter a letter in word       > w
w is not in the word.
(guess) Enter a letter in word       > p
(guess) Enter a letter in word p     > phone
The word is phone. You missed 3 times.
Would you like to play again? y/n

 */