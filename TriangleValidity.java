package chapter_3;
import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edges (a b c): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean valid = a + b > c && a + c > b && b + c > a;

        if (valid)
            System.out.println("Perimeter is " + (a + b + c));
        else
            System.out.println("Input is invalid");

        input.close();
    }
}
