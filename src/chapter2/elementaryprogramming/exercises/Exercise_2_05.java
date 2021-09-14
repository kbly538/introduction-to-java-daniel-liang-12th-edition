/*********************************************************************************************************
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.
 ********************************************************************************************************/
package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble() / 100;

		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

		input.close();
	}
}
