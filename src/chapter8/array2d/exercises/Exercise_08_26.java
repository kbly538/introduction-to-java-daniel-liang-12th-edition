/*
(Row sorting) Implement the following method to sort the rows in a two-dimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Row-Sorted array is: ");
        double[][] sortedArray = sortRows(matrix);
        ArrayOps.display2dArray(sortedArray);

    }

    public static double[][] sortRows(double[][] m) {
        double[][] sortedArray = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sortedArray[i][j] = m[i][j];
            }
            Arrays.sort(sortedArray[i]);
        }
        return sortedArray;
    }

}
/*
Enter 3-by-3 matrix row by row:
0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12 0,4
Row-Sorted array is:
0.15 0.375 0.875
0.005 0.225 0.55
0.12 0.3 0.4
*/