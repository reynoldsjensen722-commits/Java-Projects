package chapter_8;

import java.util.Scanner;

public class TriangleArea {

    public static double getTriangleArea(double[][] points) {
        double x1 = points[0][0], y1 = points[0][1];
        double x2 = points[1][0], y2 = points[1][1];
        double x3 = points[2][0], y3 = points[2][1];

        double area = Math.abs(
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        ) / 2;

        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < 3; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double area = getTriangleArea(points);

        if (area == 0)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %.3f\n", area);

        input.close();
    }
}

