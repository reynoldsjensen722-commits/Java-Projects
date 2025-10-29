package chapter_2;

import java.util.Scanner;

public class Exercise2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        double cost = (distance / mpg) * price;
        System.out.println("The cost of driving is " + cost);

        input.close();
    }
}
