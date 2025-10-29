package chapter_3;
import java.util.Scanner;

public class BMIWeightCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightKg = weight * 0.45359237;
        double heightM = height * 0.0254;
        double bmi = weightKg / (heightM * heightM);

        System.out.printf("BMI is %.2f%n", bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}

