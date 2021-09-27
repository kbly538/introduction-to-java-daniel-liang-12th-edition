/*
(Sum the major diagonal in a matrix) Write a method that sums all the numbers
in the major diagonal in an n * n matrix of double values using the following
header:
public static double sumMajorDiagonal(double[][] m)
Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4 by 4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }


        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}


/* OUTPUT
Enter a 4 by 4 matrix row by row:
1 2 3 4
5 6 7 8
9 10 11 12
13 14,5 15 16,7
Sum of the elements in the major diagonal is 34.7

* */