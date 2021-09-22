/*
(Pattern recognition: four consecutive equal numbers) Write the following
method that tests whether a two-dimensional array has four consecutive numbers
of the same value, either horizontally, vertically, or diagonally:
public static boolean isConsecutiveFour(int[][] values)
Write a test program that prompts the user to enter the number of rows and
columns
of a two-dimensional array then the values in the array, and displays true
if the array contains four consecutive numbers with the same value. Otherwise,
the program displays false.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        System.out.println("Enter matrix: ");


        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = input.nextInt();
            }
        }

        isConsecutiveFour(m);


    }

    public static boolean isConsecutiveFour(int[][] values) {
        boolean fourInRow = false;
        boolean fourInCol = false;
        boolean fourInDiagonal = false;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                // check available rows
                if (j <= values[0].length - 4) {
                    if (onRow(values, i, j)) {
                        System.out.println("Consecutive 4 on a row.");
                        return true;
                    }
                }
                // check available columns
                if (i <= values.length - 4) {
                    if (onCol(values, j, i)) {
                        System.out.println("Consecutive 4 on a column.");
                        return true;
                    }
                }
                if (j >= 4 && i <= values.length - 4) {
                    if (onDiagonalBackward(values, i, j)) {
                        System.out.println("Consecutive 4 on minor diagonal.");
                        return true;
                    }
                }
                if (i <= values.length - 4 && j <= values[0].length - 4) {
                    if (onDiagonalForward(values, i, j)) {
                        System.out.println("Consecutive 4 on major diagonal.");
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean onRow(int[][] values, int i, int j) {
        return values[i][j] == values[i][j + 1] &&
                values[i][j + 1] == values[i][j + 2] &&
                values[i][j + 2] == values[i][j + 3];
    }

    private static boolean onCol(int[][] values, int i, int j) {
        return values[j][i] == values[j + 1][i] &&
                values[j + 1][i] == values[j + 2][i] &&
                values[j + 2][i] == values[j + 3][i];
    }

    private static boolean onDiagonalBackward(int[][] values, int i, int j) {
        return values[i][j] == values[i + 1][j - 1] &&
                values[i + 1][j - 1] == values[i + 2][j - 2] &&
                values[i + 2][j - 2] == values[i + 3][j - 3];
    }

    private static boolean onDiagonalForward(int[][] values, int i, int j) {

        return values[i][j] == values[i + 1][j + 1] &&
                values[i + 1][j + 1] == values[i + 2][j + 2] &&
                values[i + 2][j + 2] == values[i + 3][j + 3];
    }
}
/* OUTPUT
Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7
Consecutive 4 on a row.

Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 5 2 1 8 2 9
6 5 6 1 1 9 1
1 5 6 1 4 0 7
3 5 3 3 4 0 7
Consecutive 4 on a column.


Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 6 2 9
6 5 6 6 1 9 1
1 3 6 1 4 0 7
3 6 3 3 4 0 7
Consecutive 4 on minor diagonal.

Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
9 6 2 1 8 2 9
6 9 6 1 1 9 1
1 3 9 1 4 0 7
3 3 3 9 4 0 7
Consecutive 4 on major diagonal.


*/