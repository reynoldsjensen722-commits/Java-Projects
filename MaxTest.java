package chapter_13;

public class MaxTest {
    public static void main(String[] args) {
        GeometricObject t1 = new Triangle(3, 4, 5);
        GeometricObject t2 = new Triangle(6, 8, 10);

        GeometricObject larger = GeometricObject.max(t1, t2);

        System.out.println("Triangle 1 area: " + t1.getArea());
        System.out.println("Triangle 2 area: " + t2.getArea());
        System.out.println("Larger triangle: " + larger);
    }
}














