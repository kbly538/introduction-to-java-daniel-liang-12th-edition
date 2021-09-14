/*********************************************************************************************************
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display
 * that the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths of the three edges to calculate the perimeter: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		input.close();
		
		if (edge1 + edge2 > edge3 &&
				edge2 + edge3 > edge1 &&
				edge3 + edge1 > edge2) {
			System.out.println("The perimeter is: " + (edge1 + edge2 + edge3) + " meters.");
		} else {
			System.out.println("You cannot make a triangle with those edges.");
		}
	}
}