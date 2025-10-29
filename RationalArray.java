package chapter_13;

public class RationalArray {
    private long[] r = new long[2]; // r[0] = numerator, r[1] = denominator

    public RationalArray(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }
}





















