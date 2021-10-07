/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter five numbers, stores them in
an array list, and displays them in increasing order.
 */
package Chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 5 ; i++) {
//            list.add(input.nextInt());
//        }

        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * 1000));
        }


        sort(list);
        System.out.println(list.toString());

    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }


    }

}
/* OUTPUT
[13, 29, 47, 66, 97, 120, 127, 130, 134, 165, 187, 191, 197, 203, 231, 246, 293, 296, 300, 303, 314, 315, 318, 322, 327, 335, 381, 383, 403, 416, 416, 430, 436, 476, 488, 517, 527, 539, 588, 601, 701, 726, 771, 776, 798, 858, 861, 884, 892, 972]
 */