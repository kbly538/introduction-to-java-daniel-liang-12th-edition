/*
(Sum integers) Write a program that passes an unspecified number of integers from
command line and displays their total.
*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum is " + sum);

    }

}

/* OUTPUT
>java chapter7.arrays1d.exercises.Exercise_07_21 1 2 3 4 5 6 7 8 9 10 11
Sum is 66

>java chapter7.arrays1d.exercises.Exercise_07_21 1 2 3 4
Sum is 10

>java chapter7.arrays1d.exercises.Exercise_07_21
Sum is 0

 */