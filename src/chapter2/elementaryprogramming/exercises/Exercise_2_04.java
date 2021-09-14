/*********************************************************************************************************
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilogram. Here is a
 * sample run:
 ********************************************************************************************************/


package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_04 {
	public static void main(String[] args) {

		final double POUND_PER_KILO = 0.454;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a vlaue for pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * POUND_PER_KILO;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		input.close();
	}
}
