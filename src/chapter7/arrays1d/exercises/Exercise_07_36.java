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
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_36 {
    public static void main(String[] args) {

        final int HEIGHT = 8;
        final int WIDTH = 8;
        char[] chessboard = new char[HEIGHT * WIDTH];
        fillChessboard(chessboard);
        placeQueens(chessboard);


    }

    public static void placeQueens(char[] chessboard) {
        int numberOfQueen = 0;
        int tries = 0;
        while (numberOfQueen != 8)
            for (int i = 0; i < chessboard.length; ) {
                tries++;
                if (tries > 100) {
                    fillChessboard(chessboard);
                    numberOfQueen = 0;
                    tries = 0;
                }
                int randomCol = (int) (Math.random() * 8);
                if (isColSafe(chessboard, randomCol)
                        && isDiagonalSafe(chessboard, randomCol)) {
                    chessboard[i + randomCol] = 'Q';
                    numberOfQueen++;
                    i += 8;
                }
                System.out.println("-------------------------------------");
                displayChessboard(chessboard);
                System.out.println(tries);

            }
    }

    public static boolean isColSafe(char[] chessboard, int queenIndex) {
        int quuensInCol = 0;
        for (int i = queenIndex; i < chessboard.length; i += 8) {
            if (chessboard[i] == 'Q')
                quuensInCol++;
        }
        if (quuensInCol != 0)
            return false;
        else
            return true;
    }

    public static boolean isDiagonalSafe(char[] chessboard, int queenIndex) {
        int quuensInDiagonal = 0;
        int quuenDiagonaInitialRowIndex = queenIndex;
        for (int i = quuenDiagonaInitialRowIndex / 8 + queenIndex + queenIndex; i < 8 * (8 - queenIndex); quuenDiagonaInitialRowIndex += 9) {
            if (chessboard[i] == 'Q')
                return false;
        }
        for (int i = queenIndex; i < 8 * (8 - queenIndex); i += 9) {
            System.out.println(i);
            if (chessboard[i] == 'Q')
                return false;
        }
        if (quuensInDiagonal != 0)
            return false;
        else
            return true;
    }


    public static void fillChessboard(char[] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            chessboard[i] = ' ';
        }
    }

    public static void displayChessboard(char[] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            if (i % 8 == 7)
                System.out.print(chessboard[i] + "|\n");
            else if (i % 8 == 0)
                System.out.print("|" + chessboard[i] + "|");
            else
                System.out.print(chessboard[i] + "|");
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