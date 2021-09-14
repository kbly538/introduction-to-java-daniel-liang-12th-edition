/** Listing: 4.2 */
package chapter4.mathcharstring.listings;

import java.util.Scanner;

/**
 * *******************************************************************************************************
 * Listing: 4.5
 * 
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 8 Eyl 2021
 * 
 *******************************************************************************************************
 */
public class LotteryUsingStrings {

	public static void main(String[] args) {
		
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10); 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick(2-digit): ");
		String guess = input.nextLine();
		
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);

		char guessDigit1 = guess.charAt(0);	
		char guessDigit2 = guess.charAt(1);
		
		System.out.println("The lottery number is: " + lottery);
		
		if ( guess.equals(lottery)) {
			System.out.println("Exact match! You win $10,000. ");
		} else if (guessDigit1 == lotteryDigit2  &&
					guessDigit2 == lotteryDigit1){
			System.out.println("Match all digits: You win $3,000. ");
		} else if (guessDigit1 == lotteryDigit1 
					|| guessDigit1 == lotteryDigit2 
					|| guessDigit2 ==lotteryDigit1  
					|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: You win $1,000.");
		} else {
			System.out.println("Sorry. No match.");
		}
		
		input.close();
	}

}
