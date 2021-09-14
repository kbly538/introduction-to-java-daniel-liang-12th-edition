/*********************************************************************************************************
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly
 * payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate
 * and displays the interest for the next month
 * *******************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_20 {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate ( e.g. 4 for 3% ) :");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest  = balance * interestRate / 1200;
		
		System.out.println("The interest is: " + interest);
		
		input.close();
	}
}
