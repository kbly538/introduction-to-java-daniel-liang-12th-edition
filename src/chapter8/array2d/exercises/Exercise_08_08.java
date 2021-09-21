/*
(All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to display
all closest pairs of points with the same minimum distance.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_08 {
    public static void main(String[] args) {
        double shortestDistance = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }

        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shortestDistance == distance) {
                    p1 = i;
                    p2 = j;
                    System.out.println("The closes points are: " +
                            "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                            points[p2][0] + ", " + points[p2][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
/* OUTPUT
Enter number of points:
8
Enter 8 points:
0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
The closes points are: (0.0, 0.0) and (1.0, 1.0)
The closes points are: (0.0, 0.0) and (-1.0, -1.0)
The closes points are: (1.0, 1.0) and (2.0, 2.0)
The closes points are: (-1.0, -1.0) and (-2.0, -2.0)
The closes points are: (-2.0, -2.0) and (-3.0, -3.0)
The closes points are: (-3.0, -3.0) and (-4.0, -4.0)
Their distance is 1.4142135623730951
* */