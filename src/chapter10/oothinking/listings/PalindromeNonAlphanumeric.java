/* Listing 10.10 */
package chapter10.oothinking.listings;

import java.util.Scanner;

public class PalindromeNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis "
                + s + " a palindrome? " + isPalindrome(s));

    }

    private static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);

        return s2.equals(s1);
    }

    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private static String filter(String s) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                stringBuffer.append(s.charAt(i));
        }

        return stringBuffer.toString();
    }


}
