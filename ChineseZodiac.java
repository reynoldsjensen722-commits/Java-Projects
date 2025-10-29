package chapter_7;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] zodiac = {
            "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
            "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"
        };

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println("The Chinese Zodiac for year " + year + " is: " + zodiac[year % 12]);

        input.close();
    }
}
