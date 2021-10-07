/* Listing 12.11 */
package Chapter12.ExceptionHandlingTextIO.listings;

public class TestCircleWithCustomException extends Exception {


    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println("Number of objects created is " + CircleWithException.getNumberOfObjects());
    }
}

