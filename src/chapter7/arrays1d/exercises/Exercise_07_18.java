/*
(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The
bubble-
sort algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are
swapped; otherwise, the values remain unchanged. The technique is called a bubble
sort or sinking sort because the smaller values gradually “bubble” their way to
the top, and the larger values “sink” to the bottom. Write a test program that reads
in 10 double numbers, invokes the method, and displays the sorted numbers.
*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;

public class Exercise_07_18 {
    public static void main(String[] args) {

        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 20);
        }


        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(int[] list) {
        boolean isSorted = false;
        int i = 0;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            counter++;
            for (i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted != true)
                i = 0;
        }
        System.out.println(counter + " passes");
    }

}

/* OUTPUT
10 passes
[27, 93, 95, 213, 220, 518, 580, 753, 774, 953, 1016, 1137, 1156, 1352, 1374, 1464, 1466, 1920, 1935, 1944]

14 passes
[1, 2, 3, 3, 4, 4, 5, 6, 9, 10, 10, 13, 14, 16, 16, 17, 17, 18, 18, 19]
 */