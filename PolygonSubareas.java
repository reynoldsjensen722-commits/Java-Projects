package chapter_8;

import java.util.Arrays;
import java.util.Scanner;

public class PolygonSubareas {

    public static double triangleArea(double[] p1, double[] p2, double[] p3) {
        return Math.abs(
            p1[0] * (p2[1] - p3[1]) +
            p2[0] * (p3[1] - p1[1]) +
            p3[0] * (p1[1] - p2[1])
        ) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int i = 0; i < 4; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // Step 1: compute center point
        double cx = 0, cy = 0;
        for (int i = 0; i < 4; i++) {
            cx += points[i][0];
            cy += points[i][1];
        }
        cx /= 4;
        cy /= 4;
        double[] center = {cx, cy};

        // Step 2: calculate 4 triangle areas
        double[] areas = new double[4];
        for (int i = 0; i < 4; i++) {
            double[] p1 = points[i];
            double[] p2 = points[(i + 1) % 4];
            areas[i] = triangleArea(p1, p2, center);
        }

        Arrays.sort(areas);

        // Step 3: print areas
        System.out.print("The areas are ");
        for (double a : areas) {
            System.out.printf("%.2f ", a);
        }
        System.out.println();

        input.close();
    }
}

