/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use
this method to find the number of prime numbers less than 10000.

 */
package chapter6.methods.exercises;

import chapter6.methods.listings.PrimeNumberMethod;

public class Exercise_6_10 {
    public static void main(String[] args) {

        System.out.println("Prime numbers less than 10000 are: ");
        for (int i = 2; i < 10000 ; i++) {
            if (PrimeNumberMethod.isPrime(i))
                System.out.printf("%6d", i);
        }
    }
}

/* OUTPUT

Prime numbers less than 10000 are:
     2     3     5     7    11    13    17    19    23    29    31    37
     41    43    47    53    59    61    67    71    73    79    83    89
     . . .
    9781  9787  9791  9803  9811  9817  9829  9833  9839  9851  9857  9859
    9871  9883  9887  9901  9907  9923  9929  9931  9941  9949  9967  9973
    9871  9883  9887  9901  9907  9923  9929  9931  9941  9949  9967  9973
*/