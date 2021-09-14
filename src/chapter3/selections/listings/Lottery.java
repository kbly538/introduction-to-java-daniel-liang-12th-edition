/** Listing   3.8 */
package chapter3.selections.listings;

import java.util.Scanner;


public class Lottery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Generate random lottery number
		int lottery = ( int ) (Math.random() * 89 + 10);
		System.out.println(lottery);
		// Get user guess
		System.out.println("Enter your bet as a two-digit number: ");
		int bet = input.nextInt();
		input.close();
		
		// Get digits of guess and lottery
		int onesDigit = lottery % 10;
		int tensDigit = lottery / 10;
		
		int betOnesDigit = bet % 10;
		int betTensDigit = bet / 10;
		
		// rules for winning a prize
		if (lottery == bet) { // if guess and lottery numbers are the same
			System.out.println("You won $10,000!");
		} else if(onesDigit == betTensDigit && // if numbers are the same but different order
					tensDigit == betOnesDigit) {
			System.out.println("You won $3,000");
		} else if (onesDigit == betOnesDigit || // if only one number is the same
				 	  onesDigit == betTensDigit  ||
				 	  tensDigit == betOnesDigit  ||
				 	  tensDigit == betTensDigit ){
					System.out.println("You won $1,000!");
		} else {
			System.out.println("Sorry. No math.");
		}
		
	}

}
