/*
(Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.
 */
package chapter05.loops.exercises;

public class Exercise_5_11 {
    public static void main(String[] args) {

        for (int i = 100, j = 0; i < 200; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                continue;
            }
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                j++;
                if (j % 10 == 0)
                    System.out.println();

            }
        }
    }
}