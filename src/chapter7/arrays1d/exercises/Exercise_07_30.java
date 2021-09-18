/*
(Pattern recognition: consecutive four equal numbers) Write the following method
that tests whether the array has four consecutive numbers with the same value:

public static boolean isConsecutiveFour(int[] values)

Write a test program that prompts the user to enter a series of integers and displays
it if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series.
*/
package chapter7.arrays1d.exercises;


import java.util.Scanner;

public class Exercise_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of value: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(isConsecutiveFour(numbers));
    }

    public static boolean isConsecutiveFour(int[] values) {
        boolean consecutiveFour = false;
        for (int i = 0; i < values.length; i++) {
            if (i + 3 <= values.length) {
                for (int j = i; j < i + 3; j++) {
                    if (values[j] != values[j + 1]) {
                        consecutiveFour = false;
                        break;
                    }
                    consecutiveFour = true;
                }
            }
            if (consecutiveFour == true) {
                return true;
            }
        }

        return false;
    }

}

/* OUTPUT
Enter the number of value:
4 3 3 3 2
false

Enter the number of value:
5
5 3 3 3 3
true
 */