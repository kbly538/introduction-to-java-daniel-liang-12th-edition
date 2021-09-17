/*
(Geometry: area of a pentagon) The area of a pentagon can be computed using
the following formula:
Area = (5 * s^2) /  4 * tan(pi/5)

Write a method that returns the area of a pentagon using the following header:
public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and
displays its area.
*/

package chapter6.methods.exercises;

import java.util.Scanner;

public class Exercise_6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is: " + area(side));
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
/* OUTPUT
Enter the side:
10
The area of the pentagon is: 172.0477400588967
*/