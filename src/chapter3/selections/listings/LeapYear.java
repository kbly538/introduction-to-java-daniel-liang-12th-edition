/** Listing   3.7 */
package chapter3.selections.listings;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		// combination
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is a leap year? " + isLeapYear);
		input.close();
	}

}
