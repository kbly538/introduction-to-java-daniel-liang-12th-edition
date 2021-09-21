/*
(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each
column.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3 by 4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }


        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum of the element at column " + j + " is " + sumColumn(matrix, j));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}


/* OUTPUT
Enter a 3 by 4 matrix row by row:
1,5 2 3 4
5,5 6 7 8
9,5 1 3 1
Sum of the element at column 0 is 16.5
Sum of the element at column 1 is 9.0
Sum of the element at column 2 is 13.0
Sum of the element at column 3 is 13.0
* */