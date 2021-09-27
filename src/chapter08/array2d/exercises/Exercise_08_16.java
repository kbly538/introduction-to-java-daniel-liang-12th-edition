/*
(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:
public static void sort(int m[][])
The method performs a primary sort on rows, and a secondary sort on columns.
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
package chapter08.array2d.exercises;

public class Exercise_08_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort2d(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print("(");
            boolean firstTerm = true;
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + (firstTerm ? "," : ""));
                firstTerm = false;
            }
            System.out.print(")");
        }
    }

    public static void sort2d(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int[] currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin[0] > array[j][0]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            int[] currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin[1] > array[j][1] && currentMin[0] == array[j][0]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }


    }

}
/* OUTPUT
(1,1)(1,2)(1,7)(4,1)(4,2)(4,5)
*/