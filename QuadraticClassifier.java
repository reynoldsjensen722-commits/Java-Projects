package chapter_3;
import java.util.Scanner;

public class QuadraticClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
            input.close();
            return;
        }

        double disc = b*b - 4*a*c;

        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2*a);
            double r2 = (-b - Math.sqrt(disc)) / (2*a);
            System.out.println("Two roots: " + r1 + " and " + r2);
        } else if (disc == 0) {
            double r = -b / (2*a);
            System.out.println("One root: " + r);
        } else {
            System.out.println("No real roots");
        }

        input.close();
    }
}
