package chapter_13;

public class Complex implements Cloneable, Comparable<Complex> {
    private double a;
    private double b;

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex c) {
        return new Complex(a + c.a, b + c.b);
    }

    public Complex subtract(Complex c) {
        return new Complex(a - c.a, b - c.b);
    }

    public Complex multiply(Complex c) {
        return new Complex(a * c.a - b * c.b, b * c.a + a * c.b);
    }

    public Complex divide(Complex c) {
        double denom = c.a * c.a + c.b * c.b;
        return new Complex((a * c.a + b * c.b) / denom, (b * c.a - a * c.b) / denom);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public int compareTo(Complex c) {
        return Double.compare(this.abs(), c.abs());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        if (b == 0) return a + "";
        return a + " + " + b + "i";
    }
}




















