/*
(Identical arrays) The arrays list1 and list2 are identical if they have the same
contents. Write a method that returns true if list1 and list2 are identical,
using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays
whether the two are identical. Here are the sample runs. Note the first number
in the input for each list indicates the number of the elements in the list. This
number is not part of the list.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 size and contents of first array: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2 size and contents of second array: ");
        int list2Size = input.nextInt();
        int[] list2 = new int[list2Size];
        for (int i = 0; i < list2Size; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not  identical");
        }


    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean notPresent = true;
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            notPresent = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    notPresent = false;
            }
            if (notPresent) {
                return false;
            }
        }
        return true;
    }
}

/* OUTPUT
Enter list1 size and contents of first array:
4 1 2 3 4
Enter list2 size and contents of second array:
4 4 3 2 1
Two lists are identical
 */