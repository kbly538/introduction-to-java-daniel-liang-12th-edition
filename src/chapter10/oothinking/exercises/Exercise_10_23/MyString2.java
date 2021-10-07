/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 */
package chapter10.oothinking.exercises.Exercise_10_23;

public class MyString2 {

    private char[] chars;
    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(b == true ? "1" : "0");
    }

    public int compare(String s) {
        if (this.s.length() == s.length())
            return 0;
        else if (this.s.length() > s.length())
            return 1;

        return -1;
    }

    public MyString2 substring(int begin) {
        return new MyString2(s.substring(begin));
    }

    public MyString2 toUpperCase() {
        return new MyString2(this.s.toUpperCase());
    }

    public char[] toChars() {
        return this.s.toCharArray();
    }

    @Override
    public String toString() {
        return s;
    }
}
