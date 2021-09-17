/*
(Statistics: compute deviation) Programming Exercise 5.45 computes the standard
deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers.

To compute the standard deviation with this formula, you have to store the individual
numbers using an array, so they can be used after the mean is obtained.
Your program should contain the following methods:

/** Compute the deviation of double values
public static double deviation(double[] x)

/** Compute the mean of an array of double values
public static double mean(double[] x)

Write a test program that prompts the user to enter 10 numbers and displays the
mean and standard deviation
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        double[] x = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
        }

        System.out.println("Mean is " + mean(x));
        System.out.println("Standart deviation is : " + deviation(x));

    }

    /**
     * Compute the deviation of double values
     */
    public static double deviation(double[] x) {
        double squaredSum = 0;
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            squaredSum += (x[i] * x[i]);
            sum += x[i];
        }
        return Math.sqrt((squaredSum - (Math.pow(sum, 2) / x.length)) / (x.length - 1));
    }

    /**
     * Compute the mean of an array of double values
     */
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];
        return sum / x.length;
    }
}

/*
Enter 10 numbers:
1,9 2,5 3,7 2 1,5 6 3 4 5 2
Smallest value in the list is 4
 */