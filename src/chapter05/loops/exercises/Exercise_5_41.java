/*
(Occurrence of max numbers) Write a program that reads integers, finds the largest
of them, and counts its occurrences. Assume the input ends with number 0.
Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and
the occurrence count for 5 is 4. If no input is entered, display "No numbers are
entered except 0".
(Hint: Maintain two variables, max and count. max stores the current max
number and count stores its occurrences. Initially, assign the first number to
max and 1 to count. Compare each subsequent number with max. If the number
is greater than max, assign it to max and reset count to 1. If the number is
equal to max, increment count by 1.)
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = input.nextInt();
        int maxNumber = 0;
        int maxNumberCounter = 0;

        do {
            if (number > maxNumber) {
                maxNumberCounter = 0;
                maxNumber = number;
            }
            if (number == maxNumber) {
                maxNumberCounter++;
            }
            number = input.nextInt();
        } while (number != 0);

        System.out.printf("The largest number is %d\n" +
                "The occurence count of the largest number is %d", maxNumber, maxNumberCounter);
    }
}

/* OUTPUT
5 8 9 8 8 8 8 7 9 9 4 4 6 5 9 2 1 9 0
The largest number is 9
The occurence count of the largest number is 5
*/