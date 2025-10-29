package chapter_3;
import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Circle centered at (0, 0) with radius 10
        System.out.print("Enter a point with two coordinates (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= 10)
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");

        input.close();
    }
}
