/*
(Financial application: compute CD value) Suppose you put $10,000 into a CD
with an annual percentage yield of 5.75%. After one month, the CD is worth
    10000 + 10000 * 5.75 / 1200 = 10047.92
After two months, the CD is worth
    10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
After three months, the CD is worth
    10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
and so on.
Write a program that prompts the user to enter an amount (e.g., 10000), the
annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
displays a table as presented in the sample run.

Month CD Value
1     10047.92
2     10096.06
...
17    10846.57
18    10898.54
**
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount for CD: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of months: ");
        int period = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200; // e.g. 5% / 12

        System.out.printf("%-10s%-10s\n", "Month", "CD Value");
        for (int month = 1; month <= period; month++) {
            amount += (amount * monthlyInterestRate);
            System.out.printf("%-10d%-10.2f\n", month, amount);

        }


    }
}

/* OUTPUT
Enter an amount for CD: 10000
Enter annual interest rate: 5,75
Enter number of months: 18

Month     CD Value
1         10047,92
2         10096,06
3         10144,44
4         10193,05
5         10241,89
6         10290,97
7         10340,28
8         10389,82
9         10439,61
10        10489,63
11        10539,89
12        10590,40
13        10641,14
14        10692,13
15        10743,37
16        10794,84
17        10846,57
18        10898,54

Process finished with exit code 0

* */
