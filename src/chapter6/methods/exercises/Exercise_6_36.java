/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
in which all sides are of the same length and all angles have the same degree (i.e.,
the polygon is both equilateral and equiangular). The formula for computing the
area of a regular polygon is

Area = (n * s^2) / (4 * pi / 5)


Write a method that returns the area of a regular polygon using the following
header:

public static double area(int n, double side)

Write a main method that prompts the user to enter the number of sides and the
side of a regular polygon and displays its area.
*/

package chapter6.methods.exercises;

import java.util.Scanner;

public class Exercise_6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        int n = input.nextInt();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is: " + area(n, side));
    }

    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
/* OUTPUT
Enter number of sides:
5
Enter the side:
6,5
The area of the pentagon is: 72.69017017488385
*/