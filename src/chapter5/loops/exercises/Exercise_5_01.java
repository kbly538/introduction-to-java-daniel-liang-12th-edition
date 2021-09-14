/*
(Count positive and negative numbers and compute the average of numbers)
Write a program that reads an unspecified number of integers, determines how
many positive and negative values have been read, and computes the total and average
of the input values (not counting zeros). Your program ends with the input
0. Display the average as a floating-point number.
 */
package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        double sum = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double average;

        for (int number = input.nextInt(); number != 0; number = input.nextInt()) {
            sum += number;
            if (number > 0)
                positiveNumbers++;
            else
                negativeNumbers++;
        }
        average = sum / (positiveNumbers + negativeNumbers);

        if (sum == 0) {
            System.out.println("No numbers entered except 0.");
        } else {
            System.out.println("The number of positives: " + positiveNumbers);
            System.out.println("The number of negatives: " + negativeNumbers);
            System.out.println("The total: " + sum);
            System.out.println("Average " + average);
        }

    }
}
