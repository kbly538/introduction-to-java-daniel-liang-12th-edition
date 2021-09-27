/*
(Geometry: area of a triangle) Write a method that returns the area of a triangle
using the following header:
public static double getTriangleArea(double[][] points)
The points are stored in a 3-by-2 two-dimensional array points with points
[0][0] and points[0][1] for (x1, y1). The triangle area can be computed
using the formula in Programming Exercise 2.19. The method returns 0 if the
three points are on the same line. Write a program that prompts the user to enter
three points of a triangle and displays the triangle’s area.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];

        // obtain points
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                points[i][j] = input.nextDouble();
        }

        if (getTriangleArea(points) != 0)
            System.out.println("The area of triangle is " + getTriangleArea(points));
        else
            System.out.println("Points are on the same line.");

    }

    public static double getTriangleArea(double[][] points) {

        double side1 = Math.abs(Math.pow(Math.pow((points[1][0] - points[0][0]), 2)
                + Math.pow((points[1][1] - points[0][1]), 2), 0.5));
        double side2 = Math.abs(Math.pow(Math.pow((points[2][0] - points[1][0]), 2)
                + Math.pow((points[2][1] - points[1][1]), 2), 0.5));
        double side3 = Math.abs(Math.pow(Math.pow((points[2][0] - points[0][0]), 2)
                + Math.pow((points[2][1] - points[0][1]), 2), 0.5));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        if (area > 0)
            return area;
        return 0;
    }

}
/*
Enter x1, y1, x2, y2, x3, y3:
2,5 2 5 -1,0 4,0 2,0
The area of triangle is 2.2500000000000013

Enter x1, y1, x2, y2, x3, y3:
2 2 4,5 4,5 6 6
Points are on the same line.
*/