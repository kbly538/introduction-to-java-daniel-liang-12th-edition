/*********************************************************************************************************
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a month and a year
		System.out.println("Enter a month and a year (e.g. for january 1, for december 11): ");
		byte month = input.nextByte();
		int year = input.nextInt();
		
		// check if leap year 
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		
		// determine the number of days in the month 
		int daysInMonth = 
				month == 4 || month == 6 || month == 9 || month== 11? 30 : 
					month == 2 && isLeapYear? 29 :  month == 2? 28 : 31;
		
		// Display the days of month for that year
		System.out.println("That month in year " + year + " has " + daysInMonth + " days. ");
		
		
		input.close();
		
	}

}
