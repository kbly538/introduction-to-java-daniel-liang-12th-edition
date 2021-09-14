/*********************************************************************************************************
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree.
 * Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area.
 ********************************************************************************************************/
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides and the length of a side: ");
		int numberOfSides = input.nextInt();
		double sideLength = input.nextDouble();
		input.close();

		System.out.println("The area of the polygon is "
				+ getAreaOfRegularPolygon(numberOfSides, sideLength));

	}

	public static double getAreaOfRegularPolygon(int numberOfSides, double sideLength) {
		return numberOfSides * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / numberOfSides));
	}


}
