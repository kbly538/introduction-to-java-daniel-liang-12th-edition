/* Listing 12.9 */
package chapter12.ExceptionHandlingTextIO.listings;

public class ChainedExceptionsDemo {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("New info from method1", e);
        }
    }

    private static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}

