/*
(Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user
to enter the number of points in a convex polygon, enter the points clockwise,
then displays the area of the polygon. For the formula for computing the area of
a polygon, see http://www.mathwords.com/a/area_convex_polygon.htm.
 */
package Chapter11.InheritenceAndPolymorphism.exercises;

import Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_10.MyStack;
import chapter10.oothinking.exercises.Exercise_10_04.MyPoint;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of point in the convex polygon: ");
        int numberOfPoints = input.nextInt();
        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the points clockwise: ");
        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }

        System.out.println("Area of the convex polygon is : " + convexArea(points));


    }

    public static double convexArea(ArrayList<Double> points) {

        // Ends at the starting coords
        points.add(points.get(0));
        points.add(points.get(1));

        double sum = 0;
        for (int i = points.size() - 1; i >= 3; i -= 2) {
            sum += points.get(i - 1) * points.get(i - 2); // (x1y2+x2y3....) -> i-1 = x, i-2 = y
            sum -= points.get(i) * points.get(i - 3); // (y1x2+y2x3....) -> i = y, i-3 = x
        }

        return sum * 0.5;
    }
}
/* OUTPUT
Enter number of point in the convex polygon:
3
Enter the points clockwise:
2 5 5 1 -4 3
Area of the convex polygon is : 15.0

Enter number of point in the convex polygon:
7
Enter the points clockwise:
-12 0 -8,5 10 0  11,4 5,5 7,8 6 -5,5 0  -7 -3,5 -5,5
[-12.0, 0.0, -8.5, 10.0, 0.0, 11.4, 5.5, 7.8, 6.0, -5.5, 0.0, -7.0, -3.5, -5.5, -12.0, 0.0]
Area of the convex polygon is : 244.575

 */