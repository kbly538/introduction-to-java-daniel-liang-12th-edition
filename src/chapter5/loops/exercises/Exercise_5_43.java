/*
(Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_43 {
    public static void main(String[] args) {

        int totalCombinations = 0;

        for (int i = 1; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                System.out.printf("(%d, %d), ", i, j);
                totalCombinations++;
            }
        }

        System.out.printf("\nTotal number of combinations is %d", totalCombinations);
    }
}

/* OUTPUT
(1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7), (2, 3), (2, 4), (2, 5), (2, 6), (2, 7),
(3, 4), (3, 5), (3, 6), (3, 7), (4, 5), (4, 6), (4, 7), (5, 6), (5, 7), (6, 7),
Total number of combinations is 21
*/