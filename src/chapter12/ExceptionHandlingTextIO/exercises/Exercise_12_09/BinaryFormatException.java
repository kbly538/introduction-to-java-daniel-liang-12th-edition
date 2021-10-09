package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09;

public class BinaryFormatException extends Throwable {

    private final String binaryString;

    public BinaryFormatException(String binaryString) {
        super(binaryString + " is not a binary number");
        this.binaryString = binaryString;
    }

    public String binaryString() {
        return binaryString;
    }
}
