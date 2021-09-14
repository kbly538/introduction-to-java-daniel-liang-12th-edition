/*
(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The
first character indicates the major and the second is a number character 1, 2, 3, or
4, which indicates whether a student is a freshman, sophomore, junior, or senior.
Suppose that the following characters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
 */
package chapter4.mathcharstring.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_4_18 {

	public static void main(String[] args) {

		int numberOfParams = 2;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter status: ");
		String status = input.nextLine().toUpperCase();

		String majorName = "";
		String yearName = "";

		if (status.length() == numberOfParams) {
			char major = status.charAt(0);
			char year = status.charAt(1);
			switch (major) {
                case 'M':
                    majorName = "Mathematics";
                    break;
                case 'C':
                    majorName = "Computer Science";
                    break;
                case 'I':
                    majorName = "Information Technology";
                    break;
                default:
                    System.out.println("Invalid Input for major.");
            }

			switch (year) {
                case '1':
                    yearName = "Freshman";
                    break;
                case '2':
                    yearName = "Sophomore";
                    break;
                case '3':
                    yearName = "Junior";
                    break;
                case '4':
                    yearName = "Senior";
                    break;
                default:
                    System.out.println("Invalid Input for year.");
            }

			System.out.println(majorName + " " + yearName);

		} else {
			System.out.println("Unrecognized status.");
		}
	}
}
