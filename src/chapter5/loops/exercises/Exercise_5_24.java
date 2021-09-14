/*
(Sum a series) Write a program to compute the following summation:
1/3 + 3/5 + 5/7 +........95/97 + 97/99
 */

package chapter5.loops.exercises;

public class Exercise_5_24 {
    public static void main(String[] args) {

        double denominator = 1, numerator;
        double result = 0;

        while (denominator <= 99) {

            numerator = denominator;

            denominator = numerator + 2;

            result += (numerator / denominator);

        }

        System.out.println(result);

    }
}

