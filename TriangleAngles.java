package chapter_4;
import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = distance(x2, y2, x3, y3);
        double b = distance(x1, y1, x3, y3);
        double c = distance(x1, y1, x2, y2);

        double A = angle(a, b, c);
        double B = angle(b, a, c);
        double C = angle(c, a, b);

        System.out.println("The three angles are: ");
        System.out.printf("%.2f %.2f %.2f%n", A, B, C);

        input.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double angle(double opposite, double side1, double side2) {
        double cosTheta = (Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(opposite, 2)) / (2 * side1 * side2);
        return Math.toDegrees(Math.acos(cosTheta));
    }
}
