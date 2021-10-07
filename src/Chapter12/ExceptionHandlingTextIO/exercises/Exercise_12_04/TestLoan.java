/* (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
throw IllegalArgumentException if the loan amount, interest rate, or
number of years is less than or equal to zero.*/
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_04;


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
5
Enter number of years as an integer: -2
Enter loan amount, for example, 120000.95: 100000
Exception in thread "main" java.lang.IllegalArgumentException: Interest rate, number of years and loan amount cannot be smaller than 0.
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_04.Loan.<init>(Loan.java:20)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_04.TestLoan.main(TestLoan.java:22)
 */