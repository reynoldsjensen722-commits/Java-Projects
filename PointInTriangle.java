package chapter_3;
import java.util.Scanner;

public class PointInTriangle {
    // Uses area method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter triangle vertices x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();

        System.out.print("Enter point x y: ");
        double x = input.nextDouble(), y = input.nextDouble();

        double A = area(x1, y1, x2, y2, x3, y3);
        double A1 = area(x, y, x2, y2, x3, y3);
        double A2 = area(x1, y1, x, y, x3, y3);
        double A3 = area(x1, y1, x2, y2, x, y);

        boolean inside = Math.abs((A1 + A2 + A3) - A) < 1e-7;

        System.out.println("Point (" + x + ", " + y + ") is " + (inside ? "" : "not ") + "in the triangle");
        input.close();
    }

    private static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0);
    }
}
