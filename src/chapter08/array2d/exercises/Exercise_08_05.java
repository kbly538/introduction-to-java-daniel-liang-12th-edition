/*
Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is


a11 a12 a13   b11 b12 b13     a11 + b11, a12 + b12, a13 + b13
a21 a22 a23 + b21 b22 b23 =   a21 + b21, a22 + b22, a23 + b23
a31 a32 a33   b31 b32 b33     a31 + b31, a32 + b32, a33 + b33

Write a test program that prompts the user to enter two 3 * 3 matrices and displays
their sum.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.println("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] sum = addMatrix(matrix1, matrix2);

        for (int i = 0; i < 3; i++) {


            // Matrix 1
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");

            }

            String space = i == 1 ? "    +    " : "         ";
            System.out.print(space);

            // Matrix 2
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");

            }

            space = i == 1 ? "    =    " : "         ";
            System.out.print(space);

            //  Sum of matrix1 and matrix2
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}


/* OUTPUTEnter matrix1:
1 2 3 4 5 6 7 8 9
Enter matrix2:
1 2 3 4 5 6 7 8 9
1.0 2.0 3.0          1.0 2.0 3.0          2.0 4.0 6.0
4.0 5.0 6.0     +    4.0 5.0 6.0     =    8.0 10.0 12.0
7.0 8.0 9.0          7.0 8.0 9.0          14.0 16.0 18.0
* */