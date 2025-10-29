package chapter_4;

public class RandomTriangleOnCircle {
    public static void main(String[] args) {
        final double RADIUS = 40;

        double[] angle = new double[3];
        double[][] points = new double[3][2];

        for (int i = 0; i < 3; i++) {
            angle[i] = Math.random() * 2 * Math.PI;
            points[i][0] = RADIUS * Math.cos(angle[i]);
            points[i][1] = RADIUS * Math.sin(angle[i]);
        }

        double a = distance(points[1], points[2]);
        double b = distance(points[0], points[2]);
        double c = distance(points[0], points[1]);

        double angleA = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
        double angleB = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
        double angleC = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));

        System.out.printf("Angle A: %.2f degrees%n", angleA);
        System.out.printf("Angle B: %.2f degrees%n", angleB);
        System.out.printf("Angle C: %.2f degrees%n", angleC);
    }

    private static double distance(double[] p1, double[] p2) {
        double dx = p1[0] - p2[0];
        double dy = p1[1] - p2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
