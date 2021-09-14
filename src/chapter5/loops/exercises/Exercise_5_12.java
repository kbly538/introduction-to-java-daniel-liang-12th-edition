/*
(Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
integer n such that n^2 is greater than 12,000.
 */
package chapter5.loops.exercises;

public class Exercise_5_12 {
    public static void main(String[] args) {

        int n = 1;

        do {
            n++;
        } while (n * n < 12000);

        System.out.println(n);
    }
}