/* Listing 6.8 */
package chapter06.methods.listings;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value of the hex number is " + hex
                + " is " + hexToDecimal(hex.toUpperCase()));
    }

    private static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        } else {
            return hexChar - '0';
        }
    }
}
