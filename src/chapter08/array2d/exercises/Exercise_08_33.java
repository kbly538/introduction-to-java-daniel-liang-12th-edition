/*
(Geometry: polygon subareas) A convex four-vertex polygon is divided into four
triangles, as shown in Figure 8.9.
Write a program that prompts the user to enter the coordinates of four vertices and
displays the areas of the four triangles in increasing order.
 */
package chapter08.array2d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] vertices = new double[6][2];

        // obtain points
        System.out.println("Enter the four vertices (x1, y1, x2, y2, x3, y3, x4, y4) of the polygon: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++)
                vertices[i][j] = input.nextDouble();
        }

        double[] areas = getSubareasSorted(vertices);

        System.out.println("The areas are " + Arrays.toString(areas));

    }


    public static double[] getSubareasSorted(double[][] vertices) {


        double[] vertex1 = {vertices[0][0], vertices[0][1]};
        double[] vertex2 = {vertices[1][0], vertices[1][1]};
        double[] vertex3 = {vertices[2][0], vertices[2][1]};
        double[] vertex4 = {vertices[3][0], vertices[3][1]};


        double[][] lines = {vertex2, vertex4, vertex1, vertex3};
        double[] intersectingPoint = getIntersectingPoint(lines);


        double[][] triangle1Points = {vertex1, vertex2, intersectingPoint};
        double[][] triangle2Points = {vertex2, vertex3, intersectingPoint};
        double[][] triangle3Points = {vertex1, intersectingPoint, vertex4};
        double[][] triangle4Points = {intersectingPoint, vertex3, vertex4};

        double[][][] triangleSet = {triangle1Points, triangle2Points, triangle3Points, triangle4Points};


        double[] areas = new double[4];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = getTriangleArea(triangleSet[i]);
        }


        Arrays.sort(areas);
        return areas;
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
Enter the four vertices (x1, y1, x2, y2, x3, y3, x4, y4) of the polygon:
-2,5 2 4 4 3 -2 -2 -3,5
The areas are [6.169540229885055, 7.955459770114941, 8.080459770114944, 10.419540229885053]
*/