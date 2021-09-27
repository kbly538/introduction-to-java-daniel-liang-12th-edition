/*
(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years,
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        // Loan Period in years
        System.out.println("Enter loan period in number of years: ");
        int loanPeriod = input.nextInt();

        // Initial interest rate
        double interestRate = 5;
        double inrestRateIncrements = 0.125;

        // Header row
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        while (interestRate <= 8) {
            // Monthly Interest Rate
            double monthlyInterestRate = interestRate / 1200;

            // Monthly and yearly payments
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanPeriod * 12));
            double totalPayment = monthlyPayment * loanPeriod * 12;

            System.out.printf("%-20.3f%-20.2f%-20.2f\n", interestRate, monthlyPayment, totalPayment);
            interestRate += inrestRateIncrements;
        }

    }
}

