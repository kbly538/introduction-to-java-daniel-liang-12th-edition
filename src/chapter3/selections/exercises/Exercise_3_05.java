/*********************************************************************************************************
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week.
 ********************************************************************************************************/

package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user to enter today's day as an integer (Sunday: 0, Monday: 1 etc.)
		System.out.println("Enter today's day as an integer (Sunday: 0, Monday: 1 etc.): ");
		byte today = input.nextByte();

		// Prompt user to enter a number for days after today for a future day
		System.out.println("Enter a number for days after today for a future day.");
		int elapsedDays = input.nextInt();

		// display the future day of the week
		int futureDay = today + elapsedDays % 7;

		switch (futureDay) {
			case 0:
				System.out.println("It is Sunday  after " + elapsedDays + " days.");
				break;
			case 1:
				System.out.println("It is Monday after " + elapsedDays + " days.");
				break;
			case 2:
				System.out.println("It is Tuesday  after " + elapsedDays + " days.");
				break;
			case 3:
				System.out.println("It is Wednesday  after " + elapsedDays + " days.");
				break;
			case 4:
				System.out.println("It is Thursday after " + elapsedDays + " days.");
				break;
			case 5:
				System.out.println("It is Friday after " + elapsedDays + " days.");
				break;
			case 6:
				System.out.println("It is Saturday after " + elapsedDays + " days.");
				break;

		}

		input.close();
	}

}
