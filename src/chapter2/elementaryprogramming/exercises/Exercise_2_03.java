/*********************************************************************************************************
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_03 {
	public static void main(String[] args) {

		final double FEET_PER_METER = 0.305;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a vlaue for feet: ");
		double feet = input.nextDouble();

		double meters = feet * FEET_PER_METER;

		System.out.println(feet + " feet is " + meters + " meters.");
		input.close();
	}
}
