/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05 / 12 = 0.00417. After the first month, the value in the
account becomes
    100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 5), and the number of months (e.g., 6) then displays the
amount in the savings account after the given month.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of months: ");
        int period = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200; // e.g. 5% / 12
        double savings = 0;

        for (int month = 0; month < period; month++) {
            savings = ((amount + savings) * (1 + monthlyInterestRate));


        }

        System.out.printf("Amount in the savings account after %d months: %.3f", period, savings);
    }
}

/* OUTPUT
Enter an amount: 100
Enter annual interest rate: 5
Enter number of months: 3
Amount in the savings account after 3 months: 302,507
* */
