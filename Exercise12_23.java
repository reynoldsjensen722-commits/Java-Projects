package chapter_12;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Scores.txt";

        double sum = 0;
        int count = 0;

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNextDouble()) {
                sum += input.nextDouble();
                count++;
            }

            System.out.printf("Total: %.2f\n", sum);
            System.out.printf("Average: %.2f\n", (count > 0 ? sum / count : 0));
        } catch (Exception e) {
            System.out.println("Could not read from web: " + e.getMessage());
        }
    }
}

