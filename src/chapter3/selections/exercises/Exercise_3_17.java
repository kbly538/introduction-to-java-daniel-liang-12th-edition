/*********************************************************************************************************
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–
 * rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter
 * a number 0, 1, or 2 and displays a message indicating whether the user or the
 * computer wins, loses, or draws. Here are sample runs:
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_17 {

	public static void main(String[] args) {
		
		// 0: scissor 1: rock 1: paper
		byte hand  = ( byte ) (Math.random() * 3); 

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice 0 for scissor, 1 for frock or 2 for paper: ");
		byte guess = input.nextByte();	
		
		switch (guess) {
		case 0: System.out.println("You: scissor"); break;
		case 1: System.out.println("You: rock"); break;
		case 2: System.out.println("You: paper"); break;
			default: System.out.println("Invalid input");
		}
		
		switch (hand ) {
		case 0: System.out.println("Computer: scissor"); break;
		case 1: System.out.println("Computer: rock"); break;
		case 2: System.out.println("Computer: paper"); break;
		}
		
		// 0: scissor 1: rock 2: paper
				// 0 > 2
				// 1 > 0
				// 2 > 1
		if (guess == hand) {
			System.out.println("Draw.");
		} else if (guess == 0 && hand == 2 ||
					guess == 1 && hand == 0 ||
					guess == 2 && hand == 1) {
			System.out.println("You win");
		} else {
			System.out.println("You lose.");
		}
		
		input.close();

	}
}