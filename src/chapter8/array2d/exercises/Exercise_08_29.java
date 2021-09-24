/*
(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are strictly identical.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // list1
        int[][] m1 = new int[3][3];
        System.out.println("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // List2
        int[][] m2 = new int[3][3];
        System.out.println("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are NOT identical.");
        }


    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean same = true;
        boolean found = false;
        for (int i = 0; i < m1.length; i++) {
            found = false;
            for (int j = 0; j < m1.length; j++) {
                found = false;
                for (int k = 0; k < m2.length; k++) {
                    for (int l = 0; l < m2.length; l++) {
                        if (m1[i][j] == m2[k][l]) {
                            found = true;
                            break;
                        }
                    }
                }
                if (!found)
                    return false;
            }
        }

        return true;
    }

}
/*

Enter list1:
51 25 22 6 1 4 24 54 6
Enter list2:
51 22 25 6 1 4 24 54 6
The two arrays are identical.

Enter list1:
51 22 25 6 1 4 24 54 6
Enter list2:
51 5 22 6 1 4 24 54 6
The two arrays are NOT identical.

*/