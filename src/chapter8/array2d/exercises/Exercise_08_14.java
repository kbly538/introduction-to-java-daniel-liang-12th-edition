/*
(Explore matrix) Write a program that prompts the user to enter the length of a
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int size = input.nextInt();

        byte[][] m = new byte[size][size];
        System.out.println("Enter the array: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (byte) (Math.random() * 2);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int majorDiagonalZeroCounter = 0;
        int majorDiagonalOneCounter = 0;
        int minorDiagonalZeroCounter = 0;
        int minorDiagonalOneCounter = 0;
        boolean sameNumbersOnCol = false;
        boolean sameNumbersOnRow = false;

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] == 0) {
                majorDiagonalZeroCounter++;
            } else {
                majorDiagonalOneCounter++;
            }
            if (m[m.length - 1 - i][i] == 0) {
                minorDiagonalZeroCounter++;
            } else {
                minorDiagonalOneCounter++;
            }

            // Row counters
            int zeroCounterRow = 0;
            int oneCounterRow = 0;

            // Column counters
            int zeroCounterCol = 0;
            int oneCounterCol = 0;

            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 0) {
                    zeroCounterRow++;
                } else {
                    oneCounterRow++;
                }
                if (m[j][i] == 0) {
                    zeroCounterCol++;
                } else {
                    oneCounterCol++;
                }

            }
            if (zeroCounterRow == 4) {
                System.out.println("All 0s on row " + i);
                sameNumbersOnRow = true;
            } else if (oneCounterRow == 4) {
                System.out.println("All 1's on row " + i);
                sameNumbersOnRow = true;
            }
            if (zeroCounterCol == 4) {
                System.out.println("All 0s on col " + i);
                sameNumbersOnCol = true;

            } else if (oneCounterCol == 4) {
                System.out.println("All 1's on col " + i);
                sameNumbersOnCol = true;
            }

        }
        // Row info
        if (sameNumbersOnRow == false) {
            System.out.println("No same numbers on a row.");
        }
        // Col info
        if (sameNumbersOnCol == false) {
            System.out.println("No same numbers on a column.");
        }
        // Major info
        if (majorDiagonalZeroCounter == 4) {
            System.out.println("All 0s on major diagonal.");
        } else if (majorDiagonalOneCounter == 4) {
            System.out.println("All 1's on major diagonal");
        } else {
            System.out.println("No same numbers major diagonal ");
        }
        // Minor info
        if (minorDiagonalZeroCounter == 4) {
            System.out.println("All 0s on minor diagonal.");
        } else if (minorDiagonalOneCounter == 4) {
            System.out.println("All 1's on minor diagonal.");
        } else {
            System.out.println("No same numbers on minor diagonal.");
        }
    }
}
/* OUTPUT
Enter the size of the matrix:
4
Enter the array:
1 1 1 0
0 1 0 1
0 1 1 0
1 1 1 1
All 1's on col 1
All 1's on row 3
All 1's on major diagonal
No same numbers on minor diagonal.

Enter the size of the matrix:
5
Enter the array:
0 0 0 1 0
1 0 0 0 0
0 1 0 0 1
0 0 0 1 1
0 0 0 0 1
All 0s on row 0
All 0s on col 0
All 0s on row 1
All 0s on col 1
All 0s on row 4
No same numbers major diagonal
No same numbers on minor diagonal.

Enter the size of the matrix:
10
Enter the array:
0 0 1 1 1 0 0 0 0 1
1 1 1 1 0 1 0 1 1 1
0 1 1 1 0 0 0 0 1 0
0 1 0 1 1 1 1 1 0 0
1 0 0 1 1 0 0 0 0 1
0 1 1 0 1 0 1 0 0 0
0 1 1 1 0 1 0 0 1 0
1 0 1 0 0 0 1 1 0 0
0 0 0 0 0 1 0 1 1 0
1 1 1 1 0 0 1 0 1 0
All 1's on row 0
All 1's on col 0
All 0s on col 1
All 1's on row 2
All 0s on row 3
All 1's on row 4
All 1's on col 4
All 1's on row 5
All 1's on col 5
All 1's on col 6
All 1's on row 7
All 1's on col 7
All 0s on row 9
All 0s on major diagonal.
No same numbers on minor diagonal.
*/