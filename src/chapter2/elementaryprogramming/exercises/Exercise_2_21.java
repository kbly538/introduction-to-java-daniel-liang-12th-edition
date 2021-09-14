/*********************************************************************************************************
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 * ******************************************************************************************************/

package chapter2.elementaryprogramming.exercises;

import java.util.Scanner;

public class Exercise_2_21 {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter annual interest rate: ");
		double yearlyInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		double futureValue = amount * Math.pow((1 + yearlyInterestRate / 1200), years  *12);
				
		System.out.println("Future value is: " + futureValue);
		
		input.close();
	}
}
