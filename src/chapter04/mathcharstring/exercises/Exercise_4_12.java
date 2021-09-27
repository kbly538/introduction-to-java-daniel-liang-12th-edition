/*
(Hex to binary) Write a program that prompts the user to enter a hex digit and
 displays its corresponding binary number in four digits. For example, hex digit 7
 is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
 an incorrect input, display invalid input.
 */

package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexDigit = input.nextLine().toLowerCase();

		switch (hexDigit.charAt(0)) {
			case 0:
				System.out.println("0000");
				break;
			case 1:
				System.out.println("0001");
				break;
			case 2:
				System.out.println("0010");
				break;
			case 3:
				System.out.println("0011");
				break;
			case 4:
				System.out.println("0100");
				break;
			case 5:
				System.out.println("0101");
				break;
			case 6:
				System.out.println("0110");
				break;
			case 7:
				System.out.println("0111");
				break;
			case 8:
				System.out.println("1000");
				break;
			case 9:
				System.out.println("1001");
				break;
			case 'a':
				System.out.println("1010");
				break;
			case 'b':
				System.out.println("1011");
				break;
			case 'c':
				System.out.println("1100");
				break;
			case 'd':
				System.out.println("1101");
				break;
			case 'e':
				System.out.println("1110");
				break;
			case 'f':
				System.out.println("1111");
				break;
			default:
				System.out.println("Invalid input.");
		}

		input.close();
	}

}
