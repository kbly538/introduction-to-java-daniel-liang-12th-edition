/** Listing   3.1 */
package chapter03.selections.listings;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		
		// Generate two one-digit random numbers
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);

		// Get user input
		Scanner input = new Scanner(System.in);
		
		// Ask question
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		
		// Obtain user input
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer) );
		
		input.close();
	}

}
