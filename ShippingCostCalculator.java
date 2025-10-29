package chapter_3;
import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in pounds: ");
        double w = input.nextDouble();

        double cost;
        if (w <= 0) {
            System.out.println("Invalid weight");
            input.close();
            return;
        } else if (w <= 1) cost = 3.5;
        else if (w <= 3) cost = 5.5;
        else if (w <= 10) cost = 8.5;
        else if (w <= 20) cost = 10.5;
        else {
            System.out.println("The package cannot be shipped");
            input.close();
            return;
        }

        System.out.println("Shipping cost is $" + cost);
        input.close();
    }
}
