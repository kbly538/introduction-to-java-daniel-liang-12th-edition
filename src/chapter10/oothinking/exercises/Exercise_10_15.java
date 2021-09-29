/*
(Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle
that encloses a set of points in a two-dimensional plane, as shown in
Figure 10.24d. Write a method that returns a bounding rectangle for a set of
points in a two-dimensional plane, as follows:
public static MyRectangle2D getRectangle(double[][] points)
The Rectangle2D class is defined in Programming Exercise 10.13. Write a test
program that prompts the user to enter five points and displays the bounding
rectangle’s
center, width, and height.
 */
package chapter10.oothinking.exercises;

import chapter10.oothinking.exercises.Exercise_10_04.MyPoint;
import chapter10.oothinking.exercises.Exercise_10_13.MyRectangle2D;

import java.util.Scanner;

public class Exercise_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D r1 = MyRectangle2D.getRectangle(points);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("x y: " + r1.getX() + " " + r1.getY());
        System.out.println("width height: " + r1.getWidth() + " " + r1.getHeight());
        System.out.println("Bounding corner points");
        MyPoint[] boundingCornerPoints = r1.getBoundingPoints(r1);
        for (int i = 0; i < 4; i++) {
            System.out.println("X: " + boundingCornerPoints[i].getX() + " Y: " + boundingCornerPoints[i].getY());
        }

        System.out.println();

        for (int i = 0; i < points.length; i++) {
            boolean contains = r1.contains(points[i][0], points[i][1]);
            System.out.println("Contains " + points[i][0] + ", " + points[i][1] + ": " + contains);
        }
    }
}


/* OUTPUT
Enter five points:
1,0 2,5 3 4 5 6 7 8 9 10

Area: 60.0
Perimeter: 31.0
x y: 5.0 6.25
width height: 8.0 7.5
Bounding corner points
X: 1.0 Y: 10.0
X: 9.0 Y: 10.0
X: 1.0 Y: 2.5
X: 9.0 Y: 2.5

Contains 1.0, 2.5: true
Contains 3.0, 4.0: true
Contains 5.0, 6.0: true
Contains 7.0, 8.0: true
Contains 9.0, 10.0: true

Process finished with exit code 0

 */