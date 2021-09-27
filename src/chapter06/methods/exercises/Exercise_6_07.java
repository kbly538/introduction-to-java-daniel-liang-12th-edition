/*
(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years. The future investment is determined using the formula in Programming
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate,int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1,000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30
 */
package chapter06.methods.exercises;

import java.util.Scanner;

public class Exercise_6_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double yearlyInterestRate = input.nextDouble();


        System.out.printf("%-10s%-10s\n", "Years", "Future Value");
        for (int i = 1; i <= 30 ; i++) {
            System.out.printf("%-10d%-10.2f\n", i, futureInvestmentValue(amount,
                    yearlyInterestRate / 1200, i));
        }

    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate,int years){
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }

}

/* OUTPUT
Enter investment amount:
3000
Enter annual interest rate:
5,5
Years     Future Value
1         3169,22
2         3347,99
3         3536,85

    .
    .
    .

29        14731,21
30        15562,16
*/