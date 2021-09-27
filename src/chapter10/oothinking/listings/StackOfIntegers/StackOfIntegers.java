/* Listing 10.8 */

package chapter10.oothinking.listings.StackOfIntegers;

public class StackOfIntegers {
    public static final int DEFAULT_CAPACITY = 16;
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }

}

