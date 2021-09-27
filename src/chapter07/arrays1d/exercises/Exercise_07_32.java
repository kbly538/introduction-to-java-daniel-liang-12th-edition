/*
(Partition of a list) Write the following method that partitions the list using the
first element, called a pivot:
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so all the elements before
the pivot are less than or equal to the pivot, and the elements after the pivot are
greater than the pivot. The method returns the index where the pivot is located in
the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/
QuickSortNeweBook.html for an animation of the implementation. Write a
test program that prompts the user to enter the size of the list and the contents of
the list and displays the list after the partition.
*/
package chapter07.arrays1d.exercises;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 size and contents of first array: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Pivot is: " + partition(list1));
        System.out.println(Arrays.toString(list1));
    }

    public static int partition(int[] list) {

        int lowIndex = 1;
        int hiIndex = list.length - 1;
        int pivotIndex = 0;
        boolean x = true;
        while (x) {
            while (list[pivotIndex] >= list[lowIndex]) {
                lowIndex++;
            }
            if (list[hiIndex] <= list[lowIndex]) {
                int temp = list[lowIndex];
                list[lowIndex] = list[hiIndex];
                list[hiIndex] = temp;
            }
            while (list[hiIndex] > list[pivotIndex]) {
                hiIndex--;

            }
            if (lowIndex >= hiIndex) {
                int temp = list[pivotIndex];
                list[pivotIndex] = list[hiIndex];
                list[hiIndex] = temp;
                pivotIndex = hiIndex;
                x = false;
            }
        }
        return list[pivotIndex];
    }

}

/* OUTPUT
Enter list1 size and contents of first array:
9 10 1 5 16 61 9 11 1 12
Pivot is: 10
[9, 1, 5, 1, 10, 61, 11, 12, 16]
 */