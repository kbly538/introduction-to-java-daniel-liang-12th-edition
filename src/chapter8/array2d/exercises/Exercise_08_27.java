/*
(Column sorting) Implement the following method to sort the columns in a
two-dimensional array. A new array is returned and the original array is intact.
public static double[][] sortColumns(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new column-sorted matrix.
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Column-Sorted array is: ");
        double[][] sortedArray = sortColumns(matrix);
        ArrayOps.display2dArray(sortedArray);

    }

    public static double[][] sortColumns(double[][] m) {

        double[][] sortedArray = new double[m.length][m[0].length];

        double[] singleColumn = new double[m[0].length];
        for (int column = 0; column < m[0].length; column++) {
            for (int row = 0; row < m.length; row++) {
                sortedArray[row][column] = m[row][column];
                singleColumn[row] = m[row][column];
            }
            Arrays.sort(singleColumn);
            for (int i = 0; i < m[0].length; i++) {
                sortedArray[i][column] = singleColumn[i];
            }
        }

        return sortedArray;
    }

}
/*
Enter 3-by-3 matrix row by row:
0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12 0,4
Column-Sorted array is:
0.15 0.005 0.225
0.3 0.12 0.375
0.55 0.875 0.4

*/