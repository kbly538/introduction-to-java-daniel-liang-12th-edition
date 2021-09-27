/** Listing   3.4 */
package chapter03.selections.listings;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
		
		System.out.println("Your BMI is: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi <25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
		
		input.close();
		
	}

}
