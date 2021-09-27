/*
(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers, and later use them to check
whether they are possible divisors for n.
*/
package chapter07.arrays1d.exercises;

public class Exercise_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int PRIMES_PER_LINE = 10;

        for (int i = 2, counter = 0; counter < NUMBER_OF_PRIMES; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                counter++;
                if (counter % PRIMES_PER_LINE == 0)
                    System.out.println();
            }

        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

/*
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229
 */