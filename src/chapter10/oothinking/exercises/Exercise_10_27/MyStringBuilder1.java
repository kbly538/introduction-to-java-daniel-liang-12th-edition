package chapter10.oothinking.exercises.Exercise_10_27;

public class MyStringBuilder1 {

    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s += s.s;
        return this;
    }

    public MyStringBuilder1 append(int i) {
        this.s += i;
        return this;
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        char[] chars = s.toCharArray();
        return chars[index];
    }

    public MyStringBuilder1 toLowerCase() {
        this.s = this.s.toLowerCase();
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        return new MyStringBuilder1(this.s.substring(begin, end));
    }

    public String toString() {
        return this.s;
    }

}
