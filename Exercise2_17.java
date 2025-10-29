package chapter_2;

import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58 and 41: ");
        double tempF = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74
                + 0.6215 * tempF
                - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * tempF * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is " + windChill);

        input.close();
    }
}