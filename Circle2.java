package chapter_13;

public class Circle2 extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return this.radius == ((Circle) obj).radius;
        }
        return false;
    }
}























