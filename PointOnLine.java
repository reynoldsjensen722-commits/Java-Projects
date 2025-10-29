package chapter_3;
import java.util.Scanner;

public class PointOnLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Check if a point (x, y) is on the line through (x0, y0) and (x1, y1)
        System.out.print("Enter x0 y0 x1 y1 x2 y2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Using cross product to test collinearity
        double cross = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (Math.abs(cross) < 1e-9)
            System.out.println("Point (" + x2 + ", " + y2 + ") is on the line segment");
        else
            System.out.println("Point (" + x2 + ", " + y2 + ") is not on the line segment");

        input.close();
    }
}

