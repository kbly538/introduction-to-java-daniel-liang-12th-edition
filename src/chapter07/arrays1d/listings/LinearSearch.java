/* Listing 7.6 */
package chapter07.arrays1d.listings;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, 3, 6, 2, -12};
        int i = linearSearch(list, 2); // Returns 3
        int j = linearSearch(list, 4); // Returns 1
        int k = linearSearch(list, 17); // Returns -1
        int z = linearSearch(list, -12); // Return 8
        System.out.println(i + " " + j + " " + k + " " + z);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
