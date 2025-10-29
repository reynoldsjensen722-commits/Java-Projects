package chapter_8;

import java.util.Scanner;

public class CentralCity {

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get city count
        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();

        double[][] cities = new double[n][2];

        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < n; i++) {
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        // Step 2: Find total distances
        double minTotalDist = Double.MAX_VALUE;
        int centralCity = -1;

        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum += distance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
                }
            }

            if (sum < minTotalDist) {
                minTotalDist = sum;
                centralCity = i;
            }
        }

        // Step 3: Output
        System.out.printf("The central city is at (%.1f, %.1f)\n",
                          cities[centralCity][0], cities[centralCity][1]);
        System.out.printf("The total distance to all other cities is %.2f\n", minTotalDist);

        input.close();
    }
}

