/*
(Convert letter grade to number) Write a program that prompts the user to enter
a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
2, 1, or 0. For other input, display invalid grade.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String letter = input.nextLine().toLowerCase();
		input.close();

		if (letter.length() == 1) {
			char letterGrade = letter.charAt(0);
			int numericGrade = 0;
			if (letterGrade != 'e' && letterGrade >= 'a' && letterGrade <= 'f') {
				switch (letterGrade) {
                    case 'a':
                        numericGrade = 4;
                        break;
                    case 'b':
                        numericGrade = 3;
                        break;
                    case 'c':
                        numericGrade = 2;
                        break;
                    case 'd':
                        numericGrade = 1;
                        break;
                    case 'f':
                        numericGrade = 0;
                        break;
                }
				System.out.println("The numeric value for the grade is " + numericGrade);
			} else {
				System.out.println("Invalid letter grade.");
			}
		} else {
			System.out.println("Invalid input.");
		}

	}

}
