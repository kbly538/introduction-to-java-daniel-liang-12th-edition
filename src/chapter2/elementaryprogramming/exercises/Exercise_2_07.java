/*********************************************************************************************************
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remaining
 * days for the minutes. For simplicity, assume that a year has 365 days.
 ********************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_07 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number of minutes: ");
		long minutes = input.nextLong();

		long hours = minutes / 60;


		long days = hours / 24;


		long years = days / 365;
		long remainingDays = days % 365;

		System.out.println(minutes + " is approximately " + years + " years and " + remainingDays + " days.");


		input.close();
	}
}
