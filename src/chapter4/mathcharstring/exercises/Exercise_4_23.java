/*
(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String employeeName = input.next();

        System.out.println("Enter number of hours worked in a week: ");
        int weeklyHoursWorked = input.nextInt();

        System.out.println("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        input.close();

        double grossPay = weeklyHoursWorked * hourlyPayRate;

        System.out.println("Employee name: " + employeeName);
        System.out.println("Hours worked: " + weeklyHoursWorked);
        System.out.println("Hourly pay rate: " + hourlyPayRate);
        System.out.println("Deductions: ");
        System.out.println("	Federal tax: " + grossPay * federalTax);
        System.out.println("	State withholding: " + grossPay * stateTax);
        System.out.println("	Total Deduction: " + (grossPay * federalTax + grossPay * stateTax));
        System.out.println("Net pay: " + (grossPay - grossPay * federalTax - grossPay * stateTax));

    }
}
