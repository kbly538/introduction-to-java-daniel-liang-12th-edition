/** Listing   3.3 */
package chapter3.selections.listings;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		// Generate two random numbers
		int number1 = ( int ) (Math.random() * 10);
		int number2 = (int ) ( Math.random() * 10);

		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		input.close();
		
		boolean isCorrect = number1 - number2 == answer;
		
		if (number1 - number2 == answer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
		
		//or
		
		System.out.println(isCorrect);
	}

}
