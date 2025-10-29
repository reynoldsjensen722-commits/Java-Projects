package chapter_8;

import java.util.ArrayList;
import java.util.Scanner;

public class ClosestPairs {

    public static double distance(double[] p1, double[] p2) {
        double dx = p2[0] - p1[0];
        double dy = p2[1] - p1[1];
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        double[][] points = new double[n][2];

        System.out.println("Enter " + n + " points:");
        for (int i = 0; i < n; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            input.close();
        }

        double minDist = Double.MAX_VALUE;
        ArrayList<int[]> closestPairs = new ArrayList<>();

        // First pass: find min distance
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double d = distance(points[i], points[j]);
                if (d < minDist) {
                    minDist = d;
                    closestPairs.clear();
                    closestPairs.add(new int[]{i, j});
                } else if (d == minDist) {
                    closestPairs.add(new int[]{i, j});
                }
            }
        }

        // Output
        for (int[] pair : closestPairs) {
            int i = pair[0], j = pair[1];
            System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",
                points[i][0], points[i][1],
                points[j][0], points[j][1]);
        }
        System.out.printf("Their distance is %.15f\n", minDist);
    }
}

