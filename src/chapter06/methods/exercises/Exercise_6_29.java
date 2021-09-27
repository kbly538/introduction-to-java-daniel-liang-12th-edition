/*
(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
twin primes. Write a program to find all twin primes less than 1,000. Display the
output as follows:
(3, 5)
(5, 7)
...
 */
package chapter06.methods.exercises;

public class Exercise_6_29 {
    public static void main(String[] args) {

        for (int i = 2; i < 1000 / 2; i++) {
            if (isTwinPrime(i)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
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

    public static boolean isTwinPrime(long num) {
        if (isPrime(num) && isPrime(num + 2)) {
            return true;
        }
        return false;
    }


}
/* OUTPUT
(3, 5)
(5, 7)
(11, 13)
(17, 19)
(29, 31)
(41, 43)
(59, 61)
(71, 73)
(101, 103)
(107, 109)
(137, 139)
(149, 151)
(179, 181)
(191, 193)
(197, 199)
(227, 229)
(239, 241)
(269, 271)
(281, 283)
(311, 313)
(347, 349)
(419, 421)
(431, 433)
(461, 463)
*/