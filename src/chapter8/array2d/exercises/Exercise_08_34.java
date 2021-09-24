/*
(Geometry: rightmost lowest point) In computational geometry, often you need
to find the rightmost lowest point in a set of points. Write the following method
that returns the rightmost lowest point in a set of points:
public static double[]
getRightmostLowestPoint(double[][] points)
Write a test program that prompts the user to enter the coordinates of six points
and displays the rightmost lowest point.
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];

        // obtain points
        System.out.println("Enter the six points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++)
                points[i][j] = input.nextDouble();
        }

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0]
                + ", " + rightmostLowestPoint[1] + ")");

    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        sort2d(points);
        double lowestColumnValue = getMinColumnValue(points);
        int lowestPointX = 0;
        for (int i = points.length - 1; i >= 0; i--) {
            for (int j = 0; j < points.length; j++) {
                if (points[i][1] == lowestColumnValue) {
                    lowestPointX = i;
                    return new double[]{points[i][0], points[i][1]};
                } else if (points[i][1] == lowestColumnValue && points[i][0] > points[lowestPointX][0]) {
                    return new double[]{points[lowestPointX][0], points[lowestPointX][1]};
                }

            }
        }

        return null;
    }


    private static double getMinColumnValue(double[][] array) {
        double minColValue = 999;
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] < minColValue) {
                minColValue = array[i][1];
            }
        }
        return minColValue;
    }


    private static double distanceToOrigin(double[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }

    public static void sort2d(double[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            double[] currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin[0] > array[j][0]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            double[] currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin[1] > array[j][1] && currentMin[0] == array[j][0]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }


    }

}
/*
Enter the six points:
1,5 2,5 -3 4,5 5,6 -7 6,5 -7 8 1 10 2,5
The rightmost lowest point is (6.5, -7.0)

Enter the six points:
12 5 4 4 0 0 12 -5 -1 -1 3 -6
The rightmost lowest point is (3.0, -6.0)

Enter the six points:
12 5 4 4 0 0 12 -5 4 -6 3 -6
The rightmost lowest point is (4.0, -6.0)
*/