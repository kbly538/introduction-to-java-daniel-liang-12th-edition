/*
(Reverse the numbers entered) Write a program that reads 10 integers then displays
them in the reverse of the order in which they were read.
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

/*
Enter 10 integers:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9
 */