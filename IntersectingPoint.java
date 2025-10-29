package chapter_9;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four endpoints (x1 y1 x2 y2 x3 y3 x4 y4):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate coefficients for system
        double a = y1 - y2;
        double b = x2 - x1;
        double e = a * x1 + b * y1;

        double c = y3 - y4;
        double d = x4 - x3;
        double f = c * x3 + d * y3;

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            double x = eq.getX();
            double y = eq.getY();
            System.out.printf("The intersecting point is at (%.2f, %.2f)\n", x, y);
        } else {
            System.out.println("The two lines are parallel. No intersection.");
        }

        input.close();
    }
}

