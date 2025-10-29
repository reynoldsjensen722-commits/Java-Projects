package chapter_8;

import java.util.Scanner;

public class LineIntersection {

    public static double[] getIntersectingPoint(double[][] points) {
        double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];
        double x3 = points[2][0], y3 = points[2][1];
        double x4 = points[3][0], y4 = points[3][1];

        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = a1 * x1 + b1 * y1;

        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = a2 * x3 + b2 * y3;

        double det = a1 * b2 - a2 * b1;

        if (det == 0) return null; // lines are parallel

        double x = (c1 * b2 - c2 * b1) / det;
        double y = (a1 * c2 - a2 * c1) / det;

        return new double[]{x, y};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.println("Enter four points (x1 y1 x2 y2 x3 y3 x4 y4):");
        for (int i = 0; i < 4; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double[] intersection = getIntersectingPoint(points);

        if (intersection == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.3f, %.3f)\n", intersection[0], intersection[1]);
        }

        input.close();
    }
}

