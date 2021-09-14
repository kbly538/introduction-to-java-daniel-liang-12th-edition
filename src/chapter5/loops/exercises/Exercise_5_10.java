/*
(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are
separated by exactly one space.
 */
package chapter5.loops.exercises;

public class Exercise_5_10 {
    public static void main(String[] args) {

        for (int i = 100, j = 0; i < 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                j++;
                if (j % 10 == 0)
                    System.out.println();
            }
        }
    }
}