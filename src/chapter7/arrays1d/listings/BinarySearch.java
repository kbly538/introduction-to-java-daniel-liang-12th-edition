/* Listing 7.7 */
package chapter7.arrays1d.listings;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] list = {12, 14, 17, 1, 2, 3, 4, 23};
        Arrays.sort(list);
        System.out.println(binarySearch(list, -3));
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;

        }
        return -low - 1;
    }
}
