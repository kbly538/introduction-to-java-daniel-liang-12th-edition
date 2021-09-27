/*********************************************************************************************************
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * Write a program that prompts the user to enter the weight of the package and
 * displays the shipping cost. If the weight is negative or zero, display a message
 * “Invalid input.” If the weight is greater than 20, display a message “The package
 * cannot be shipped.”
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;


public class Exercise_3_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  the weight of the package in pounds: ");
		double weight = input.nextDouble();
		input.close();

		if (weight <= 0) {
			System.out.println("Invalid input.");
		} else if (weight <= 1) {
			System.out.println("Cost: " + 3.5 * weight);
		} else if ( weight <= 3) {
			System.out.println("Cost: " + weight * 5.5);
		} else if (weight <= 10) {
			System.out.println("Cost: " + weight * 8.5);
		} else if ( weight <= 20) {
			System.out.println("Cost: " + weight * 10);
		} else {
			System.out.println("The package cannot be shipped.");
		}
	}
}