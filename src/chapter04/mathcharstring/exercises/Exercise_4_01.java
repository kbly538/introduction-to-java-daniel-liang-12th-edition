/**************************************************************************************************
 *(Geometry: area of a pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon.
 *************************************************************************************************/
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		double lengthFromCenter = input.nextDouble();
		input.close();

		double sideLength = 2 * lengthFromCenter * Math.sin(Math.PI / 5);

		double area = 5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5));

		System.out.printf("The are of the pentagon is %4.2f", area);
	}

}
