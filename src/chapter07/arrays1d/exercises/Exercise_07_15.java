/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in 10 integers, invokes the method, and displays
the distinct numbers separated by exactly one space.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        System.out.println("Enter 10 numbers");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] distintNumbers = eliminateDuplicates(list);

        System.out.println("Distinct nmumbers are: ");
        for (int i = 0; i < list.length; i++) {
            if (distintNumbers[i] != 0) {
                System.out.print(distintNumbers[i] + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {

        int[] distinctNumbers = new int[list.length];
        boolean isDuplicate = false;

        for (int i = 0; i < list.length; i++) {
            isDuplicate = false; // reset flag

            for (int j = 0; j < distinctNumbers.length; j++) {
                // check if is already in distinct number list
                if (list[i] == distinctNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // if no duplicates found after inner loop add number to the list
            if (isDuplicate == false) {
                distinctNumbers[i] = list[i];
            }
        }
        return distinctNumbers;
    }
}

/* OUTPUT
Enter 10 numbers
1 2 3 2 1 6 3 4 5 2
Distinct nmumbers are:
1 2 3 6 4 5
 */