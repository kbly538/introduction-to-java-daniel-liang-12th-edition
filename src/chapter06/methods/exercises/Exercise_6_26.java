/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313
and 757. Write a program that displays the first 100 palindromic prime numbers.
Display 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...

 */
package chapter06.methods.exercises;

public class Exercise_6_26 {
    public static void main(String[] args) {

        int matchCounter = 0;

        for (int i = 2; matchCounter < 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%5d ", i);
                matchCounter++;
                if (matchCounter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        String number = num + "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i))
                return false;
        }

        return true;

    }


}
/* OUTPUT
    2     3     5     7    11   101   131   151   181   191
  313   353   373   383   727   757   787   797   919   929
10301 10501 10601 11311 11411 12421 12721 12821 13331 13831
13931 14341 14741 15451 15551 16061 16361 16561 16661 17471
17971 18181 18481 19391 19891 19991 30103 30203 30403 30703
30803 31013 31513 32323 32423 33533 34543 34843 35053 35153
35353 35753 36263 36563 37273 37573 38083 38183 38783 39293
70207 70507 70607 71317 71917 72227 72727 73037 73237 73637
74047 74747 75557 76367 76667 77377 77477 77977 78487 78787
78887 79397 79697 79997 90709 91019 93139 93239 93739 94049
*/