/*********************************************************************************************************
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point (x, y): ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		input.close();
		
		double circleOriginX = 0;
		double circleOriginY = 0;
		double circleRadius = 10;
		
		double distanceToOrigin = Math.pow(Math.pow(Math.abs(pointX - circleOriginX),  2) +
																		Math.pow(Math.abs(pointY - circleOriginY), 2), 0.5);
		
		System.out.println("( " + pointX + ", " + pointY + " )");
		System.out.println("Distance to origin: " + distanceToOrigin);
		
		if (distanceToOrigin < circleRadius) {
			System.out.println("Point is inside the circle. ");
		} else {
			System.out.println("The point is outside the circle");
		}
		
	}
}