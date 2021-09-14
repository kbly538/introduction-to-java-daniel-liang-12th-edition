/*
(Days of a month) Write a program that prompts the user to enter the year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month.
 */
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		System.out.println("Enter a month: ");
		String month = input.next();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;


		if (isLeapYear && month.startsWith("Feb")) {
			System.out.println(month + " " + year + " has 29 days.");
		} else if (month.startsWith("Feb")) {
			System.out.println(month + " " + year + " has 28 days.");
		} else if (month.startsWith("Apr")
				|| month.startsWith("Jun")
				|| month.startsWith("Sep")
				|| month.startsWith("Nov")) {
			System.out.println(month + " " + year + " has 30 days.");
		} else if (month.startsWith("Jan")
				|| month.startsWith("Feb")
				|| month.startsWith("Mar")
				|| month.startsWith("May")
				|| month.startsWith("Jul")
				|| month.startsWith("Aug")
				|| month.startsWith("Oct")
				|| month.startsWith("Dec")) {
			System.out.println(month + " " + year + " has 31 days.");
		} else {
			System.out.println("Invalid input.");
		}
	}
}
