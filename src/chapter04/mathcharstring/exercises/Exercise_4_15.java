/*
(Phone key pads) Write a program that prompts the user to enter a lowercase or uppercase letter
and displays its corresponding number. For a nonletter input, display invalid
input.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.nextLine().toLowerCase();

		String button2 = "abc";
		String button3 = "def";
		String button4 = "ghi";
		String button5 = "jkl";
		String button6 = "mno";
		String button7 = "prs";
		String button8 = "tuv";
		String button9 = "wxyz";

		if (letter.length() == 1) {
			if (button2.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 2");
			} else if (button3.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 3");
			} else if (button4.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 4");
			} else if (button5.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 5");
			} else if (button6.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 6");
			} else if (button7.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 7");
			} else if (button8.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 8");
			} else if (button9.contains("" + letter.charAt(0))) {
				System.out.println("The corresponding number is 9");
			}

		}
	}
}
