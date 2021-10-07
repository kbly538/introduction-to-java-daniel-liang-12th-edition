package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return super.get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public void push(Object o) {
        super.add(o);
    }

    public int search(Object o) {
        return super.indexOf(o);
    }

    public String toString() {
        return "Stack: " + super.toString();
    }
}
