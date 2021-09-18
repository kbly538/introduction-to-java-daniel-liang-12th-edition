/*
(Sorted?) Write the following method that returns true if the list is already sorted
in nondecreasing order:

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not. Here is a sample run. Note that the program first prompts the
user to enter the size of the list.
*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the list: ");
        int size = input.nextInt();

        int[] list = new int[size];
        System.out.println("Enter contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("List has " + size + " integers: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        if (isSorted(list))
            System.out.println("\nList is already sorted.");
        else
            System.out.println("\nList is not sorted.");
    }

    public static boolean isSorted(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[j - 1] > list[j])
                    return false;
            }
        }

        return true;
    }

}

/* OUTPUT
Enter size of the list:
8
Enter contents of the list:
10 1 5 16 61 9 11 1
List has 8 integers:
10 1 5 16 61 9 11 1
List is not sorted.

Enter size of the list:
10
Enter contents of the list:
1 1 3 4 4 5 7 9 11 21
List has 10 integers:
1 1 3 4 4 5 7 9 11 21
List is already sorted.
 */