/*
(Summation) Write a program to compute the following summation:
1 / (1 + sqrt(2)) + 1 / (sqrt(2)+sqrt(3)) +  ....... + 1 / (sqrt(624) + sqrt(625))
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_35 {
    public static void main(String[] args) {

        int denominator1 = 1;
        int denominator2 = 2;
        double sum = 0;

        while (denominator2 <= 625) {
            sum += 1 / (Math.sqrt(denominator1) + Math.sqrt(denominator2));

            denominator1++;
            denominator2++;
        }
        System.out.println("The sum is: " + sum);
    }
}

/* OUTPUT
The sum is: 24.00000000000001
*/