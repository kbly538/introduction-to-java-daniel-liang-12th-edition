/*
(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either X
or O). When one player has placed three tokens in a horizontal, vertical, or diagonal
row on the grid, the game is over and that player has won. A draw (no winner)
occurs when all the cells on the grid have been filled with tokens and neither
player has achieved a win. Create a program for playing a tic-tac-toe game.
The program prompts two players to alternately enter an X token and O token.
Whenever a token is entered, the program redisplays the board on the console and
determines the status of the game (win, draw, or continue).
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_09 {
    public static void main(String[] args) {
        final char[][] GRID = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        drawGrid(GRID);
        Scanner input = new Scanner(System.in);
        char playerX = 'X';
        char playerO = 'O';
        char winner = ' ';
        char turn = 'X';
        boolean gameOver = false;
        while (gameOver == false) {
            if (turn == 'X') {
                while (true) {
                    int[] move = getMove(input, turn);
                    int row = move[0];
                    int col = move[1];
                    if (GRID[row][col] == ' ') {
                        GRID[row][col] = 'X';
                        drawGrid(GRID);
                        if (isWinner(turn, GRID)) {
                            System.out.println("Player X is winner.");
                            gameOver = true;
                            System.exit(1);
                        } else {
                            if (isDraw(GRID)) {
                                System.out.println("It's a draw");
                                gameOver = true;
                                System.exit(1);
                            }
                            turn = 'O';
                            break;
                        }

                    } else {
                        System.out.println("That cell is not empty. Try another one.");
                    }
                }
            }
            if (turn == 'O') {
                while (true) {
                    int[] move = getMove(input, turn);
                    int row = move[0];
                    int col = move[1];
                    if (GRID[row][col] == ' ') {
                        GRID[row][col] = 'O';
                        drawGrid(GRID);
                        if (isWinner(turn, GRID)) {
                            System.out.println("Player O is winner.");
                            gameOver = true;
                            System.exit(1);
                        } else {
                            if (isDraw(GRID)) {
                                System.out.println("It's a draw");
                                gameOver = true;
                                System.exit(1);
                            }
                            turn = 'X';
                            break;
                        }

                    } else {
                        System.out.println("That cell is not empty. Try another one.");
                    }
                }
            }


        }

    }

    private static boolean isDraw(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    private static boolean isWinner(char turn, char[][] grid) {
        return diagonalComplete(turn, grid) || rowComplete(turn, grid) || columnComplete(turn, grid);
    }

    private static boolean columnComplete(char turn, char[][] grid) {
        for (int i = 0; i < 3; i++) {
            int counter = 0;
            for (int j = 0; j < 3; j++) {
                if (grid[j][i] == turn)
                    counter++;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }


    private static boolean rowComplete(char turn, char[][] grid) {
        for (int i = 0; i < 3; i++) {
            int counter = 0;
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == turn)
                    counter++;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }


    private static boolean diagonalComplete(char turn, char[][] grid) {
        int counterLR = 0;
        int counterRL = 0;
        for (int i = 0; i < 3; i++) {
            if (grid[i][i] == turn)
                counterLR++;
            else if (grid[i][2 - i] == turn)
                counterRL++;
        }
        return counterLR == 3 || counterRL == 3;

    }

    public static void drawGrid(char[][] grid) {
        System.out.println("-------------------");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|  " + grid[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println("\n-------------------");
        }
    }

    public static int[] getMove(Scanner input, char turn) {
        System.out.println("Enter a row (0, 1, or 2) for player " + turn);
        int row = input.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player " + turn);
        int col = input.nextInt();
        return new int[]{row, col};
    }


}
/* OUTPUT
-------------------
|     |     |     |
-------------------
|     |     |     |
-------------------
|     |     |     |
-------------------
Enter a row (0, 1, or 2) for player X
1 0
Enter a column (0, 1, or 2) for player X
-------------------
|     |     |     |
-------------------
|  X  |     |     |
-------------------
|     |     |     |
-------------------
Enter a row (0, 1, or 2) for player O
2 0
Enter a column (0, 1, or 2) for player O
-------------------
|     |     |     |
-------------------
|  X  |     |     |
-------------------
|  O  |     |     |
-------------------
Enter a row (0, 1, or 2) for player X
1 1
Enter a column (0, 1, or 2) for player X
-------------------
|     |     |     |
-------------------
|  X  |  X  |     |
-------------------
|  O  |     |     |
-------------------
Enter a row (0, 1, or 2) for player O
2 1
Enter a column (0, 1, or 2) for player O
-------------------
|     |     |     |
-------------------
|  X  |  X  |     |
-------------------
|  O  |  O  |     |
-------------------
Enter a row (0, 1, or 2) for player X
2 2
Enter a column (0, 1, or 2) for player X
-------------------
|     |     |     |
-------------------
|  X  |  X  |     |
-------------------
|  O  |  O  |  X  |
-------------------
Enter a row (0, 1, or 2) for player O
1 2
Enter a column (0, 1, or 2) for player O
-------------------
|     |     |     |
-------------------
|  X  |  X  |  O  |
-------------------
|  O  |  O  |  X  |
-------------------
Enter a row (0, 1, or 2) for player X
0 1
Enter a column (0, 1, or 2) for player X
-------------------
|     |  X  |     |
-------------------
|  X  |  X  |  O  |
-------------------
|  O  |  O  |  X  |
-------------------
Enter a row (0, 1, or 2) for player O
0 0
Enter a column (0, 1, or 2) for player O
-------------------
|  O  |  X  |     |
-------------------
|  X  |  X  |  O  |
-------------------
|  O  |  O  |  X  |
-------------------
Enter a row (0, 1, or 2) for player X
0 2
Enter a column (0, 1, or 2) for player X
-------------------
|  O  |  X  |  X  |
-------------------
|  X  |  X  |  O  |
-------------------
|  O  |  O  |  X  |
-------------------
It's a draw
*/