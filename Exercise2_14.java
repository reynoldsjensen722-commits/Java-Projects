package chapter_2;

import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        double weight = pounds * 0.45359237;

        System.out.print("Enter your height in inches: ");
        double inches = input.nextDouble();
        double height = inches * 0.0254;

        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);

        input.close();
    }
}