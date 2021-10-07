/*
(ArrayIndexOutOfBoundsException) Write a program that meets the
following
requirements:
■■ Creates an array with 100 randomly chosen integers.
■■ Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message "Out of Bounds".
 */
package Chapter12.ExceptionHandlingTextIO.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12_03 {
    public static void main(String[] args) {

        int[] randomNumbers = new int[100];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index to see the element: ");
        int index = input.nextInt();
        try {
            System.out.println(randomNumbers[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds.");
        }
    }
}

/* OUTPUT
Enter the index to see the element:
101
Out of bounds.


Enter the index to see the element:
12
1
 */