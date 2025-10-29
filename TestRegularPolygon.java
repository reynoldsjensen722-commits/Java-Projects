package chapter_9;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        displayPolygon(poly1, "Polygon 1 (default)");
        displayPolygon(poly2, "Polygon 2 (6 sides, side=4)");
        displayPolygon(poly3, "Polygon 3 (10 sides, side=4, center=(5.6, 7.8))");
    }

    public static void displayPolygon(RegularPolygon poly, String label) {
        System.out.println(label);
        System.out.printf("Perimeter: %.2f\n", poly.getPerimeter());
        System.out.printf("Area: %.2f\n\n", poly.getArea());
    }
}
