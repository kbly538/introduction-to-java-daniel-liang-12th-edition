/*********************************************************************************************************
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 ********************************************************************************************************/

package chapter3.selections.exercises;

import java.util.Scanner;

/**
 * *******************************************************************************************************
 * Description: (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 *
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 6 Eyl 2021
 * <p>
 * ******************************************************************************************************
 */
public class Exercise_3_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount as an integer, e.g. 1156, that is, 11 dollars and 56 cents: ");
		int amount = input.nextInt();
		int remainingCents = amount;

		// Amount in cents
		int dollars = amount / 100;
		remainingCents = remainingCents % 100;
		int quarters = remainingCents / 25;
		remainingCents = remainingCents % 25;
		int dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;
		int nickels = remainingCents / 5;
		remainingCents = remainingCents % 5;

		System.out.println("It is " +
				(dollars > 0 ? (dollars > 1 ? dollars + " dollars " : dollars + " dollar ") : "") +
				(quarters > 0 ? (quarters > 1 ? quarters + " quarters " : quarters + " quarter ") : "") +
				(dimes > 0 ? (dimes > 1 ? dimes + " dimes " : dimes + " dime ") : "") +
				(nickels > 0 ? (nickels > 1 ? nickels + " nickels " : nickels + " nickel ") : ""));


		input.close();
	}

}
