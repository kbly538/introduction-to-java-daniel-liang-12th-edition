/*
(Revise selection sort) In Listing 7.8, you used selection sort to sort an array. The
selection-sort method repeatedly finds the smallest number in the current array
and swaps it with the first. Rewrite this program by finding the largest number and
swapping it with the last. Write a test program that reads in 10 double numbers,
invokes the method, and displays the sorted numbers.
*/
package chapter07.arrays1d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the list: ");
        int size = input.nextInt();

        double[] list = new double[size];
        System.out.println("Enter contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextDouble();
        }

        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = list.length - 1; j >= i; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }

    }

}

/* OUTPUT
Enter size of the list:
10
Enter contents of the list:
10 9 8 7 6 5 4 32 1 0
[32.0, 10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 1.0, 0.0]
 */