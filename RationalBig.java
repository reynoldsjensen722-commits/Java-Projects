package chapter_13;

import java.math.BigInteger;

public class RationalBig extends Number implements Comparable<RationalBig> {
    private BigInteger numerator;
    private BigInteger denominator;

    public RationalBig(BigInteger num, BigInteger den) {
        if (den.equals(BigInteger.ZERO))
            throw new ArithmeticException("Denominator cannot be zero");

        BigInteger gcd = num.gcd(den);
        numerator = (den.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(num).divide(gcd);
        denominator = den.abs().divide(gcd);
    }

    public RationalBig(long n, long d) {
        this(BigInteger.valueOf(n), BigInteger.valueOf(d));
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public RationalBig add(RationalBig second) {
        BigInteger num = numerator.multiply(second.denominator).add(denominator.multiply(second.numerator));
        BigInteger den = denominator.multiply(second.denominator);
        return new RationalBig(num, den);
    }

    public RationalBig subtract(RationalBig second) {
        BigInteger num = numerator.multiply(second.denominator).subtract(denominator.multiply(second.numerator));
        BigInteger den = denominator.multiply(second.denominator);
        return new RationalBig(num, den);
    }

    public RationalBig multiply(RationalBig second) {
        return new RationalBig(numerator.multiply(second.numerator), denominator.multiply(second.denominator));
    }

    public RationalBig divide(RationalBig second) {
        return new RationalBig(numerator.multiply(second.denominator), denominator.multiply(second.numerator));
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator.toString();
        else
            return numerator + "/" + denominator;
    }

    @Override
    public int compareTo(RationalBig o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }

    @Override
    public int intValue() { return numerator.divide(denominator).intValue(); }
    @Override
    public long longValue() { return numerator.divide(denominator).longValue(); }
    @Override
    public float floatValue() { return numerator.divide(denominator).floatValue(); }
    @Override
    public double doubleValue() { return numerator.doubleValue() / denominator.doubleValue(); }
}








