/*
(Game: connect four) Connect four is a two-player board game in which the
players alternately drop colored disks into a seven-column, six-row vertically
suspended grid.
The objective of the game is to connect four same-colored disks in a row, a column,
or a diagonal before your opponent can do likewise. The program prompts
two players to drop a red or yellow disk alternately. Whenever a disk is dropped,
the program redisplays the board on the console and determines the status of the
game (win, draw, or continue).
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] gameBoard = new char[6][7];
        fillBoard(gameBoard);
        displayBoard(gameBoard);

        boolean gameOver = false;
        char playerY = 'Y';
        char playerR = 'R';
        char turn = 'Y';
        char winner = ' ';
        while (!gameOver) {
            while (turn == 'Y') {
                System.out.println("Drop a yellow disk at column (0-6)");
                int diskColumn = input.nextInt();
                for (int i = gameBoard.length - 1; 0 <= i; i--) {
                    if (gameBoard[i][diskColumn] == ' ') {
                        gameBoard[i][diskColumn] = 'Y';
                        displayBoard(gameBoard);
                        if (isConsecutiveFour(gameBoard, playerY)) {
                            System.out.println("Player Y wins.");
                            winner = 'Y';
                            gameOver = true;
                        } else {
                            turn = playerR;
                            break;
                        }
                    } else if (gameBoard[i][diskColumn] != ' ') {
                        boolean hasPlaced = false;
                        for (int j = gameBoard.length - 1; 0 <= j; j--) {
                            if (gameBoard[j][diskColumn] == ' ') {
                                gameBoard[j][diskColumn] = 'Y';
                                hasPlaced = true;
                                break;
                            }
                        }
                        if (hasPlaced == false) {
                            System.out.println("No more empty slots there. Try another column.");
                            break;
                        }

                        displayBoard(gameBoard);
                        if (isConsecutiveFour(gameBoard, playerY)) {
                            System.out.println("Player Y wins.");
                            gameOver = true;
                            System.exit(1);
                        } else {
                            turn = playerR;
                            break;
                        }


                    }
                }
            }

            while (turn == 'R') {
                System.out.println("Drop a red disk at column (0-6)");
                int diskColumn = input.nextInt();
                for (int i = gameBoard.length - 1; 0 < i; i--) {
                    if (gameBoard[i][diskColumn] == ' ') {
                        gameBoard[i][diskColumn] = 'R';
                        displayBoard(gameBoard);
                        if (isConsecutiveFour(gameBoard, playerR)) {
                            System.out.println("Player R wins.");
                            winner = 'R';
                            gameOver = true;
                        } else {
                            turn = playerY;
                            break;
                        }
                    } else if (gameBoard[i][diskColumn] != ' ') {
                        boolean hasPlaced = false;
                        for (int j = gameBoard.length - 1; 0 <= j; j--) {
                            if (gameBoard[j][diskColumn] == ' ') {
                                gameBoard[j][diskColumn] = 'R';
                                hasPlaced = true;
                                break;
                            }
                        }
                        if (hasPlaced == false) {
                            System.out.println("No more empty slots there. Try another column.");
                            break;
                        }
                        displayBoard(gameBoard);
                        if (isConsecutiveFour(gameBoard, playerY)) {
                            System.out.println("Player R wins.");
                            gameOver = true;
                            System.exit(1);
                        } else {
                            turn = playerY;
                            break;
                        }
                    }

                }
            }
            int chCounter = 0;
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[0].length; j++) {
                    if (gameBoard[i][j] == ' ') {
                        chCounter += 1;
                    }
                }
            }
            if (chCounter == 0 && winner == ' ') {

                System.out.println("It's a draw.");
                System.exit(1);

            }

        }

    }

    public static void fillBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }


    public static boolean isConsecutiveFour(char[][] values, char player) {
        boolean fourInRow = false;
        boolean fourInCol = false;
        boolean fourInDiagonal = false;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                // check available rows
                if (j <= values[0].length - 4) {
                    if (onRow(values, i, j, player)) {
                        return true;
                    }
                }
                // check available columns
                if (i <= values.length - 4) {
                    if (onCol(values, j, i, player)) {
                        return true;
                    }
                }
                if (j >= 4 && i <= values.length - 4) {
                    if (onDiagonalBackward(values, i, j, player)) {
                        return true;
                    }
                }
                if (i <= values.length - 4 && j <= values[0].length - 4) {
                    if (onDiagonalForward(values, i, j, player)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean onRow(char[][] values, int i, int j, char player) {
        return values[i][j] == player &&
                values[i][j] == values[i][j + 1] &&
                values[i][j + 1] == values[i][j + 2] &&
                values[i][j + 2] == values[i][j + 3];
    }

    private static boolean onCol(char[][] values, int i, int j, char player) {
        return values[j][i] == player &&
                values[j][i] == values[j + 1][i] &&
                values[j + 1][i] == values[j + 2][i] &&
                values[j + 2][i] == values[j + 3][i];
    }

    private static boolean onDiagonalBackward(char[][] values, int i, int j, char player) {
        return values[i][j] == player &&
                values[i][j] == values[i + 1][j - 1] &&
                values[i + 1][j - 1] == values[i + 2][j - 2] &&
                values[i + 2][j - 2] == values[i + 3][j - 3];
    }

    private static boolean onDiagonalForward(char[][] values, int i, int j, char player) {

        return values[i][j] == player &&
                values[i][j] == values[i + 1][j + 1] &&
                values[i + 1][j + 1] == values[i + 2][j + 2] &&
                values[i + 2][j + 2] == values[i + 3][j + 3];
    }
}
/* OUTPUT
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
Drop a yellow disk at column (0-6)
0
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|Y| | | | | | |
Drop a red disk at column (0-6)
0
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|R| | | | | | |
|Y| | | | | | |
Drop a yellow disk at column (0-6)
0
| | | | | | | |
| | | | | | | |
| | | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
Drop a red disk at column (0-6)
0
| | | | | | | |
| | | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
Drop a yellow disk at column (0-6)
0
| | | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
Drop a red disk at column (0-6)
0
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
Drop a yellow disk at column (0-6)
0
No more empty slots there. Try another column.
Drop a yellow disk at column (0-6)
1
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y|Y| | | | | |
Drop a red disk at column (0-6)
2
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y|Y|R| | | | |
Drop a yellow disk at column (0-6)
1
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R|Y| | | | | |
|Y|Y|R| | | | |
Drop a red disk at column (0-6)
2
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y| | | | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a yellow disk at column (0-6)
1
|R| | | | | | |
|Y| | | | | | |
|R| | | | | | |
|Y|Y| | | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a red disk at column (0-6)
1
|R| | | | | | |
|Y| | | | | | |
|R|R| | | | | |
|Y|Y| | | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a yellow disk at column (0-6)
1
|R| | | | | | |
|Y|Y| | | | | |
|R|R| | | | | |
|Y|Y| | | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a red disk at column (0-6)
1
|R|R| | | | | |
|Y|Y| | | | | |
|R|R| | | | | |
|Y|Y| | | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a yellow disk at column (0-6)
2
|R|R| | | | | |
|Y|Y| | | | | |
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a red disk at column (0-6)
1
No more empty slots there. Try another column.
Drop a red disk at column (0-6)
2
|R|R| | | | | |
|Y|Y| | | | | |
|R|R|R| | | | |
|Y|Y|Y| | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a yellow disk at column (0-6)
2
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|R|R| | | | |
|Y|Y|Y| | | | |
|R|Y|R| | | | |
|Y|Y|R| | | | |
Drop a red disk at column (0-6)
4
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|R|R| | | | |
|Y|Y|Y| | | | |
|R|Y|R| | | | |
|Y|Y|R| |R| | |
Drop a yellow disk at column (0-6)
3
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|R|R| | | | |
|Y|Y|Y| | | | |
|R|Y|R| | | | |
|Y|Y|R|Y|R| | |
Drop a red disk at column (0-6)
3
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|R|R| | | | |
|Y|Y|Y| | | | |
|R|Y|R|R| | | |
|Y|Y|R|Y|R| | |
Drop a yellow disk at column (0-6)
3
|R|R| | | | | |
|Y|Y|Y| | | | |
|R|R|R| | | | |
|Y|Y|Y|Y| | | |
|R|Y|R|R| | | |
|Y|Y|R|Y|R| | |
Player Y wins.

*/