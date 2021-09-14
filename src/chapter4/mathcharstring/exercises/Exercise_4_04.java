/*********************************************************************************************************
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays
 * its area.
 ********************************************************************************************************/
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of a side: ");
		double sideLength = input.nextDouble();
		input.close();

		System.out.println("The area of the hexagon is " + getHexagonArea(sideLength));

	}


	public static double getHexagonArea(double side) {

		return (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
	}


}
