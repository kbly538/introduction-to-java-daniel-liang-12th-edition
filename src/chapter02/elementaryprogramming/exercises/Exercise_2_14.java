/*********************************************************************************************************
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and dividing,
 * by the square of your height in meters. Write a program that prompts the user to
 * enter a weight in pounds and height in inches and displays the BMI. Note one pound
 * is 0.45359237 kilograms and one inch is 0.0254 meters.
 ********************************************************************************************************/

package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_14 {
	public static void main(String[] args) {
			
			final double POUNDS_PER_KILOGRAM = 0.45359237;
			final double METER_PER_INCH = 0.0254;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter weight in pounds: ");
			double weight = input.nextDouble() * POUNDS_PER_KILOGRAM;
			
			System.out.println("Enter height in inches: ");
			double height = input.nextDouble() * METER_PER_INCH;
			
			double bmi = (float) (weight / Math.pow(height, 2));

			System.out.println("BMI is " + bmi);
			input.close();
	}
}
