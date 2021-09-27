/*
(Financial application: find the sales amount) Rewrite Programming Exercise
5.39 as follows:
■■ Use a for loop instead of a do-while loop.
■■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter commission sought: ");
        double COMMISSION_SOUGHT = input.nextDouble();
        double totalSales = 0;

        for (double saleAmount = 0, commissionEarned = 0; commissionEarned <= COMMISSION_SOUGHT; saleAmount += 0.01) {
            totalSales += saleAmount;
            if (totalSales <= 5000) {
                commissionEarned += saleAmount * 0.08;
            } else if (totalSales <= 10000) {
                commissionEarned += saleAmount * 0.1;
            } else {
                commissionEarned += saleAmount * 0.12;
            }
        }

        System.out.println(totalSales);
    }
}

/* OUTPUT
Total sales required to make $30000,00 is $252500,01
*/