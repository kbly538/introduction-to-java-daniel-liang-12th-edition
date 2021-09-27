/*
(Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking
whether every number is valid in the board. Rewrite the program by checking
whether every row, every column, and every small box has the numbers 1 to 9.
 */
package chapter08.array2d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_24 {

    public static void main(String[] args) {
        // Read solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }


    private static int[][] readASolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    private static boolean isValid(int[][] board) {
        return isRowValid(board) || isColValid(board) || isBoxValid(board);
    }

    private static boolean has1to9(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i <= 9; i++) {
            if (array[i - 1] != i) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRowValid(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!has1to9(board[i]))
                return false;
        }
        return true;
    }

    private static boolean isColValid(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            int[] column = new int[board.length];
            for (int j = 0; j < board.length; j++) {
                column[j] = board[j][i];
            }
            Arrays.sort(column);
            if (!has1to9(column))
                return false;
        }

        return true;
    }

    private static boolean isBoxValid(int[][] board) {


        int[] list = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int listIndex = 0;

                for (int row = i * 3; row < i * 3 + 3; row++) {
                    for (int col = j * 3; col < j * 3 + 3; col++) {
                        list[listIndex] = board[row][col];
                        listIndex++;
                    }
                }
                Arrays.sort(list);
                if (!has1to9(list))
                    return false;
            }
        }

        return true;
    }
}
/*
Enter a sudoku puzzle solution:
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
Valid solution
*/