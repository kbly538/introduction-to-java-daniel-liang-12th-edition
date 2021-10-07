/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
 */
package chapter10.oothinking.exercises.Exercise_10_22;

public class MyString1 {

    private char[] chars;
    private String str;

    public MyString1(char[] chars) {
        this.chars = chars;
        str = toString();
    }

    public static MyString1 valueOf(int i) {
        int order = 0;
        int temp = i;
        while (temp > 0) {
            temp = temp / 10;
            order++;
        }
        char[] intChars = new char[order];

        for (int j = intChars.length - 1; j >= 0; j--) {
            intChars[j] = (char) ((i % 10) + 48);
            i /= 10;
        }
        return new MyString1(intChars);
    }

    public char charAt(int index) {
        if (index < -1 || index > this.length()) {
            System.out.println("Out of bounds.");
        } else if (index == -1) {
            return chars[length() - 1];
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] substringChars = new char[end - begin];
        for (int i = begin, index = 0; i < end; i++, index++) {
            substringChars[index] = this.chars[i];
        }
        return new MyString1(substringChars);
    }

    public MyString1 toLowerCase() {
        char[] lowercaseChars = new char[length()];
        for (int i = 0; i < length(); i++) {
            if ((int) chars[i] >= 65 && (int) chars[i] <= 90) {
                int ascii = (int) chars[i] + 32;
                lowercaseChars[i] = (char) ascii;
            } else {
                lowercaseChars[i] = chars[i];
            }
        }
        return new MyString1(lowercaseChars);
    }

    public boolean equals(MyString1 s) {
        for (int i = 0; i < length(); i++) {
            if (this.chars[i] != s.chars[i])
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        this.str = "";
        for (int i = 0; i < chars.length; i++) {
            str += this.charAt(i);
        }
        return str;
    }
}
