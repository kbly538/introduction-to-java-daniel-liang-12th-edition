/*********************************************************************************************************
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when converting
 * a double value to an int value. Enter the input as an integer whose last
 * two digits represent the cents. For example, the input 1156 represents 11
 * dollars and 56 cents.
 * ******************************************************************************************************/

package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_22 {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount as an integer, e.g. 1156, that is, 11 dollars and 56 cents: ");
		int  amount = input.nextInt();
		int remainingCents = amount;
		
		// Amount in cents
		int dollars = amount  / 100;
		remainingCents = remainingCents % 100;
		int quarters = remainingCents / 25;
		remainingCents = remainingCents % 25;
		int dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;
		int nickels = remainingCents / 5;
		remainingCents = remainingCents % 5;
		
		
		
		System.out.println("It is " + dollars + " dollars " +  quarters + " quarters " +
				dimes + " dimes " + nickels + " nickels and " + remainingCents + " pennies");

		input.close();
	}
}
