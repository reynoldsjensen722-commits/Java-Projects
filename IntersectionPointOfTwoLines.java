package chapter_3;
import java.util.Scanner;

public class IntersectionPointOfTwoLines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Line 1 through (x1, y1) and (x2, y2)
        // Line 2 through (x3, y3) and (x4, y4)
        System.out.print("Enter x1 y1 x2 y2 x3 y3 x4 y4: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        double x4 = input.nextDouble(), y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double c = (y3 - y4);
        double d = (x4 - x3);

        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        double det = a * d - b * c;

        if (Math.abs(det) < 1e-12) {
            System.out.println("The two lines are parallel");
        } else {
            double x = (e * d - b * f) / det;
            double y = (a * f - e * c) / det;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }

        input.close();
    }
}
