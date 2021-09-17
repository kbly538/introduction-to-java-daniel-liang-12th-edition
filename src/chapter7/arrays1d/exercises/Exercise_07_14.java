/*
(Compute gcd) Write a method that returns the gcd of an unspecified number of
integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        boolean allDivisible = true;
        int gcd = 0;
        int k = 2;
        int smallestNumber = min(numbers);
        while (k <= smallestNumber) {
            allDivisible = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % k != 0) {
                    allDivisible = false;
                    break;
                }
            }
            if (allDivisible) {
                gcd = k;
                k++;
            }

            k++;
        }
        return gcd;
    }

    public static int min(int[] list) {
        int smallestNumber = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < smallestNumber)
                smallestNumber = list[i];
        }
        return smallestNumber;
    }
}

/* OUTPUT
Enter 5 numbers
10 20 30 40 50
Greatest common divisor is 10
 */