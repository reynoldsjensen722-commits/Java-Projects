package chapter_3;
import java.util.Scanner;

public class ZodiacChinese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String animal = switch (year % 12) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> "Unknown";
        };

        System.out.println("Chinese Zodiac: " + animal);

        input.close();
    }
}

