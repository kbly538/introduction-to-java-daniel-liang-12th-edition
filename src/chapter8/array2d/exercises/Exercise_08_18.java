/*
(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
array using the following header:
public static void shuffle(int[][] m)
Write a test program that shuffles the following matrix:
int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
**
 */
package chapter8.array2d.exercises;

import utilities.ArrayOps;

import java.util.Scanner;

public class Exercise_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        ArrayOps.display2dArray(m);
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int randomIndex = (int) (Math.random() * m.length);
            int temp0 = m[i][0];
            int temp1 = m[i][1];
            m[i][0] = m[randomIndex][0];
            m[i][1] = m[randomIndex][1];
            m[randomIndex][0] = temp0;
            m[randomIndex][1] = temp1;
        }
    }
}
/* OUTPUT
Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7
Consecutive 4 on a row.

Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 5 2 1 8 2 9
6 5 6 1 1 9 1
1 5 6 1 4 0 7
3 5 3 3 4 0 7
Consecutive 4 on a column.


Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 6 2 9
6 5 6 6 1 9 1
1 3 6 1 4 0 7
3 6 3 3 4 0 7
Consecutive 4 on minor diagonal.

Enter rows and columns:
6 7
Enter matrix:
0 1 0 3 1 6 1
0 1 6 8 6 0 1
9 6 2 1 8 2 9
6 9 6 1 1 9 1
1 3 9 1 4 0 7
3 3 3 9 4 0 7
Consecutive 4 on major diagonal.


*/