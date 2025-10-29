package chapter_13;

public class Rectangle2 extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle2(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return this.getArea() == ((Rectangle) obj).getArea();
        }
        return false;
    }
}



















