package chapter_13;

public class Batch2Test {
    public static void main(String[] args) {
        // Test ComparableCircle
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(3);
        System.out.println("Larger circle: " + (c1.compareTo(c2) > 0 ? "c1" : "c2"));

        // Test Colorable
        GeometricObject[] objects = {
            new Square(5),
            new Circle(4),
            new Square(3),
            new Rectangle(3, 4),
            new Square(7)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable)
                ((Colorable) obj).howToColor();
        }

        // Test MyStack clone
        MyStack s1 = new MyStack();
        s1.push("A");
        s1.push("B");
        MyStack s2 = s1.clone();
        s1.pop();
        System.out.println("Original stack: " + s1);
        System.out.println("Cloned stack: " + s2);

        // Test equals on Circle and Rectangle
        Circle cc1 = new Circle(3);
        Circle cc2 = new Circle(3);
        System.out.println("Circle equal? " + cc1.equals(cc2));

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(6, 2);
        System.out.println("Rectangle equal? " + r1.equals(r2));
    }
}














