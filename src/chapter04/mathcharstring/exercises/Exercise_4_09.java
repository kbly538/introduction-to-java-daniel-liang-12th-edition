/*********************************************************************************************************
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode.
 ********************************************************************************************************/
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an character: ");
		String code = input.nextLine();
		input.close();

		char ch = code.charAt(0);

		System.out.println("The Unicode for the character is " + (int) ch);
	}

}
