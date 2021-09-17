/*
(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("Smallest value in the list is " + min(numbers));

    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}

/*
Enter 10 numbers:
1,9 2,5 3,7 2 1,5 6 3 4 5 2
Smallest value in the list is 1.5
 */