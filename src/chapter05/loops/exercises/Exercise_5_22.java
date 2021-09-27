/*
(Financial application: loan amortization schedule) The monthly payment for a given
loan pays the principal and the interest. The monthly interest is computed by multiplying
the monthly interest rate and the balance (the remaining principal). The principal
paid for the month is therefore the monthly payment minus the monthly interest. Write
a program that lets the user enter the loan amount, number of years, and interest rate
then displays the amortization schedule for the loan.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loan amount
        System.out.println("Enter loan amount: ");
        double balance = input.nextDouble();

        // Loan Period in years
        System.out.println("Enter loan period in number of years: ");
        int loanPeriod = input.nextInt();

        // Yearly interest rate
        double interestRate = 26.52;
        // Monthly Interest Rate
        double monthlyInterestRate = interestRate / 1200;

        // Monthly and yearly payments
        double monthlyPayment = balance * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanPeriod * 12));


        int paymentNo = 0;
        int remaningMonths = loanPeriod * 12;
        // Header row
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Payment#", "Interest", "Principal", "Balance");
        while (paymentNo < remaningMonths) {

            // Monthly Interest
            double mothlyInterest = balance * monthlyInterestRate;

            //principal paid for month
            double principalPaidForMonth = monthlyPayment - mothlyInterest;

            balance -= principalPaidForMonth;
            paymentNo++;
            System.out.printf("%-20d%-20.3f%-20.2f%-20.2f\n", paymentNo, mothlyInterest, principalPaidForMonth, balance);

        }

    }
}

