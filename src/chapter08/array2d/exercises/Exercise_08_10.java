/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s.
 */
package chapter08.array2d.exercises;

public class Exercise_08_10 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 2);
            }
        }

        int largestRow = 0;
        int largestCol = 0;

        int largestRowIndex = 0;
        int largestColIndex = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++) {
            int currentRowTotal = 0;
            int currentColTotal = 0;

            for (int j = 0; j < m.length; j++) {
                currentRowTotal += m[i][j];
                currentColTotal += m[j][i];
            }
            if (currentRowTotal > largestRow) {
                largestRow = currentRowTotal;
                largestRowIndex = i;
            }
            if (currentColTotal > largestCol) {
                largestCol = currentColTotal;
                largestColIndex = i;
            }
        }


        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColIndex);


    }
}
/* OUTPUT
1 0 1 1
0 0 0 0
0 0 1 0
1 0 0 1
The largest row index: 0
The largest column index: 0

0 0 1 0
0 0 0 0
1 1 1 0
0 1 0 0
The largest row index: 2
The largest column index: 1

1 0 0 1
1 0 0 0
0 0 0 0
1 1 0 1
The largest row index: 3
The largest column index: 0
*/