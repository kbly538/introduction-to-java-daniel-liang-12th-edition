/*********************************************************************************************************
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. For an incorrect
 * input number, display invalid input.
 ********************************************************************************************************/
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a deceimal value: ");
		int number = input.nextInt();
		
		if (number < 10) {
			System.out.println("Hex value is " + number);
		} else if (number >= 10 && number <= 15) {
			int value = 'A' + (number %10);
			System.out.println("Hex value is " + (char) value);
		} else {
			System.out.println("Invalid input.");
		}
		
		
		input.close();
	}

}
