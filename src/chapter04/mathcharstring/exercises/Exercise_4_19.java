/*
(Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
ISBN number as a string.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_19 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first 9 digits of ISBN
        System.out.println("Enter the first 9 digits of ISBN: ");
        String isbn = input.nextLine();

        int isbn9 = Integer.parseInt(isbn);

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
