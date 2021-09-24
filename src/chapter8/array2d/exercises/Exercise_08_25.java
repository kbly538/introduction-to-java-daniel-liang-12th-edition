/*
(Markov matrix) An n * n matrix is called a positive Markov matrix if each
element is positive and the sum of the elements in each column is 1. Write the
following method to check whether a matrix is a Markov matrix:
public static boolean isMarkovMatrix(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and tests whether it is a Markov matrix.
 */
package chapter8.array2d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix))
            System.out.println("It is a Markov matrix.");
        else
            System.out.println("Not a Markov matrix.");

    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            double colTotal = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] < 0) {
                    return false;
                } else {
                    colTotal += m[j][i];
                }
            }
            if (colTotal != 1) {
                System.out.println(colTotal);
                return false;
            }
        }
        return true;
    }


}
/*
Enter 3-by-3 matrix row by row:
0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12 0,4
It is a Markov matrix.

Enter 3-by-3 matrix row by row:
0,95 -0,875 0,375
0,65 0,005 0,225
0,30 0,22 -0,4
Not a Markov matrix.
*/