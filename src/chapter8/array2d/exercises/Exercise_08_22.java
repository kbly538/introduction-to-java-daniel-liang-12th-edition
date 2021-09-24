/*
(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Scanner;

public class Exercise_08_22 {

    public static void main(String[] args) {
        //ArrayOps.display2dArray(matrixWithEven1s(6));
        int[][] m = matrixWithEven1s(6);
        ArrayOps.display2dArray(m);
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
1 0 1 0 1 1
1 0 1 1 0 1
0 0 0 1 1 0
1 1 0 0 1 1
1 0 0 1 0 0
0 1 0 1 1 1

1 0 1 0 1 1
0 0 0 0 0 0
1 1 1 0 0 1
0 1 0 0 1 0
0 0 0 1 1 0
0 0 0 1 1 0

*/