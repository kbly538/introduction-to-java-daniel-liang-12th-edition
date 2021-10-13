/*
(Demonstrate the benefits of encapsulation) Rewrite the Rational class in Listing
13.13 using a new internal representation for the r[0 and r[1.
Create
an array of two integers as follows:
private BigInteger[] r = new BigInteger[2];
Use r[0] to represent the r[0 and r[1] to represent the r[1. The
signatures of the methods in the Rational class are not changed, so a client application
that uses the previous Rational class can continue to use this new Rational
class without being recompiled.
 */
package chapter13.exercises.Exercise_13_14;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger[] r = new BigInteger[2];

    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }


    public Rational(BigInteger n, BigInteger d) {
        BigInteger gcd = gcd(n, d);
        this.r[0] = (d.compareTo(BigInteger.ZERO) == 1 ? BigInteger.ONE : BigInteger.ONE.multiply(new BigInteger("-1"))).multiply(n.divide(gcd));
        this.r[1] = d.abs().divide(gcd);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public BigDecimal bigDecimalValue() {
        BigDecimal x = new BigDecimal(r[0]);
        BigDecimal y = new BigDecimal(r[1]);
        return x.divide(y, 21, RoundingMode.FLOOR);
    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDenominator() {
        return r[1];
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).subtract(
                r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational add(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).add(
                r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == BigInteger.ONE) {
            return r[0] + "";
        }
        return r[0] + " / " + r[1];
    }

    private BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger d1 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE;
             k.compareTo(n1) == -1 || k.compareTo(n1) == 0
                     && k.compareTo(d1) == -1 || k.compareTo(d1) == 0;
             k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0
                    && d1.remainder(k).compareTo(BigInteger.ZERO) == 0)
                gcd = k;
        }

        return gcd;
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational) (o))).getNumerator().compareTo(BigInteger.ZERO) == 0)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r[0], r[1]);
    }

}
