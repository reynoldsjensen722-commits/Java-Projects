package chapter_8;

import java.util.Scanner;

public class RightmostLowestPoint {

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] best = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < best[1] || 
                (points[i][1] == best[1] && points[i][0] > best[0])) {
                best = points[i];
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];

        System.out.print("Enter 6 points: ");
        for (int i = 0; i < 6; i++) {
            points[i][0] = input.nextDouble(); // x
            points[i][1] = input.nextDouble(); // y
        }

        double[] result = getRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)\n",
                          result[0], result[1]);

        input.close();
    }
}

