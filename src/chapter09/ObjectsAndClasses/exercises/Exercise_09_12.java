/*
(Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Programming
Exercise 3.25, the intersecting point can be found by solving a linear equation.
Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation. See Programming Exercise 3.25 for sample runs.
*/
package chapter09.ObjectsAndClasses.exercises;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_11.LinearEquation;

import java.util.Scanner;

public class Exercise_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 end points for 2 lines: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            if (linearEquation.getX() != Double.POSITIVE_INFINITY) {
                System.out.println("( " + linearEquation.getX() + ", " + linearEquation.getY() + " )");
            }
        } else {
            System.out.println("Lines are parallel.");
        }

    }
}

/* OUTPUT

Enter 4 end points for 2 lines:
2 2 5 -1,0 4,0 2,0 -1,0 -2,0
( 2.888888888888889, 1.1111111111111112 )

Enter 4 end points for 2 lines:
2 2 7 6,0 4,0 2,0 -1,0 -2,0
Lines are parallel.

 */