/*
(Geometry: same line?) Programming Exercise 6.39 gives a method for testing
whether three points are on the same line.
Write the following method to test whether all the points in the array points are
on the same line:
public static boolean sameLine(double[][] points)
Write a program that prompts the user to enter five points and displays whether
they are on the same line.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        System.out.println("Five points are " + (sameLine(points) == true ? "on the same line " : "not on the same line"));
    }


    // Checks if 5 points are on the same line
    public static boolean sameLine(double[][] points) {
        double pointPosition1 = (points[1][0] - points[0][1]) * (points[2][1] - points[0][1])
                - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
        double pointPosition2 = (points[3][0] - points[0][1]) * (points[4][1] - points[0][1])
                - (points[4][0] - points[0][0]) * (points[3][1] - points[0][1]);
        return pointPosition1 == 0 && pointPosition2 == 0;
    }


}
/* OUTPUT
Enter five points:
3,4 2 6,5 9,5 2,3 2,3 5,5 5 -5 4
Five points are not on the same line

Enter five points:
1 1 2 2 3 3 4 4 5 5
Five points are on the same line
*/