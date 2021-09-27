/*********************************************************************************************************
 * (Use the &&, ||, and ^ operators) Write a program that prompts the user to
 * enter an integer and determines whether it is divisible by 5 and 6, whether it is
 * divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a
 * sample run of this program:
 ********************************************************************************************************/
package chapter03.selections.exercises;

import java.util.Scanner;

public class Exercise_3_26 {

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			
			if (number % 5 != 0 && number % 6 != 0) {
				System.out.println("Divisible by neither 5 nor 6.");
			}
			else if (number % 5 == 0 && number % 6 == 0) {
				System.out.println("Divisinle by both 5 and 6.");
			} else if ( number % 5 == 0 ^ number % 6 == 0) {
				System.out.println("It is divisible by 5 or 6 but not both.");
			} 
		
			input.close();
	
	}
}