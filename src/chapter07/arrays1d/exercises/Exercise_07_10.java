/*
(Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the index of the smallest element, and displays the index.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("Smallest value in the list is " + indexOfSmallestElement(numbers));

    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}

/*
Enter 10 numbers:
1,9 2,5 3,7 2 1,5 6 3 4 5 2
Smallest value in the list is 4
 */