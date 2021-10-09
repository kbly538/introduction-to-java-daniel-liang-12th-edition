/*
(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // list1
        System.out.println("Enter 5 integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        // list2
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter 5 integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> unionList = union(list1, list2);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(unionList.toString());


    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> unionList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            unionList.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            unionList.add(list2.get(i));
        }
        return unionList;
    }
}
/* OUTPUT
Enter 5 integers for list1:
3 5 45 4 3
Enter 5 integers for list2:
33 51 5 4 13
[3, 5, 45, 4, 3, 33, 51, 5, 4, 13]
 */