/*
(Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array:
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. If there are more than one largest element, return the
smallest row index and then the smallest column index.
Write a test program that prompts the user to enter a two-dimensional array and
displays the location of the largest element in the array.
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] m = new double[rows][cols];
        System.out.println("Enter the array: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        int[] max = locateLargest(m);
        System.out.println("The location of the largest element is at (" + max[0] + ", " + max[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] max = new int[2];
        max[0] = 0;
        max[1] = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[max[0]][max[1]]) {
                    max[0] = i;
                    max[1] = j;
                }
            }
        }
        return max;
    }
}
/* OUTPUT
Enter the number of rows and columns of the array:
3 4
Enter the array:
23,5 35 2 10
4,5 3 45 3,5
35 44 5,5 9,6
The location of the largest element is at (1, 2)


Enter the number of rows and columns of the array:
4 4
Enter the array:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The location of the largest element is at (3, 3)
*/