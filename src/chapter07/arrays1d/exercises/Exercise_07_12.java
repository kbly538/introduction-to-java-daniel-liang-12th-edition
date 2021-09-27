/*
(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying
it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter 10 numbers, invokes the method to reverse the numbers, and displays the
numbers.
*/
package chapter07.arrays1d.exercises;

import java.util.Arrays;

public class Exercise_07_12 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        reverse(list);
        System.out.println(Arrays.toString(list));
    }

    public static void reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[list.length - 1 - i];
            list[list.length - 1 - i] = list[i];
            list[i] = temp;
        }
    }
}

/* OUTPUT
[0, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 */