/* Listing 7.3 */
package chapter07.arrays1d.listings;

public class TestPassArray {
    public static void main(String[] args) {
        int[] a = {1, 2};

        System.out.println("Before invoking swap");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking the swap");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before invoking swapTwoFirstInArray");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapTwoFirstInArray");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
    }

    private static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    private static void swapFirstTwoInArray(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
