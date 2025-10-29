package chapter_3;
import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double height = feet * 12 + inches;
        double weightKg = weight * 0.45359237;
        double heightMeters = height * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);

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
