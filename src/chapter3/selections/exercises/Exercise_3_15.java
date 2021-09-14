/*********************************************************************************************************
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
 * integer. The program prompts the user to enter a three-digit integer and
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 * is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award
 * is $1,000.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;


public class Exercise_3_15 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		// Generate random lottery number
		int lottery = ( int ) (Math.random() * 899 + 100);
		System.out.println(lottery);
		// Get user guess
		System.out.println("Enter your bet as a three-digit number: ");
		int bet = input.nextInt();
		input.close();
		
		// Get digits of guess and lottery
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = (lottery / 10) % 10;
		int lotteryDigit3 = lottery / 100;
		
		int betDigit1 = bet % 10;
		int betDigit2 = (bet / 10) % 10;
		int betDigit3 = bet / 100;
		
		System.out.println(betDigit1 + " " + betDigit2 + " " + betDigit3);
		
		// rules for winning a prize
		if (lottery == bet) { // if guess and lottery numbers are the same
			System.out.println("Exact match. You win $10,000!");
		} else if ( (lotteryDigit1 == betDigit1 ||
						lotteryDigit1 == betDigit2 ||
						lotteryDigit1 == betDigit3) &&
						(lotteryDigit2 == betDigit1 ||
						lotteryDigit2 == betDigit2 ||
						lotteryDigit2 == betDigit3) &&
						(lotteryDigit3 == betDigit1 ||
						lotteryDigit3 == betDigit2 ||
						lotteryDigit3 == betDigit3) ) {
			System.out.println("Match. You win $3,000.");
		} else if ( (lotteryDigit1 == betDigit1 ||
						lotteryDigit1 == betDigit2 ||
						lotteryDigit1 == betDigit3) ||
						(lotteryDigit2 == betDigit1 ||
						lotteryDigit2 == betDigit2 ||
						lotteryDigit2 == betDigit3) ||
						(lotteryDigit3 == betDigit1 ||
						lotteryDigit3 == betDigit2 ||
						lotteryDigit3 == betDigit3) ) {
			System.out.println("A match. You win $1,000.");
		} else {
			System.out.println("Sorry no match.");
		}

	}
}
