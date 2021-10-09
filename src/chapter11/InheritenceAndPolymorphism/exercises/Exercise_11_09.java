/*
(Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.)
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matrixSize = input.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < matrixSize; i++) {
            matrix.add(i, new ArrayList<Integer>());
            for (int j = 0; j < matrixSize; j++) {

                matrix.get(i).add(((int) (Math.random() * 2)));
            }
        }

        System.out.println(matrix.toString());
        int largestRow = 0;
        int largestCol = 0;

        int largestRowCount = 0;
        int largestColCount = 0;


        int i;
        int j;
        for (i = 0; i < matrixSize; i++) {
            int rowCount = 0;
            int colCount = 0;
            for (j = 0; j < matrixSize; j++) {
                int currentColElement = matrix.get(i).get(j);
                int currentRowElement = matrix.get(j).get(i);

                if (currentRowElement == 1)
                    rowCount++;
                if (currentColElement == 1)
                    colCount++;
            }
            if (rowCount > largestRowCount) {
                largestRowCount = rowCount;
                largestRow = i;
            }
            if (colCount > largestColCount) {
                largestColCount = colCount;
                largestCol = i;
            }

        }


        System.out.println("Largest col index " + largestCol);
        System.out.println("Largest row index " + largestRow);


    }
}
/* OUTPUT
4
[[0, 1, 0, 0], [0, 0, 0, 0], [0, 1, 0, 1], [1, 1, 0, 1]]
Largest col index 3
Largest row index 1
 */