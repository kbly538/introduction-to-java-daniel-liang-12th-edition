/*
(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers in their input order and separated by exactly one space.
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 20 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);
        System.out.println(list.toString());


    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}
/* OUTPUT
Enter 20 numbers:
1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6 7 8 9 10
[1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10]
 */