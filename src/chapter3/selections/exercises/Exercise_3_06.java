/*********************************************************************************************************
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and
 * 10 inches, you will enter 5 for feet and 10 for inches.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter pounds: ");
		double weight = input.nextDouble();

		System.out.println("Enter feet: ");
		double feet = input.nextDouble();

		System.out.println("Enter inches: ");
		double inches = input.nextDouble();


		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double METER_PER_FOOT = 0.3048;

		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = inches * METERS_PER_INCH + feet * METER_PER_FOOT;
		double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

		System.out.println("Your BMI is: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

		input.close();
	}

}
