/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. For a nonletter input, display
invalid input.
 */

package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.nextLine().toLowerCase();
		input.close();

		if (Character.isAlphabetic(letter.charAt(0)) && letter.length() == 1) {
			if (letter.equals("a")
					|| letter.equals("e")
					|| letter.equals("o")
					|| letter.equals("u")
					|| letter.equals("i")) {
				System.out.println(letter.charAt(0) + " is a vowel.");
			} else {
				System.out.println(letter.charAt(0) + " is a consonant.");
			}
		} else {
			System.out.println("ınvalid input.");
		}

	}

}
