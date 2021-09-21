/*
(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
multiplyMatrix(double[][] a, double[][] b)
To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + g + ain * bnj.
For example, for two 3 * 3 matrices a and b, c is
a11 a12 a13   b11 b12 b13     c11 c12 c13
a21 a22 a23 + b21 b22 b23 =   c21 c22 c23
a31 a32 a33   b31 b32 b33     c31 c32 c33

where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
Write a test program that prompts the user to enter two 3 * 3 matrices and
displays
their product.
 */
package chapter8.array2d.exercises;

import utilities.CustomMath;

import java.util.Scanner;

public class Exercise_08_06 {
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

        double[][] product = multiplyMatrix(matrix1, matrix2);

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
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        double[][] m1 = {{1}, {2}};
        double[][] m2 = {{1, 2, 3}, {2, 2, 3}};


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

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] product = new double[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += a[i][k] * b[k][j];
                }
                product[i][j] = sum;
            }
        }

        return product;
    }
}


/* OUTPUT
Enter matrix1:
1 2 3 4 5 6 7 8 9
Enter matrix2:
0 2 4 1 4,5 2,2 1,1 4,3 5,2
1.0 2.0 3.0          0.0 2.0 4.0          5.300000000000001 23.9 24.0
4.0 5.0 6.0     +    1.0 4.5 2.2     =    11.600000000000001 56.3 58.2
7.0 8.0 9.0          1.1 4.3 5.2          17.9 88.69999999999999 92.4
* */