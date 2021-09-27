/*
(Geometry: intersecting point) Write a method that returns the intersecting point of
two lines. The intersecting point of the two lines can be found by using the formula
given in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is:
public static double[] getIntersectingPoint(double[][] points)
The points are stored in a 4-by-2 two-dimensional array points with (points
[0][0], points[0][1]) for (x1, y1). The method returns the intersecting point
or null if the two lines are parallel. Write a program that prompts the user to enter
four points and displays the intersecting point.
 */
package chapter08.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];

        // obtain points
        System.out.println("Enter the points of the lines: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++)
                points[i][j] = input.nextDouble();
        }

        double[] solution = getIntersectingPoint(points);

        if (solution != null)
            System.out.println("( " + solution[0] + ", " + solution[1] + " )");
        else
            System.out.println("Lines are parallel");
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double a = points[0][1] - points[1][1];
        double b = -(points[0][0] - points[1][0]);
        double c = (points[2][1] - points[3][1]);
        double d = -(points[2][0] - points[3][0]);
        double e = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
        double f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

        double solutionX = (e * d - b * f) / (a * d - b * c);
        double solutionY = (a * f - e * c) / (a * d - b * c);

        if (solutionX != Double.POSITIVE_INFINITY && solutionX != Double.NEGATIVE_INFINITY) {
            return new double[]{solutionX, solutionY};
        }
        return null;
    }
}
/*
Enter the points of the lines:
2 2 5 -1,0 4,0 2,0 -1,0 -2,0
( 2.888888888888889, 1.1111111111111112 )

Enter the points of the lines:
2 2 7 6,0 4,0 2,0 -1,0 -2,0
Lines are parallel
*/