/*********************************************************************************************************
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area.
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_16 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the length of side: ");
			double sideLength = input.nextDouble();

			double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(sideLength, 2);
			System.out.println("The area of the hexagon is " + area);
			input.close();
	}
}
