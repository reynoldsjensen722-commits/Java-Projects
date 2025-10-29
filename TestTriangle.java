package chapter_12;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(3, 4, 5);
            System.out.println(t1);
            System.out.println("Area: " + t1.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Triangle t2 = new Triangle(1, 2, 10); // Invalid
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
