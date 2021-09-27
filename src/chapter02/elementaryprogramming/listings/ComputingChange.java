/** Listing 2.10 */
package chapter02.elementaryprogramming.listings;

import java.util.Scanner;

public class ComputingChange {
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter an amount as a decimal number, e.g. 11.56");
			double amount = input.nextDouble();
			
			// Amount in cents
			int  remainingCents = (int) (amount * 100);
			
			int totalDollars = remainingCents / 100;
			remainingCents = remainingCents % 100;
			
			int totalQuarters = remainingCents / 25;
			remainingCents = remainingCents % 25;
			
			int totalDimes = remainingCents / 10;
			remainingCents = remainingCents % 10;
			
			int totalNickels = remainingCents / 5;
			remainingCents = remainingCents % 5;
			
			System.out.println("It is " + totalDollars + " dollars " +  totalQuarters + " quarters " +
					totalDimes + " dimes " + totalNickels + " nickels and " + remainingCents + " pennies");
			
			
			input.close();
			
		}
}
