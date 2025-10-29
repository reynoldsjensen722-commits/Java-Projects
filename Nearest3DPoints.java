package chapter_8;

public class Nearest3DPoints {

    public static double distance(double[] p1, double[] p2) {
        double dx = p2[0] - p1[0];
        double dy = p2[1] - p1[1];
        double dz = p2[2] - p1[2];
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {
        // Given set of 3D points
        double[][] points = {
            {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
            {-1.5, 4, 2}, {5.5, 4, -0.5}
        };

        int p1 = 0, p2 = 1;
        double minDistance = distance(points[p1], points[p2]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = distance(points[i], points[j]);
                if (d < minDistance) {
                    p1 = i;
                    p2 = j;
                    minDistance = d;
                }
            }
        }

        System.out.printf("The closest two points are:\n");
        System.out.printf("(%f, %f, %f) and (%f, %f, %f)\n",
            points[p1][0], points[p1][1], points[p1][2],
            points[p2][0], points[p2][1], points[p2][2]);
        System.out.printf("Their distance is %.6f\n", minDistance);
    }
}

