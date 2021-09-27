/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in an increasing order. For example, if the input
integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();

        for (int i = 2; number > 1; ) {
            if (number % i == 0) {
                number = number / i;
                System.out.print(i + " ");
            } else
                i++;
        }


    }
}