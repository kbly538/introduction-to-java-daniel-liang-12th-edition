/*
(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list:
public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes at most list1.length + list2.
length comparisons. See liveexample.pearsoncmg.com/dsanimation/MergeSortNeweBook.html
for an animation of the implementation. Write a test
program that prompts the user to enter two sorted lists and displays the merged
list. Here is a sample run. Note the first number in the input indicates the number
of the elements in the list. This number is not part of the list.
*/
package chapter07.arrays1d.exercises;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_31 {
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

        System.out.println("List 1 is " + Arrays.toString(list1));
        System.out.println("List 2 is " + Arrays.toString(list2));
        System.out.println("The merged list is: " + Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (list1.length > current1 && list2.length > current2) {
            if (list1[current1] < list2[current2])
                mergedList[current3++] = list1[current1++];
            else
                mergedList[current3++] = list2[current2++];
        }

        while (list1.length > current1) {
            mergedList[current3++] = list1[current1++];
        }
        while (list2.length > current2) {
            mergedList[current3++] = list2[current2++];
        }

        return mergedList;
    }

}

/* OUTPUT
Enter list1 size and contents of first array:
5 1 5 16 61 111
Enter list2 size and contents of second array:
4 2 4 5 6
List 1 is [1, 5, 16, 61, 111]
List 2 is [2, 4, 5, 6]
The merged list is: [1, 2, 4, 5, 5, 6, 16, 61, 111]
 */