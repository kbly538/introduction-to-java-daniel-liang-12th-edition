/*
(Math: The Complex class) A complex number is a number in the form a + bi,
where a and b are real numbers and i is 2-1. The numbers a and b are known
as the real part and imaginary part of the complex number, respectively. You can
perform addition, subtraction, multiplication, and division for complex numbers.
(A complex number can be interpreted as a point on a plane by identifying the
(a,b) values as the coordinates of the point. The absolute value of the complex
number corresponds to the distance of the point to the origin, as shown
in Figure 13.10.)
Design a class named Complex for representing complex numbers and the
methods add, subtract,
multiply, divide, and abs for performing complexnumber
operations, and override toString method for returning a string representation
for a complex number. The toString method returns (a + bi) as a
string. If b is 0, it simply returns a. Your Complex class should also implement
Cloneable and Comparable. Compare two complex numbers using their absolute
values.
Provide three constructors Complex(a, b), Complex(a), and Complex().
Complex() creates a Complex object for number 0, and Complex(a) creates
a Complex object with 0 for b. Also provide the getRealPart() and
getImaginaryPart()
methods for returning the real part and the imaginary part
of the complex number, respectively.
 */

package chapter13.exercises.Exercise_13_17;

import org.jetbrains.annotations.NotNull;

public class Complex implements Cloneable, Comparable<Complex> {
    private final static double I = Math.sqrt(1) * -1;
    private double a;
    private double b;

    public Complex() {
        this(1, 0);
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex other) {
        return new Complex(this.getRealPart() + other.getRealPart(),
                this.getImaginaryPart() + other.getImaginaryPart());
    }

    public Complex subtract(Complex other) {
        return new Complex(this.getRealPart() - other.getRealPart(),
                this.getImaginaryPart() - other.getImaginaryPart());
    }

    public Complex multiply(Complex other) {
        return new Complex(this.getRealPart() * other.getRealPart() -
                this.getImaginaryPart() * other.getImaginaryPart(),
                this.getImaginaryPart() * other.getRealPart() +
                        this.getRealPart() * other.getImaginaryPart());
    }

    public Complex divide(Complex other) {
        return new Complex((this.getRealPart() * other.getRealPart() +
                this.getImaginaryPart() * other.getImaginaryPart()) /
                (other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart()),
                (this.getImaginaryPart() * other.getRealPart() -
                        this.getRealPart() * other.getImaginaryPart()) /
                        (other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart())
        );
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        if (b == 0) {
            return a + "";
        } else {
            return a + " + " + b + "i";
        }
    }

    public Complex clone() {
        return new Complex(a, b);
    }


    @Override
    public int compareTo(@NotNull Complex o) {
        return this.abs() > o.abs() ? 1 : (this.abs() < o.abs() ? -1 : 0);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }


}
