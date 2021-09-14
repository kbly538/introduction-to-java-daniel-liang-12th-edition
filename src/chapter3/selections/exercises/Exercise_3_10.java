/*********************************************************************************************************
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Generate two random numbers
		int number1 = ( int ) (Math.random() * 10);
		int number2 = (int ) ( Math.random() * 10);
		
		// Addition or Subtraction question?
		double alternation = Math.random();
		boolean addition = alternation >= 0.5;
		
		
		boolean isCorrect = false;
		int answer = 0;
		
		if (addition) {
			System.out.println("What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			isCorrect = number1 + number2 == answer;
			System.out.println(isCorrect);
			
		} else {
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			answer = input.nextInt();
			isCorrect = number1 - number2 == answer;
			System.out.println(isCorrect);
		}
		input.close();
		
	}

}
