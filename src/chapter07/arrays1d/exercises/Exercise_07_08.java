/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:

public static double average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter 10 integers, invokes the first
method, then displays the average value; prompts the user to enter 10 double
values, invokes the second method, then displays the average value.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] integerList = new int[10];

        System.out.println("Enter 10 integers ");
        for (int i = 0; i < integerList.length; i++) {
            integerList[i] = input.nextInt();
        }

        double[] doubleList = new double[10];

        System.out.println("Enter 10 doubles: ");
        for (int i = 0; i < doubleList.length; i++) {
            doubleList[i] = input.nextDouble();
        }

        System.out.println("Integer list avg: " + average(integerList));
        System.out.println("Double list avg: " + average(doubleList));


    }

    public static double average(int[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += i;
        }
        return total / array.length;
    }

    public static double average(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += i;
        }
        return total / array.length;
    }

}

/*
Enter 10 integers
1 2 3 4 5 6 7 8 9 0
Enter 10 doubles:
1 2 3 4 5 6 7 8 9 0
Integer list avg: 4.5
Double list avg: 4.5
 */