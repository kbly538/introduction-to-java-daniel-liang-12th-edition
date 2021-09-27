/*********************************************************************************************************
 * (Financial application: compound value) Suppose you save $100 each month into
 * a savings account with an annual interest rate of 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and displays
 * the account value after the sixth month. (In Programming Exercise 5.30, you
 * will use a loop to simplify the code and display the account value for any month.)
 ********************************************************************************************************/
package chapter02.elementaryprogramming.exercises;

import java.util.Scanner;


public class Exercise_2_13 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the monthly saving amount: ");
			double monthlySavingAmount = input.nextDouble();
			
			double yearlyInterestRate = 5 / 100.0;
			double monthlyInterestRate = yearlyInterestRate / 12.0;
			
			double firstMonth = monthlySavingAmount * (1 + monthlyInterestRate);
			double secondMonth = (monthlySavingAmount + firstMonth) * (1 + monthlyInterestRate);
			double thirdMonth = (monthlySavingAmount + secondMonth) * (1 + monthlyInterestRate);
			double forthMonth = (monthlySavingAmount + thirdMonth) * (1 + monthlyInterestRate);
			double fifthMonth = (monthlySavingAmount + forthMonth) * (1 + monthlyInterestRate);
			double sixthMonth = (monthlySavingAmount + fifthMonth) * (1 + monthlyInterestRate);
			
			System.out.println("After the sixth month, the account value is " + sixthMonth);

			input.close();
	}
}
