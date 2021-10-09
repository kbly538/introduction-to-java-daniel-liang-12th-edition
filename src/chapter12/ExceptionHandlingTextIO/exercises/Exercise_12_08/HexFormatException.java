package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08;

public class HexFormatException extends Throwable {

    private final char hexChar;

    public HexFormatException(char hexChar) {
        super(hexChar + " is not a hex number.");
        this.hexChar = hexChar;
    }

    public char getHexNumber() {
        return hexChar;
    }
}
