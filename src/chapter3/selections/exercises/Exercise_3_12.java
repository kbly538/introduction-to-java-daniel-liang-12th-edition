/*********************************************************************************************************
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

public class Exercise_3_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a three digit integer
		System.out.println("Enter a three digit integer");
		int number = input.nextInt();
		
		// Compare first and last digit
		if (number/100 == number%10) {
			System.out.println(number + " is a palindrome!");
		} else {
			System.out.println(number + " isn't a palindrome.");
		}
		
		
		input.close();
		
	}

}
