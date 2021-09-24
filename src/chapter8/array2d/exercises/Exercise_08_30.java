/*
(Algebra: solve linear equations) Write a method that solves the following 2 * 2
system of linear equations:
a00x + a01y = b0
a10x + a11y = b1
x = (b0a11 - b1a01) / (a00a11 - a01a10)
y =( b1a00 - b0a10) / (a00a11 - a01a10)
The method header is:
public static double[] linearEquation(double[][] a, double[] b)
The method returns null if a00a11 - a01a10 is 0. Write a test program that
prompts the user to enter a00, a01, a10, a11, b0, and b1 and displays the result. If
a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is
similar to Programming Exercise 3.3.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[] b = new double[2];


        // fill a
        System.out.println("Enter a00, a01, a10 and a11");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                a[i][j] = input.nextDouble();
        }

        // fill b
        System.out.println("Enter b0 and b1");
        for (int i = 0; i < 2; i++)
            b[i] = input.nextDouble();

        double[] solution = linearEquation(a, b);
        System.out.println("x is " + solution[0] + " and y is " + solution[1]);


    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0)
            return null;
        else
            return new double[]{x, y};
    }

}
/*
Enter a00, a01, a10 and a11
9,0 4,0 3,0 -5,0
Enter b0 and b1
-6,0 -21,0
x is -2.0 and y is 3.0


*/