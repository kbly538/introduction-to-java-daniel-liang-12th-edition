/*
(Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.
 */
package chapter10.oothinking.exercises.Exercise_10_24;

public class MyCharacter {

    public static boolean isLetterOrDigit(char c) {
        return MyCharacter.isDigit(c)
                || MyCharacter.isLetter(c);
    }

    public static boolean isUpperCase(char c) {
        if (MyCharacter.isLetter(c))
            return c >= 65 && c <= 90;
        return false;
    }

    public static boolean isLowerCase(char c) {
        if (MyCharacter.isLetter(c))
            return (c >= 97 && c <= 122);
        return false;
    }


    public static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    public static boolean isLetter(char c) {
        return (c >= 65 && c <= 90) ||
                (c >= 97 && c <= 122);
    }

    public static int compare(char c1, char c2) {
        if (c1 > c2)
            return c1 - c2;
        else if (c1 == c2)
            return 0;
        return c1 - c2;
    }

    public static char toLowerCase(char c) {
        if (MyCharacter.isLetter(c) && MyCharacter.isUpperCase(c))
            return (char) ((int) c + 32);
        return c;
    }

    public static char toTitleCase(char c) {
        if (MyCharacter.isLetter(c) && MyCharacter.isLowerCase(c))
            return (char) ((int) c - 32);
        return c;
    }

    public static int getNumericValue(char c) {
        if (MyCharacter.isDigit(c))
            return c - 48;
        return c;
    }

    public static int valueOf(char c) {
        return c;
    }

    public static boolean isWhitespace(char c) {
        return c == ' ';
    }


}
