/*
(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(
100) method.
*/
package chapter09.ObjectsAndClasses.exercises;

import java.util.Random;

public class Exercise_09_04 {
    public static void main(String[] args) {

        Random randomInt = new Random(1000);
        for (int i = 1; i < 51; i++) {
            System.out.print(randomInt.nextInt(100) + " ");
            if (i % 10 == 0)
                System.out.println();
        }
    }
}

/* OUTPUT
87 35 76 24 92 49 41 45 64 50
79 59 72 83 36 75 46 2 23 41
22 71 89 2 93 42 49 42 35 76
32 0 52 95 87 31 99 18 79 2
91 5 55 84 71 95 58 87 77 38
 */