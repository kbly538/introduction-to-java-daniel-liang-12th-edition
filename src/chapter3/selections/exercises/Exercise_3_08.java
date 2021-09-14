/*********************************************************************************************************
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 ********************************************************************************************************/
package chapter3.selections.exercises;

import java.util.Scanner;

/**
 * *******************************************************************************************************
 * Description: (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 *
 * @author Kubilay Bilgili | kubilay.bilgili@gmail.com
 * Local Date: 6 Eyl 2021
 * <p>
 * ******************************************************************************************************
 */
public class Exercise_3_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integer to sort in increasing order: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if (number2 > number1) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}
		if (number3 > number2) {
			int temp = number3;
			number3 = number2;
			number2 = temp;
		}
		if (number2 > number1) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}

		System.out.println(number1 + ">=" + number2 + ">=" + number3);

		input.close();
	}

}
