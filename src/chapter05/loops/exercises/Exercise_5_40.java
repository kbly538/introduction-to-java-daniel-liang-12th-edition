/*
(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.
 */

package chapter05.loops.exercises;

public class Exercise_5_40 {
    public static void main(String[] args) {

        int numberOfFlips = 1_000_000;
        int tails = 0;
        int heads = 0;

        while (numberOfFlips > 0) {
            int flip = (int) (Math.random() * 2);
            if (flip == 0) tails++;
            else heads++;
            numberOfFlips--;
        }

        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);

    }
}

/* OUTPUT

 */