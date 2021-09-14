/*********************************************************************************************************
 * (Game: heads or tails) Write a program that lets the user guess whether the flip
 * of a coin results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user to enter a
 * guess, and reports whether the guess is correct or incorrect.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;


public class Exercise_3_14 {

	public static void main(String[] args) {
		
		// Flip a coin
		byte coinFlip = ( byte ) (Math.random() * 2);
		System.out.println(coinFlip);
		
		// Process user input
		Scanner input = new Scanner(System.in);
		System.out.println("Heads or Tails? Enter 0 for heads and 1 for tails: ");
		byte guess = input.nextByte();
		input.close();
		
		// Determine result
		boolean isGuessCorrect = coinFlip ==  guess? true : false ;
		
		System.out.println(isGuessCorrect);
		
		
		
	}

}
