/*
(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers:
public static void shuffle(ArrayList<Integer> list)
 */
package Chapter11.InheritenceAndPolymorphism.exercises;

import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Circle;
import chapter10.oothinking.exercises.Exercise_10_14.MyDate;
import chapter10.oothinking.listings.Loan.Loan;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_07 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());

    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
    }
}


/* OUTPUT
Enter 10 numbers:
1 2 3 4 5 6 7 8 9 6
[1, 2, 3, 4, 5, 6, 7, 8, 9, 6]
[5, 1, 3, 8, 9, 2, 6, 6, 7, 4]

 */