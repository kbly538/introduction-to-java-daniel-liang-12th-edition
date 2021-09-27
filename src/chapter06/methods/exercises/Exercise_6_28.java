/*
(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p … 31 and displays the output as follows:
p 2^p – 1
2 3
3 7
5 31
...
 */
package chapter06.methods.exercises;

public class Exercise_6_28 {
    public static void main(String[] args) {

        System.out.printf("%5s%5s%5s\n", "p", " ", "p^2-1");
        for (int i = 2; i <= 31; i++) {
            if (isMersennePrime(i)) {
                System.out.printf("%5d%5s%-5d\n", i, " ", (int) (Math.pow(2, i) - 1));
            }
        }
    }


    public static boolean isPrime(long number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isMersennePrime(long num) {
        long mersenneForm = (long) Math.pow(2, num) - 1;

        if (isPrime(num) && isPrime(mersenneForm))
            return true;

        return false;
    }


}
/* OUTPUT
    p     p^2-1
    2     3
    3     7
    5     31
    7     127
   13     8191
   17     131071
   19     524287
   31     2147483647
*/