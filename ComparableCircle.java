package chapter_13;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
















