/*
(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
            Sales Amount        Commission Rate
            $0.01–$5,000                 8%
            $5,000.01–$10,000           10%
            $10,000.01 and above        12%
Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8 + 5,000 * 10 + 15,000 * 12 = 2,700
Your goal is to earn $30,000 a year. Write a program that finds out the minimum
number of sales you have to generate in order to make $30,000.
 */

package chapter05.loops.exercises;

public class Exercise_5_39 {
    public static void main(String[] args) {

        double comissionTarget = 0;
        double totalSales = 0;

        do {
            double salesAmount = 0.01;
            if (totalSales <= 5000) comissionTarget += salesAmount * 0.08;
            else if (totalSales <= 10000) comissionTarget += salesAmount * 0.1;
            else comissionTarget += salesAmount * 0.12;

            totalSales += salesAmount;

        } while (comissionTarget <= 30000);

        System.out.printf("Total sales required to make $%.2f is $%.2f", comissionTarget, totalSales);
    }
}

/* OUTPUT
Total sales required to make $30000,00 is $252500,01
*/