/*********************************************************************************************************
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other 9 digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 * d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user to enter the first 9 digits of ISBN
		System.out.println("Enter the first 9 digits of ISBN: ");
		int isbn9 = input.nextInt();

		// Extract Digits
		int digit9 = isbn9 % 10;
		int digit8 = (isbn9 /= 10) % 10;
		int digit7 = (isbn9 /= 10) % 10;
		int digit6 = (isbn9 /= 10) % 10;
		int digit5 = (isbn9 /= 10) % 10;
		int digit4 = (isbn9 /= 10) % 10;
		int digit3 = (isbn9 /= 10) % 10;
		int digit2 = (isbn9 /= 10) % 10;
		int digit1 = (isbn9 /= 10) % 10;


		// Display 10-digit ISBN
		int checksum = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 +
				digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;


		System.out.println("ISBN number is " + digit1 + digit2 + digit3 + digit4
				+ digit5 + digit6 + digit7 + digit8 + digit9 + (checksum == 10 ? "X" : checksum));
		input.close();
	}

}
