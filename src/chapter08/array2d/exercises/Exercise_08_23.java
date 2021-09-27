/*
(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
cell was flipped. Your program should prompt the user to enter a 6-by-6 array
with 0s and 1s and find the first row r and first column c where the even number
of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
is at (r, c).
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_23 {

    public static void main(String[] args) {
        //ArrayOps.display2dArray(matrixWithEven1s(6));
        Scanner input = new Scanner(System.in);
        int[][] userMatrix = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row");
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                userMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The flipped cell is at (" + oddRow(userMatrix) + ", " + oddCol(userMatrix) + ") ");

    }


    private static int oddRow(int[][] matrix) {
        int oddRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowCount += matrix[i][j];
            }
            if (rowCount % 2 != 0) {
                oddRowIndex = i;
                return oddRowIndex;

            }
        }

        return -1;
    }

    private static int oddCol(int[][] matrix) {
        int oddColIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int colCount = 0;
            for (int j = 0; j < matrix.length; j++) {
                colCount += matrix[j][i];

            }
            oddColIndex = i;
            if (colCount % 2 != 0)
                return oddColIndex;
        }


        return -1;
    }


    private static int[][] matrixWithEven1s(int size) {
        while (true) {
            int[][] m = createSquareMatrix(size);
            if (hasEven1s(m)) {
                return m;
            }
        }
    }

    private static int[][] createSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int randomBinary = (int) (Math.random() * 2);
                matrix[i][j] = randomBinary;
            }
        }
        return matrix;
    }

    public static boolean hasEven1s(int[][] matrix) {

        boolean hasEven = true;

        int rows = 0;
        int cols = 0;
        for (rows = 0; rows < matrix.length; rows++) {
            int rowCount = 0;
            int colCount = 0;
            for (cols = 0; cols < matrix.length; cols++) {
                colCount += matrix[rows][cols];
                rowCount += matrix[cols][rows];
            }
            if ((rowCount % 2) != 0 || colCount % 2 != 0)
                return false;
        }

        return hasEven;
    }
}
/*
Enter a 6-by-6 matrix row by row
1 1 1 0 1 1
1 1 1 1 0 0
0 1 0 1 1 1
1 1 1 1 1 1
0 1 1 1 1 0
1 0 0 0 0 1
The flipped cell is at (0, 1)

Enter a 6-by-6 matrix row by row
1 1 1 1 0 0
1 0 1 0 0 0
0 0 0 0 0 0
1 0 1 0 1 0
1 1 1 1 0 0
0 0 0 0 0 0
The flipped cell is at (3, 4)
*/