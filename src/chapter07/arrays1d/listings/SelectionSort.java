/* Listing 7.8 */
package chapter07.arrays1d.listings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {5, 3, 2, 1, 7, 2, 9, 3};
        selectionSort(list);
        System.out.printf(Arrays.toString(list));
    }

    public static void selectionSort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
