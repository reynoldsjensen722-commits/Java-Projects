package chapter_2;

import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        double birthsPerSecond = 1.0 / 7;
        double deathsPerSecond = 1.0 / 13;
        double immigrantsPerSecond = 1.0 / 45;

        double netChangePerSecond = birthsPerSecond - deathsPerSecond + immigrantsPerSecond;
        double secondsPerYear = 60 * 60 * 24 * 365;
        double netChangePerYear = netChangePerSecond * secondsPerYear;

        double currentPopulation = 312032486;
        double futurePopulation = currentPopulation + (netChangePerYear * years);

        System.out.println("The population in " + years + " years is " + (int)futurePopulation);

        input.close();
    }
}