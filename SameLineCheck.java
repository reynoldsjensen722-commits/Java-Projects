package chapter_8;

import java.util.Scanner;

public class SameLineCheck {

    public static boolean sameLine(double[][] points) {
        double x0 = points[0][0], y0 = points[0][1];
        double x1 = points[1][0], y1 = points[1][1];

        for (int i = 2; i < points.length; i++) {
            double x2 = points[i][0], y2 = points[i][1];

            // Check using cross product method
            if ((x1 - x0) * (y2 - y0) != (x2 - x0) * (y1 - y0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        if (sameLine(points)) {
            System.out.println("The five points are on the same line");
        } else {
            System.out.println("The five points are not on the same line");
        }

        input.close();
    }
}

