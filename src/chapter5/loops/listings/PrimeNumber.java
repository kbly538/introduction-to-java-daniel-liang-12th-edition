/* Listing 5.15 */
package chapter5.loops.listings;

public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;


        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }


    }

}
