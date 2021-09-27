/* Listing 10.1 */
package chapter10.oothinking.listings.Loan;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" +
                        "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}


/* OUTPUT
Enter annual interest rate, for example, 8.25:
2,5
Enter number of years as an integer: 5
Enter loan amount, for example, 120000.95: 1000
The loan was created on Mon Sep 27 14:43:11 EET 2021
The monthly payment is 17,75
The total payment is 1064,84
 */