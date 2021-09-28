/* Listing 6.5 */
package chapter06.methods.listings;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1
                + " and num2 is " + num2);

        // Invoke the swap method and attempt to swap variables
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1
                + " and num2 is " + num2);
    }

    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1
                + " and n2 is " + n2);

        // swap n1 and n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1
                + " n2 is " + n2);
    }
}