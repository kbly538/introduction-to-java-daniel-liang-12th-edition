/*
(Largest block) Given a square matrix with the elements 0 or 1, write a program to
find a maximum square submatrix whose elements are all 1s. Your program
should
prompt the user to enter the number of rows in the matrix. The program then displays
the location of the first element in the maximum square submatrix and the
number of rows in the submatrix. Your program should implement and use the following method to find the maximum
square submatrix:
public static int[] findLargestBlock(int[][] m)
The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix.
For an animation of this problem,
see https://liveexample.pearsoncmg.com/dsanimation/LargestBlockeBook.html.
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Arrays;

public class Exercise_08_35 {

    public static void main(String[] args) {

        int size = 20;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        int[] result = findLargestBlock(matrix);
        ArrayOps.display2dArray(matrix);

        System.out.println("The maximum square matrix is at (" + result[0] + ", " + result[1] + ") with size " + result[2]);

    }

    public static int[] findLargestBlock(int[][] m) {
        boolean all1s = false;
        int largestBlockRow = -1;
        int largestBlockCol = -1;
        int largestBlockSize = -1;
        int size = 2;

        for (int row = 0; row < m.length - size + 1; row++) {
            for (int column = 0; column < m.length - size + 1; column++) {
                while (true) {
                    boolean found = isAll1s(row, column, size, m);
                    if (found) {
                        if (size > largestBlockSize) {
                            largestBlockRow = row;
                            largestBlockCol = column;
                            largestBlockSize = size++;
                        }
                    }
                    if (m.length - row <= size || m.length - column <= size) {
                        break;
                    }
                    size++;
                }
                size = 2;
            }
        }

        int[] result = new int[]{largestBlockRow, largestBlockCol, largestBlockSize};
        return result;
    }

    public static boolean isAll1s(int i, int j, int size, int[][] matrix) {
        for (int k = i; k < i + size; k++) {
            for (int l = j; l < j + size; l++) {
                if (matrix[k][l] == 0)
                    return false;
            }
        }
        return true;
    }
}
/*
1 0 1 1 0 1 0 0 1 1 1 1 0 0 0 0 1 1 1 1
1 0 1 1 1 0 0 1 0 1 0 1 1 0 1 1 0 1 0 1
1 0 0 1 1 1 0 0 0 0 1 0 0 0 1 1 1 1 0 1
0 1 0 0 1 0 0 0 1 1 0 0 0 0 0 0 0 0 1 1
1 1 0 1 1 0 1 0 0 0 1 0 0 1 1 0 0 0 0 0
0 1 0 0 1 0 0 1 0 0 0 0 0 1 1 0 0 0 1 1
0 0 1 1 1 1 0 0 1 0 0 0 0 0 0 1 1 0 1 1
1 1 1 0 0 0 1 1 1 1 0 1 0 1 0 1 0 0 1 1
1 1 1 1 0 1 0 1 0 0 1 1 1 0 0 1 1 1 0 1
0 1 1 1 1 1 1 1 1 0 1 1 1 0 1 1 1 0 0 1
1 1 0 1 0 0 0 0 1 0 1 1 1 1 0 1 1 0 1 0
1 0 0 0 0 1 1 1 1 0 0 1 0 1 0 0 1 0 1 0
0 0 0 1 1 0 1 1 0 0 1 1 1 0 0 1 0 1 0 1
1 0 1 0 1 1 0 1 0 0 1 0 0 1 1 0 1 1 1 1
0 1 0 0 0 1 0 0 0 0 0 0 0 0 1 0 0 1 0 0
0 1 1 1 1 1 1 0 1 1 1 1 0 0 1 1 1 0 0 1
1 1 0 1 1 1 0 0 0 1 0 0 0 1 0 0 0 1 1 0
0 1 1 1 0 1 1 0 0 1 1 1 1 1 1 0 0 0 1 0
1 1 1 1 1 1 0 1 0 0 0 0 0 1 0 1 1 1 0 1
0 1 1 1 0 0 1 1 1 1 1 1 1 1 0 0 1 1 0 0
The maximum square matrix is at (8, 10) with size 3
*/