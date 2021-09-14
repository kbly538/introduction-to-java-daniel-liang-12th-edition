/*********************************************************************************************************
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character.
 ********************************************************************************************************/
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int code = input.nextInt();
		input.close();

		if (code >= 0 && code <= 127) {
			System.out.println("The character for ASCII code " + code + " is " + (char) code);
		} else {
			System.out.println("Invalid input.");
		}
	}

}
