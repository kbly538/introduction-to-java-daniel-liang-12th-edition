/*
(Geometry: point position) Programming Exercise 3.32 shows how to test
whether a point is on the left side of a directed line, on the right, or on the same
line. Write the methods with the following headers:

/** Return true if point (x2, y2) is on the left side of the
* directed line from (x0, y0) to (x1, y1)
public static boolean leftOfTheLine(double x0, double y0,
        double x1, double y1, double x2, double y2)

/** Return true if point (x2, y2) is on the same
* line from (x0, y0) to (x1, y1)
public static boolean onTheSameLine(double x0, double y0,
        double x1, double y1, double x2, double y2)

/** Return true if point (x2, y2) is on the
* line segment from (x0, y0) to (x1, y1)
public static boolean onTheLineSegment(double x0, double y0,
        double x1, double y1, double x2, double y2)

Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left side of the line from p0 to p1, right side,
the same line, or on the line segment.
*/

package chapter06.methods.exercises;

import java.util.Scanner;

public class Exercise_6_39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2: ");
        double p0X = input.nextDouble();
        double p0Y = input.nextDouble();
        double p1X = input.nextDouble();
        double p1Y = input.nextDouble();
        double p2X = input.nextDouble();
        double p2Y = input.nextDouble();


        if (leftOfTheLine(p0X, p0Y, p1X, p1Y, p2X, p2Y))
            System.out.printf("(%.2f, %.2f) is on the left side of the line from (%.2f, %.2f) to (%.2f, %.2f)",
                    p2X, p2Y, p0X, p0Y, p1X, p1Y);
        else if (onTheLineSegment(p0X, p0Y, p1X, p1Y, p2X, p2Y))
            System.out.printf("(%.2f, %.2f) is on the same line segment from (%.2f, %.2f) to (%.2f, %.2f)",
                    p2X, p2Y, p0X, p0Y, p1X, p1Y);
        else if (onTheSameLine(p0X, p0Y, p1X, p1Y, p2X, p2Y))
            System.out.printf("(%.2f, %.2f) is on the same line from (%.2f, %.2f) to (%.2f, %.2f)",
                    p2X, p2Y, p0X, p0Y, p1X, p1Y);
        else {
            System.out.printf("(%.2f, %.2f) is on the right side of the line from (%.2f, %.2f) to (%.2f, %.2f)",
                    p2X, p2Y, p0X, p0Y, p1X, p1Y);
        }
    }


    /**
     * Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1)
     */
    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        double pointPosition = (x1 - y0) * (y2 - y0)
                - (x2 - x0) * (y1 - y0);
        return pointPosition > 0;

    }

    /**
     * Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1)
     */
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        double pointPosition = (x1 - y0) * (y2 - y0)
                - (x2 - x0) * (y1 - y0);
        return pointPosition == 0;
    }

    /**
     * Return true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1)
     */
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2) {
        double pointPosition = (x1 - y0) * (y2 - y0)
                - (x2 - x0) * (y1 - y0);
        boolean isOnSegment = (y2 < y1 && y2 > y0);
        return pointPosition == 0 && isOnSegment;
    }


}
/* OUTPUT
Enter three points for p0, p1, and p2:
1 1 2 2 1,5 1,5
(1,50, 1,50) is on the same line segment from (1,00, 1,00) to (2,00, 2,00)
--------------------------------------------------------------------------
Enter three points for p0, p1, and p2:
1 1 2 2 3 3
(3,00, 3,00) is on the same line from (1,00, 1,00) to (2,00, 2,00)
--------------------------------------------------------------------------
Enter three points for p0, p1, and p2:
1 1  2 2 1 1,5
(1,00, 1,50) is on the left side of the line from (1,00, 1,00) to (2,00, 2,00)
--------------------------------------------------------------------------
Enter three points for p0, p1, and p2:
1 1 2 2 1 -1
(1,00, -1,00) is on the right side of the line from (1,00, 1,00) to (2,00, 2,00)
*/