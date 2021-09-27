/*********************************************************************************************************
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_02 {

	public static void main(String[] args) {

		// Generate three random single digit integers
		byte number1 = (byte) (Math.random() * 10);
		byte number2 = (byte) (Math.random() * 10);
		byte number3 = (byte) (Math.random() * 10);


		// Prompt user to enter summation 
		Scanner input = new Scanner(System.in);
		System.out.println("What is the sum of " + number1 + ", " + number2 + " and " + number3);
		byte answer = input.nextByte();
		input.close();

		boolean isCorrect = answer == (number1 + number2 + number3);

		System.out.println(isCorrect);


	}

}
