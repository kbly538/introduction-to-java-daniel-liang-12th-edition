/*
(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0 and invokes this method to return the largest number in the input.
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers(Input ends with 0): ");

        ArrayList<Integer> list = new ArrayList<>();
        int number;
        do {
            number = input.nextInt();
            list.add(number);
        } while (number != 0);

        System.out.println("Max value in the list is: " + max(list));

    }

    public static Integer max(ArrayList<Integer> list) {

        if (list.isEmpty())
            return null;

        Integer maxVal = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxVal < list.get(i)) {
                maxVal = list.get(i);
            }
        }
        return maxVal;
    }
}


/* OUTPUT
Enter numbers(Input ends with 0):
7 9 123 6123 1293 71226 371 721312 25226262 6  5 52 2 8 1 8 2 26 2 2 3 0
Max value in the list is: 25226262
 */