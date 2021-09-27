/*
(Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
integer n such that n^3 is less than 12,000.
 */
package chapter05.loops.exercises;

public class Exercise_5_13 {
    public static void main(String[] args) {

        int n = 1;

        do {
            n++;
        } while (n * n * n < 12000);

        System.out.println(n);
    }
}