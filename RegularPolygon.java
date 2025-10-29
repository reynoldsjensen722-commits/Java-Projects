package chapter_9;

public class RegularPolygon {
    private int n;         // Number of sides
    private double side;   // Length of each side
    private double x;      // X-coordinate of center
    private double y;      // Y-coordinate of center

    // No-arg constructor: default polygon (triangle at origin)
    public RegularPolygon() {
        this(3, 1.0, 0.0, 0.0);
    }

    // Constructor: n sides, side length
    public RegularPolygon(int n, double side) {
        this(n, side, 0.0, 0.0);
    }

    // Constructor: full
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Area: (n × s²) / (4 × tan(π/n))
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
