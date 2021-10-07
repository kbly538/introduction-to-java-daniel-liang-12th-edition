package chapter10.oothinking.exercises.Exercise_10_28;

public class MyStringBuilder2 {

    private String s;
    private char[] chars;

    public MyStringBuilder2() {
        this(new char[]{});
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
        for (int i = 0; i < chars.length; i++) {
            this.s += chars[i] + "";
        }
    }

    public MyStringBuilder2(String s) {
        this.s = s;
        this.chars = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] newChars = new char[this.chars.length + s.chars.length];
        System.arraycopy(this.chars, 0, newChars, 0, this.chars.length);
        newChars[newChars.length - 1] = newChars[offset];
        for (int i = offset; i < s.chars.length + offset; i++) {
            newChars[i] = s.chars[i - offset];
        }
        return new MyStringBuilder2(newChars);

    }

    public MyStringBuilder2 reverse() {
        char[] newChars = new char[this.chars.length];
        for (int i = this.chars.length - 1, j = 0; i >= 0; i--) {
            newChars[j++] = this.chars[i];
        }
        return new MyStringBuilder2(newChars);
    }

    public MyStringBuilder2 substring(int begin) {
        char[] substringChars = new char[this.chars.length - begin];
        for (int i = 0; i < substringChars.length; i++) {
            substringChars[i] = this.chars[i + begin];
        }
        return new MyStringBuilder2(substringChars);
    }

    public MyStringBuilder2 toUpperCase() {
        this.s = "";
        for (int i = 0; i < this.chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
            this.s += chars[i] + "";
        }
        return new MyStringBuilder2(this.s);
    }

    @Override
    public String toString() {
        this.s = "";
        for (int i = 0; i < this.chars.length; i++) {
            if (chars[i] != ' ') {
                this.s += chars[i] + "";
            }
        }
        return s;
    }
}
