/*
(Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. The method signature is
public static double sumArea(GeometricObject[] a)
Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.
 */
package chapter13.exercises;

import chapter13.exercises.Exercise_13_05.Circle;
import chapter13.exercises.Exercise_13_05.GeometricObject;
import chapter13.exercises.Exercise_13_05.Rectangle;

public class Exercise_12_12 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(20, 20);
        Circle c1 = new Circle(25);
        Circle c2 = new Circle(50);

        GeometricObject[] a = {r1, r2, c1, c2};

        System.out.println("Total Area: " + sumArea(a));

    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }


}

/* OUTPUT
Total Area: 10317.477042468105
 */