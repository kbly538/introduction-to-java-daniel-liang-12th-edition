/*
(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter 10 numbers and displays the
mean and standard deviations of these numbers.
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_45 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        final int NUMBER_OF_TERMS = 10;
        double sum = 0;
        double squaredSum = 0;


        for (int i = 0; i < NUMBER_OF_TERMS; i++) {
            double number = input.nextDouble();
            sum += number;
            squaredSum += (number * number);

        }

        double mean = sum / NUMBER_OF_TERMS;
        double deviation = Math.sqrt((squaredSum - (Math.pow(sum, 2) / NUMBER_OF_TERMS)) / (NUMBER_OF_TERMS - 1));

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standart deviation is %.5f", deviation);
    }
}

/* OUTPUT
Enter 10 numbers: 10 12 45 7 8 5,4 7,8 9 2 10
The mean is 11,62
The standart deviation is 12,04969
*/